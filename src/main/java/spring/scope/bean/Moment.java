package spring.scope.bean;

import java.util.Date;

public class Moment {
	
	Date dateTime;
	
	public Moment() {
		dateTime = new Date();
	}
	
	public Date etDateTime() {
		return dateTime;
	}

}
