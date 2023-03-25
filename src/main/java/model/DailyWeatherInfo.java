package model;



import model.openweather.Daily;


public class DailyWeatherInfo {
	
	private final long dt;
	private final String timezone;
	private final String temp_morn;
	private final String temp_day;
	private final String temp_eve;
	private final String temp_night;
	private final String min;
	private final String max;
	private final String uvi;
	private final String clouds;
	private final String humidity;
	private final String dew_point;
	private final String wind_speed;
	private final String wind_deg; 
	private final String feels_like_day;  
	private final String feels_like_night;
	private final String feels_like_eve;
	private final String feels_like_morn;
	private final String pop;
	private final String weather_description;


	
	public DailyWeatherInfo(long dt, String timezone, String temp_morn, String temp_day, String temp_eve,
			String temp_night, String min, String max, String uvi, String clouds, String humidity, String dew_point,
			String wind_speed, String wind_deg, String feels_like_day, String feels_like_night, String feels_like_eve,
			String feels_like_morn, String pop, String weather_description) {
		this.dt = dt;
		this.timezone = timezone;
		this.temp_morn = temp_morn;
		this.temp_day = temp_day;
		this.temp_eve = temp_eve;
		this.temp_night = temp_night;
		this.min = min;
		this.max = max;
		this.uvi = uvi;
		this.clouds = clouds;
		this.humidity = humidity;
		this.dew_point = dew_point;
		this.wind_speed = wind_speed;
		this.wind_deg = wind_deg;
		this.feels_like_day = feels_like_day;
		this.feels_like_night = feels_like_night;
		this.feels_like_eve = feels_like_eve;
		this.feels_like_morn = feels_like_morn;
		this.pop = pop;
		this.weather_description = weather_description;
	}





	public DailyWeatherInfo(Daily result, String timezone) {
		this.dt = result.getDt();
		this.timezone = timezone;
		this.temp_morn = result.getTemp().getMorn().toString();
		this.temp_day = result.getTemp().getDay().toString();
		this.temp_eve = result.getTemp().getEve().toString();
		this.temp_night = result.getTemp().getNight().toString();
		this.min = result.getTemp().getMin().toString();
		this.max = result.getTemp().getMax().toString();
		this.uvi = result.getUvi().toString();
		this.clouds = result.getClouds().toString();
		this.dew_point = result.getDewPoint().toString();
		this.humidity = result.getHumidity().toString();
		this.wind_speed = result.getWindSpeed().toString();
		this.wind_deg = result.getWindDeg().toString();
		this.feels_like_day = result.getFeelsLike().getDay().toString();
		this.feels_like_night = result.getFeelsLike().getNight().toString();
		this.feels_like_eve = result.getFeelsLike().getEve().toString();
		this.feels_like_morn = result.getFeelsLike().getMorn().toString();
		this.pop = result.getPop().toString();
		this.weather_description = result.getWeather().get(0).getDescription();
	}





	public String getMin() {
		return min;
	}




	public String getMax() {
		return max;
	}




	public String getUvi() {
		return uvi;
	}




	public String getClouds() {
		return clouds;
	}




	public String getHumidity() {
		return humidity;
	}




	public String getDew_point() {
		return dew_point;
	}




	public String getWind_speed() {
		return wind_speed;
	}




	public String getWind_deg() {
		return wind_deg;
	}




	public String getFeels_like_day() {
		return feels_like_day;
	}




	public String getFeels_like_night() {
		return feels_like_night;
	}




	public String getFeels_like_eve() {
		return feels_like_eve;
	}




	public String getFeels_like_morn() {
		return feels_like_morn;
	}




	public String getPop() {
		return pop;
	}




	public String getWeather_description() {
		return weather_description;
	}




	public long getDt() {
		return dt;
	}




	public String getTimezone() {
		return timezone;
	}

	


	public String getTemp_day() {
		return temp_day;
	}





	public String getTemp_morn() {
		return temp_morn;
	}





	public String getTemp_eve() {
		return temp_eve;
	}





	public String getTemp_night() {
		return temp_night;
	}





	@Override
	public String toString() {
		TimeInfo time = new TimeInfo(timezone, dt);
		return "Daily Weather for " +  time.getTimeFromTimestamp() + "\n\n"+ 
			   "Weather: "+ weather_description + "\n"+ 
			   "Morning temperature: " + temp_morn + "      ->feels like: " + feels_like_morn +"\n"+ 
		       "Day temperature: " + temp_day +  "          ->feels like: " + feels_like_day +"\n"+ 
		       "Evening temperature:" + temp_eve + "       ->feels like: " + feels_like_eve + "\n"+
		       "Night temperature: " + temp_night + "        ->feels like: " + feels_like_night + "\n"+
		       "Min daily temperature: " + min + "\n"+
		       "Max daily temperature: " + max + "\n"+
			   "The maximum value of UV index for the day: " + uvi + "\n"+
			   "Cloudiness: " + clouds + "%" + "\n"+
			   "Humidity: " + humidity + "%" + "\n"+
			   "Probability of precipitation: " + pop + "\n"+
			   "Atmospheric temperature: " + dew_point + "\n"+
			   "Wind speed: " + wind_speed + "\n"+
			   "Wind direction: " + wind_deg +"\n\n\n" ;
	}



}
