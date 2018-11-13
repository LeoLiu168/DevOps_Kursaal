package org.leo.maven.demo.weather;

import java.io.InputStream;

import org.apache.log4j.PropertyConfigurator;

public class Main {
	
	private int zip;

	public Main(int zip) {
		this.zip = zip;
	}

	public void start() throws Exception {
		InputStream dataIn = new YahooRetriever().retrieve(zip);
		Weather weather = new YahooParser().parse(dataIn);
		System.out.println(new WeatherFormatter().format(weather));
	}

	public static void main(String[] args) throws Exception {
		// Configure Log4J
		PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));
		
		int zipcode = 60202;
		try {
			zipcode = Integer.parseInt(args[0]);
		} catch( Exception e) {
			e.printStackTrace();
		}
		
		new Main(zipcode).start();
	}

}
