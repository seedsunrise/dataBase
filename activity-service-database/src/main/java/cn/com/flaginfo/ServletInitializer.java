package cn.com.flaginfo;

import cn.com.flaginfo.utils.PropertiesSourceInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


public class ServletInitializer extends SpringBootServletInitializer {  

    @Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
    	application.initializers(new PropertiesSourceInitializer());
        return application.sources(WebApplication.class);  
    }  
    

}  
