package spring.annotation.di.field.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class Memcache implements CacheComponent {

	private Map<String, String> cache = new HashMap<>();
	
	@Override
	public void store(String key, String value) {
		cache.put(key, value);
	}

	@Override
	public String get(String key) {
		return cache.get(key);
	}
	
}
