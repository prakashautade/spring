package spring.annotation.javaconfig.di.field.bean;

public interface CacheComponent {
	public void store(String key, String value);
	public String get(String key);
}
