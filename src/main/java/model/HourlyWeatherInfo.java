package model;



import model.openweather.Hourly;



public class HourlyWeatherInfo {

	    private final long dt;
	    private final String timezone;
	    private final String temp;
		private final String weather_description;



		public HourlyWeatherInfo(long dt, String timezone, String temp, String weather_description) {
			this.dt = dt;
			this.timezone = timezone;
			this.temp = temp;
			this.weather_description = weather_description;
		}




		public HourlyWeatherInfo(Hourly result, String timezone) {
			this.dt = result.getDt();
			this.timezone = timezone;
	        this.temp = result.getTemp().toString();
			this.weather_description = result.getWeather().get(0).getDescription();

	    }




		public String getTemp() {
			return temp;
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
			return  "Hourly Weather for " +  time.getTimeFromTimestamp() + "\n\n"+  
			        "Weather: "+ weather_description+"\n" + 
		            "Temperature: " + temp +"\n\n\n";
		}


	

}

