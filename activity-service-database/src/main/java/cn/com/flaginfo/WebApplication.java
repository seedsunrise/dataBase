package cn.com.flaginfo;

import cn.com.flaginfo.dbconfig.MyAbstractRoutingDataSource;
import cn.com.flaginfo.diamond.DiamondProperties;
import cn.com.flaginfo.enums.DataSourceEnums;
import cn.com.flaginfo.utils.PropertiesSourceInitializer;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("cn.com.flaginfo.dao")
public class WebApplication implements EmbeddedServletContainerCustomizer {


	/**定义默认数据库类型**/
	@Value("${spring.datasource.type}")
	private Class<? extends DataSource> dataSourceType;

	@Value("${datasource.readSize}")
	private String dataSourceSize;
	@Resource(name = "writeDataSource")
	private DataSource dataSource;
	@Resource(name = "readDataSources")
	private List<DataSource> readDataSources;


	/**
	 * 初始化默认数据源
	 * @return
	 * @throws Exception
	 */
	@Bean
	@ConditionalOnMissingBean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(roundRobinDataSouceProxy());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));
		sqlSessionFactoryBean.getObject().getConfiguration().setMapUnderscoreToCamelCase(true);
		return sqlSessionFactoryBean.getObject();
	}

	/**
	 * 有多少个数据源就要配置多少个bean
	 * @return
	 */
	@Bean
	public AbstractRoutingDataSource roundRobinDataSouceProxy() {
		int size = Integer.parseInt(dataSourceSize);
		MyAbstractRoutingDataSource proxy = new MyAbstractRoutingDataSource(size);
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		// DataSource writeDataSource = SpringContextHolder.getBean("writeDataSource");
		// 写
		targetDataSources.put(DataSourceEnums.write.getType(),dataSource);
		// targetDataSources.put(DataSourceType.read.getType(),readDataSource);
		//多个读数据库时
		for (int i = 0; i < size; i++) {
			targetDataSources.put(i, readDataSources.get(i));
		}
		proxy.setDefaultTargetDataSource(dataSource);
		proxy.setTargetDataSources(targetDataSources);
		return proxy;
	}

	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(WebApplication.class);
     	sa.addInitializers(new PropertiesSourceInitializer());
		sa.run(args);
		//放开注释代码以及application.properties中的注释配置 用于注册在eureka上进行调用，
		//调用方式如http://10.0.0.132:8762/signin-service/location/addLocation
		//com.netflix.discovery.EurekaClient e;
	}


	/***
	 * 配置中心获取启动端口
	 * @param container
	 */
	@Override
	public void customize(ConfigurableEmbeddedServletContainer container) {

		container.setPort(Integer.valueOf(DiamondProperties.getInstance().getProperty("server.port")));
	}

}
