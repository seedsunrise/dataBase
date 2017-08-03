package cn.com.flaginfo.dbconfig;

import java.util.concurrent.atomic.AtomicInteger;

import cn.com.flaginfo.enums.DataSourceEnums;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 数据库路由
 * @author 周涛
 *
 */
public class MyAbstractRoutingDataSource extends AbstractRoutingDataSource{

	private final int dataSourceNumber;  
    private AtomicInteger count = new AtomicInteger(0);  
  
    public MyAbstractRoutingDataSource(int dataSourceNumber) {  
        this.dataSourceNumber = dataSourceNumber;  
    }  

	@Override
	protected Object determineCurrentLookupKey() {
		String typeKey = DataSourceContextHolder.getJdbcType();  
        if (typeKey.equals(DataSourceEnums.write.getType()))
            return DataSourceEnums.write.getType();  
        // 读 简单负载均衡  
        int number = count.getAndAdd(1);  
        int lookupKey = number % dataSourceNumber;  
        return new Integer(lookupKey);  
	}

}
