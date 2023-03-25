package services;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import com.cloudmersive.client.invoker.ApiException;
import com.fasterxml.jackson.databind.ObjectMapper;

import exception.WeatherAPIException;
import model.CurrentWeatherInfo;
import model.DailyWeatherInfo;
import model.GeocodingInfo;
import model.HourlyWeatherInfo;
import model.geocoding.GeocodingResult;
import model.ip.IPLocation;
import model.openweather.Current;
import model.openweather.Daily;
import model.openweather.ErrorResponse;
import model.openweather.Hourly;
import model.openweather.WeatherResult;



public class WeatherAPIService {

	private final String API_URL;
	private final String API_KEY;
	
	public WeatherAPIService(String api_url, String api_key) {
		API_URL = api_url;
		API_KEY = api_key;
	}
		
		// get current weather by city  
		public String getCurrentWeatherForCity(String p,String parameterunits) throws WeatherAPIException, IOException {
			GeocodingResult[] geoResult = getGeocodingAPIData(p, API_URL, API_KEY);
			GeocodingInfo geoInfo = new GeocodingInfo(geoResult);
			WeatherResult weatherResult = getAPIData(geoInfo.getLatitude(), geoInfo.getLongitude(), "hourly,daily,minutely", parameterunits, API_URL, API_KEY);
			String timezone = weatherResult.getTimezone();
			Current result = weatherResult.getCurrent();
			CurrentWeatherInfo currentWeatherInfo = new CurrentWeatherInfo(result, timezone); 
			return currentWeatherInfo.toString(); 
		} 
		
		// get current weather by IP
		public String getCurrentWeatherByIP (String parameterunits) throws WeatherAPIException, IOException, ApiException {
			List<String> location = IPLocation.getCoordinatesFromIP();
			WeatherResult weatherResult = getAPIData(location.get(0), location.get(1), "hourly,daily,minutely", parameterunits, API_URL, API_KEY);
			String timezone = weatherResult.getTimezone();
			Current result = weatherResult.getCurrent();
			CurrentWeatherInfo currentWeatherInfo = new CurrentWeatherInfo(result, timezone); 
			String city = location.get(2);
			return "City: " + city + "\r\n" + currentWeatherInfo.toString(); 
		}
		
		// get hourly weather forecast by city
		public List<HourlyWeatherInfo> getHourlyWeatherForCity(String p,String parameterunits) throws WeatherAPIException{
			GeocodingResult[] geoResult = getGeocodingAPIData(p, API_URL, API_KEY);
			GeocodingInfo geoInfo = new GeocodingInfo(geoResult);
			WeatherResult result = getAPIData(geoInfo.getLatitude(), geoInfo.getLongitude(), "daily,current,minutely", parameterunits, API_URL, API_KEY);
            List<HourlyWeatherInfo> hourlyWeatherInfo=new ArrayList<>(result.getHourly().size());
            String timezone = result.getTimezone();
            for (int i=0; i< result.getHourly().size(); i++) {
            	Hourly theResult = result.getHourly().get(i);
                hourlyWeatherInfo.add(new HourlyWeatherInfo(theResult, timezone));

            }
            return hourlyWeatherInfo;
        }
		
		// get daily weather forecast for the next 5 days by city
		public List<DailyWeatherInfo> getDailyWeatherForCity(String p,String parameterunits) throws WeatherAPIException {
			GeocodingResult[] geoResult = getGeocodingAPIData(p, API_URL, API_KEY);
			GeocodingInfo geoInfo = new GeocodingInfo(geoResult);
			WeatherResult result = getAPIData(geoInfo.getLatitude(), geoInfo.getLongitude(), "hourly,current,minutely", parameterunits, API_URL, API_KEY);
			List<DailyWeatherInfo> dailyWeatherInfoList = new ArrayList<>();
			String timezone = result.getTimezone();
			for (int i=0; i<=5; i++) {
				Daily theResult = result.getDaily().get(i);
				dailyWeatherInfoList.add(new DailyWeatherInfo(theResult, timezone));
			}
			return dailyWeatherInfoList;
		}
	
		

		//https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude={part}&units={units}&appid={API key}
		// get API data
		private WeatherResult getAPIData(String parameterlat, String parameterlon, String parameterexclude, String parameterunits, String API_URL, String API_KEY) throws WeatherAPIException {
			try {
				final URIBuilder uriBuilder = new URIBuilder(API_URL).setPathSegments("data", "2.5", "onecall").addParameter("appid", API_KEY);
				if (parameterlat != null && !parameterlat.isBlank()) {
						uriBuilder.addParameter("lat", parameterlat);
					}
				if (parameterlon != null && !parameterlon.isBlank()) {
				        uriBuilder.addParameter("lon", parameterlon);
				}
				if (parameterexclude != null && !parameterexclude.isBlank()) {
			        uriBuilder.addParameter("exclude", parameterexclude);
			    }
				if (parameterunits != null && !parameterunits.isBlank()) {
			        uriBuilder.addParameter("units", parameterunits);
			    }
			
			final URI uri = uriBuilder.build(); 
			
			final HttpGet getRequest  = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();
				
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getMessage() != null)
						throw new WeatherAPIException("Error occured on API call: " + errorResponse.getMessage());
				}
				
				return mapper.readValue(entity.getContent(), WeatherResult.class);
			} catch (IOException e) {
				throw new WeatherAPIException("Error requesting data from the OpenWeather API.", e);
			}
		} catch (URISyntaxException e) {
			throw new WeatherAPIException("Unable to create request URI.", e);
		}
		}
		

		//http://api.openweathermap.org/geo/1.0/direct?q={city name},{state code},{country code}&limit={limit}&appid={API key}
		// get Geocoding API data
		private GeocodingResult[] getGeocodingAPIData(String parameter, String API_URL, String API_KEY) throws WeatherAPIException {
			try {
				final URIBuilder uriBuilder = new URIBuilder(API_URL).setPathSegments("geo", "1.0", "direct").addParameter("appid", API_KEY);
				if (parameter != null && !parameter.isBlank()) {
						uriBuilder.addParameter("q", parameter);
					}
			
			final URI uri = uriBuilder.build(); 
			
			final HttpGet getRequest  = new HttpGet(uri);
			final CloseableHttpClient httpclient = HttpClients.createDefault();
			try (CloseableHttpResponse response = httpclient.execute(getRequest)) {
				final HttpEntity entity = response.getEntity();
				final ObjectMapper mapper = new ObjectMapper();
				
				if (response.getStatusLine().getStatusCode() != HttpStatus.SC_OK) {
					ErrorResponse errorResponse = mapper.readValue(entity.getContent(), ErrorResponse.class);
					if (errorResponse.getMessage() != null)
						throw new WeatherAPIException("Error occured on Geocoding API call: " + errorResponse.getMessage());
				}
				
				return mapper.readValue(entity.getContent(), GeocodingResult[].class);
			} catch (IOException e) {
				throw new WeatherAPIException("Error requesting data from the OpenWeather-Geocoding API.", e);
			}
		} catch (URISyntaxException e) {
			throw new WeatherAPIException("Unable to create request URI.", e);
		}
		}
		
	}
