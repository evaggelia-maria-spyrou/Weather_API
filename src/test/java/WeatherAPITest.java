import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cloudmersive.client.invoker.ApiException;

import exception.WeatherAPIException;
import model.DailyWeatherInfo;
import model.HourlyWeatherInfo;
import model.WeatherAPI;
import services.WeatherAPIService;

public class WeatherAPITest {

	@Test
	public void testCurrentWeatherForCityAPI() throws WeatherAPIException, IOException{
		final WeatherAPIService currentWeatherForCityService = WeatherAPI.getWeatherAPIService();
		final String results = currentWeatherForCityService.getCurrentWeatherForCity("Athens,GR","metric");
		Assert.assertFalse(results == null);
		System.out.println(results); 
	} 

	@Test
	public void testCurrentWeatherByIPAPI() throws WeatherAPIException, IOException, ApiException{
		final WeatherAPIService currentWeatherForCityService = WeatherAPI.getWeatherAPIService();
		final String results = currentWeatherForCityService.getCurrentWeatherByIP("metric");
		Assert.assertFalse(results == null);
		System.out.println(results); 
	} 
	
	@Test
	public void testDailyWeatherForCityAPI() throws WeatherAPIException{
		final WeatherAPIService dailyWeatherForCityService = WeatherAPI.getWeatherAPIService();
		final List<DailyWeatherInfo> results = dailyWeatherForCityService.getDailyWeatherForCity("Athens,GR", "metric");
		Assert.assertFalse(results.isEmpty());
		results.forEach(System.out::println);
	}
	
	@Test
	public void testHourlyWeatherForCityAPI() throws WeatherAPIException{
		final WeatherAPIService hourlyWeatherForCityService = WeatherAPI.getWeatherAPIService();
		final List<HourlyWeatherInfo> results = hourlyWeatherForCityService.getHourlyWeatherForCity("Athens,GR", "metric");
		Assert.assertFalse(results.isEmpty());
		results.forEach(System.out::println);
	}



}
