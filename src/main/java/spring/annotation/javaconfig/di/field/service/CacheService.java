package spring.annotation.javaconfig.di.field.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.annotation.javaconfig.di.field.bean.CacheComponent;

@Component
public class CacheService {

	@Autowired
	CacheComponent cacheComponent;
	
	public void store(String key, String value) {
		cacheComponent.store(key, value);
	}
	
	public String get(String key) {
		return cacheComponent.get(key);
	}
}
