package com.amazon.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class TestEngineWeb {

	public static WebDriver driver;
	
	public static void fireFoxDriverInit(String Url){
		 
		 try {
			// FirefoxProfile.addExtension(new File("C:\\Users\\E002969\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\iphyokpt.default\\extensions\\FireXPath@pierre.tholence.com.xpi"));
			driver=new FirefoxDriver();
			
			driver.get(Url);
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		
	}
}
