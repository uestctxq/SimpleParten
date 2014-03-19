package org.sonatype.mavenbook.weather;

import java.io.InputStream;

public class WeatherService
{
	public WeatherService(){}

	public String retrieveForecast(String zip) throws Exception{
		InputStream dataIn = new YahooRetriever().retrieve(zip);

		Weather weather = new YahooParser().parse(dataIn);

		return new WeatherFormatter().format(weather);
	}
}