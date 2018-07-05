package com.tekzu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SystemDetails {
	
	@Autowired
	private Environment env;
	
	public void getSystemOS() {
		String osName = System.getProperty("os.name");
		String applicationVersion = env.getProperty("Application-version");
		String serverName = env.getProperty("ServerName");
		String applicationName = env.getProperty("ApplicationName");
		String releaseDate = env.getProperty("ReleaseDate");
		
		System.out.println("osName : "+osName+" / applicationVersion : "+applicationVersion+" / serverName: "+serverName+
				" / applicationName: "+applicationName+" / releaseDate : "+releaseDate);
		
	}
}
