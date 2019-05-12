package spring.annotation.di.qualifier.bean;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class TimeFormat24Hrs implements TimeFormat {

	@Override
	public String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		return dateFormat.format(new Date());
	}

}
