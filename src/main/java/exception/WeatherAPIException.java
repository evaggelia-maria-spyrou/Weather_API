package exception;

public class WeatherAPIException extends Exception{

	public WeatherAPIException() {
	super();
	}
	
	public WeatherAPIException(String message) {
		super(message);
	}
	
	public WeatherAPIException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public WeatherAPIException(Throwable cause) {
		super(cause);
	}
	
	protected WeatherAPIException (String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}


