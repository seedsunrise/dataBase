package cn.com.flaginfo.dbconfig;

import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect  
@Component 
public class DataSourceAop {
	private static Logger log = Logger.getLogger(DataSourceAop.class);
    @Before("execution(* cn.com.flaginfo.dao..*.select*(..)) || execution(* cn.com.flaginfo.dao..*.get*(..))")
    public void setReadDataSourceType() {  
        DataSourceContextHolder.read();  
        log.info("dataSource切换到：Read");  
    }  
    @Before("execution(* cn.com.flaginfo.dao..*.insert*(..)) || execution(* cn.com.flaginfo.dao..*.update*(..))")
    public void setWriteDataSourceType() {  
        DataSourceContextHolder.write();  
        log.info("dataSource切换到：write");  
    }  
}
