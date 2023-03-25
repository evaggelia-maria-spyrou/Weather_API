package model;



import model.openweather.Current;


public class CurrentWeatherInfo {

	private final long dt;
	private final String timezone;
	private final String temp;
	private final String uvi;
	private final String clouds;
	private final String dew_point;
	private final String humidity;
	private final String wind_speed;
	private final String wind_deg;
	private final String feels_like;
	private final String visibility;
	private final String weather_description;
	


	public CurrentWeatherInfo(long dt, String timezone, String temp, String uvi, String clouds, String dew_point,
			String humidity, String wind_speed, String wind_deg, String feels_like, String visibility, String weather_description) {
		this.dt = dt;
		this.timezone = timezone;
		this.temp = temp;
		this.uvi = uvi;
		this.clouds = clouds;
		this.dew_point = dew_point;
		this.humidity = humidity;
		this.wind_speed = wind_speed;
		this.wind_deg = wind_deg;
		this.feels_like = feels_like;
		this.visibility = visibility;
		this.weather_description = weather_description;
	}


	public CurrentWeatherInfo(Current result, String timezone) {
		this.dt = result.getDt();
		this.timezone = timezone;
		this.temp = result.getTemp().toString();
		this.uvi = result.getUvi().toString();
		this.clouds = result.getClouds().toString();
		this.dew_point = result.getDewPoint().toString();
		this.humidity = result.getHumidity().toString();
		this.wind_speed = result.getWindSpeed().toString();
		this.wind_deg = result.getWindDeg().toString();
		this.feels_like = result.getFeelsLike().toString();
		this.visibility = result.getVisibility().toString();
		this.weather_description = result.getWeather().get(0).getDescription();
	}



	public String getTemp() {
		return temp;
	}


	public String getUvi() {
		return uvi;
	}


	public String getClouds() {
		return clouds;
	}


	public String getDew_point() {
		return dew_point;
	}


	public String getHumidity() {
		return humidity;
	}


	public String getWind_speed() {
		return wind_speed;
	}


	public String getWind_deg() {
		return wind_deg;
	}


	public String getFeels_like() {
		return feels_like;
	}


	public String getVisibility() {
		return visibility;
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


	@Override
	public String toString() {
		TimeInfo time = new TimeInfo(timezone, dt);
		return  time.getTimeFromTimestamp() + "\n\n" + 
		        "Weather: " + weather_description + "\n" +
		        "Temperature: " + temp + "\n" +
		        "Temperature feels like: " + feels_like + "\n" +
		        "UV index: " + uvi + "\n" + 
		        "Cloudiness: " + clouds + "%" + "\n" +
				"Atmospheric temperature: " + dew_point + "\n" +
				"Humidity: " + humidity + "%" + "\n" + 
				"Wind speed: " + wind_speed + "\n" +
				"Wind direction: " + wind_deg + " degrees" + "\n" +
				 "Average visibility: " + visibility + " metres";
	}
	
	


}
