import org.junit.Assert;
import org.junit.Test;

import exception.WeatherAPIException;
import model.TimeInfo;

public class ConvertTimestampTest {

	@Test
	public void testTimeFromTimestamp() throws WeatherAPIException{
		final TimeInfo timeInfo = new TimeInfo("Europe/Athens", 1612312675);
		String result = timeInfo.getTimeFromTimestamp();
		Assert.assertFalse(result.isEmpty());
		System.out.println(result);
	} 
	
	
}
