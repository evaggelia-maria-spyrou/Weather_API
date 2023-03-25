package model;

import model.geocoding.GeocodingResult;

public class GeocodingInfo {

	private final String latitude;
	private final String longitude;
	
	
	public GeocodingInfo(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	
	public GeocodingInfo(GeocodingResult[] geocodingResult) {
		this.latitude = geocodingResult[0].getLat().toString();
		this.longitude = geocodingResult[0].getLon().toString();
	}


	public String getLatitude() {
		return latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	@Override
	public String toString() {
		return "GeocodingInfo [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
	
}
