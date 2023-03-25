package model;

import services.WeatherAPIService;

public class WeatherAPI {
	
	public static WeatherAPIService getWeatherAPIService() {
		return new WeatherAPIService("https://api.openweathermap.org/", "ApiKey");
	}
}
