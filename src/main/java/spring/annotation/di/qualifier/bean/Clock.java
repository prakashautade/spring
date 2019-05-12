package spring.annotation.di.qualifier.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Clock {
	
	@Autowired
	@Qualifier("timeFormat24Hrs")
	TimeFormat timeFormat;
	
	public void displayTime() {
		System.out.println(timeFormat.getTime());
	}
}
