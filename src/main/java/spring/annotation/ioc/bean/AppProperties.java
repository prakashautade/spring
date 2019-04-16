package spring.annotation.ioc.bean;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component("applicationProperties")
public class AppProperties {
	
	private String name;
	private String version;
	private Date lastRelease;
	
	public AppProperties() {
		name = "Spring Annotation Demo";
		version = "1.0";
		lastRelease = new Date();		
	}
	
	@Override
	public String toString() {
		return "AppProperties [name=" + name + ", version=" + version + ", lastRelease=" + lastRelease + "]";
	}
	
}
