package com.tekzu.utils;

import org.springframework.stereotype.Component;

@Component
public class SystemDetails {
	
	public static String os;
	
	public void getSystemOS() {
		os = System.getProperty("os.name");
		System.out.println("OS Details : "+os);
	}
}
