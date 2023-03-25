import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.cloudmersive.client.invoker.ApiException;

import model.ip.IPLocation;

public class IPLocationTest {

	@Test
	public void testCoordinatesFromIP() throws IOException, ApiException {
		final List<String> result = IPLocation.getCoordinatesFromIP();
		Assert.assertFalse(result.isEmpty());
		System.out.println(result);
	}

}
