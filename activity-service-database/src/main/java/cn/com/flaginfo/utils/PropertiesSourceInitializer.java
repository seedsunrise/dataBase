package cn.com.flaginfo.utils;

import cn.com.flaginfo.diamond.DiamondProperties;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class PropertiesSourceInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    public PropertiesSourceInitializer() {
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        DiamondProperties.initInstance(applicationContext.getEnvironment());
    }


}
