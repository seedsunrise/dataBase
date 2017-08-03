package cn.com.flaginfo.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class SpringApplicationContextHolder implements ApplicationContextAware {
	private static ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		  SpringApplicationContextHolder.context = applicationContext;
	}
	 public static Object getSpringBean(String beanName) {
	        return context==null?null:context.getBean(beanName);
	    }

	    public static String[] getBeanDefinitionNames() {
	        return context.getBeanDefinitionNames();
	    }

}
