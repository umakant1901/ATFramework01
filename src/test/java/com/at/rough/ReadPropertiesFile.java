package com.at.rough;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;



public class ReadPropertiesFile {

	
	public static void main(String[] args) throws IOException {
		
		Properties properties=new Properties();
		
			FileInputStream fileInputStream=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			properties.load(fileInputStream);
			System.out.println(properties.getProperty("browser"));
			
		
		
	}
	
	
	
}
