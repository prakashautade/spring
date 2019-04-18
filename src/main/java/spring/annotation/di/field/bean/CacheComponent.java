package spring.annotation.di.field.bean;

import org.springframework.stereotype.Component;

@Component
public interface CacheComponent {
	void store(String key, String value);
	String get(String key);
}
