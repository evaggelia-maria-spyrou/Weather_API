package model;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeInfo {
	
	private final String timezone;
	private final long dt;
	
	
	public TimeInfo(String timezone, long dt) {
		this.timezone = timezone;
		this.dt = dt;
	}



	public String getTimezone() {
		return timezone;
	}




	public long getDt() {
		return dt;
	}



	
// get date and time from timestamp
	public String getTimeFromTimestamp() {
		
		Instant instant = Instant.ofEpochSecond( dt );
		ZoneId z = ZoneId.of( timezone );
		ZonedDateTime zdt = instant.atZone( z );
		int hour = zdt.getHour();
		int minute = zdt.getMinute();
		int sec = zdt.getSecond();
	    String date = zdt.getDayOfMonth() + "/" + zdt.getMonthValue() + "/" + zdt.getYear();
		return "Date: " + date + "\r\n" + "Time of the forecasted data: " +hour + ":" + minute + ":" + sec;
	}

}
