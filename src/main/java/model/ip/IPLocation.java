package model.ip;


import java.io.IOException;
import java.util.List;

import com.cloudmersive.client.IpAddressApi;
import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.ApiKeyAuth;
import com.cloudmersive.client.model.GeolocateResponse;


public class IPLocation {

	//return list of coordinates and city from IP
	public static List<String> getCoordinatesFromIP() throws ApiException, IOException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();
		// Configure API key authorization: Apikey
		ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
		Apikey.setApiKey("APIKEY");
		IpAddressApi apiInstance = new IpAddressApi();
	try {
		String ip = IPAddress.getIP();
	    GeolocateResponse result = apiInstance.iPAddressPost(ip);
	    String lat = result.getLatitude().toString();
	    String lon = result.getLongitude().toString();
	    String city = result.getCity().toString();
	    List<String> location = List.of(lat, lon, city);
	    return location;
	} catch (ApiException e ) {
	    e.printStackTrace();
	    return null;
	
	} catch (IOException e) {
		e.printStackTrace();
		return null;
	} 
	}
}


