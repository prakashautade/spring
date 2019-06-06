package spring.annotation.javaconfig.di.propertiesfile.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring.annotation.javaconfig.di.propertiesfile")
@PropertySource("classpath:device.properties")
public class JavaConfigDIPropertiesFile {

}
