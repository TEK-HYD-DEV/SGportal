package com.tekzu.utils;

public class CustomException extends Exception{
	
	public CustomException(String... values)
	{
		for (String string : values) {
		}
	}
	
	public CustomException(String controller,String mappingMethodValue,String... values)
	{
		for (String string : values) {
		}
	}

}
