package com.amazon.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class ActionsPage extends TestEngineWeb{
	private final Logger LOG = Logger.getLogger(ActionsPage.class);

	private final String msgClickSuccess = "Successfully Clicked On ";
	private final static String msgClickFailure = "Unable To Click On ";
	private final String msgTypeSuccess = "Successfully Typed On ";
	private final String msgTypeFailure = "Unable To Type On ";
	private final String msgIsElementFoundSuccess = "Successfully Found Element :";
	private final String msgIsElementFoundFailure = "Unable To find Element ";

	public static boolean mouseHover(By locator , String LocatorName){
		boolean status = false;
		Actions action=new Actions(driver);
		try {
			WebElement element=driver.findElement(locator);
			
			WebDriverWait wait =new  WebDriverWait(driver, 10);
			
			wait.until(ExpectedConditions.visibilityOf(element));
			
			System.out.println("mouseHover element found");
			
			action.moveToElement(element).build().perform();
			
			System.out.println("mouseHover element performed");
			
			status = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			status = false;
			System.out.println("mouseHover : " + LocatorName+ msgClickFailure + LocatorName);

		}
		return status;
		
	}
	
	public static boolean click(By locator, String locatorName) throws Throwable {
		boolean status = false;
		try {
			WebElement element=driver.findElement(locator);
			WebDriverWait wait =new  WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));
			
			if(element.isDisplayed()){
				System.out.println("element is selected");
				element.click();
				System.out.println("element is clicked");
			}
			else{
				System.out.println("element not found");
			}
			status = true;
		}
		 catch (Exception e) {
			status = false;
			System.out.println("Click : " + locatorName+ msgClickFailure + locatorName);

		}
		return status;

	}
	
	public static boolean text(By locator, String locatorName,String vlaues) throws Throwable {
		boolean status = false;
		try {
				WebElement element=driver.findElement(locator);
				
				WebDriverWait wait =new  WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.visibilityOf(element));
				
			if(element.isDisplayed()){
				System.out.println("element is selected");
			element.sendKeys(vlaues);
			System.out.println("values entered ");
			}
			else{
				System.out.println("element not found");
			}
			status = true;
		} catch (Exception e) {
			status = false;
			System.out.println("Click : " + locatorName+ msgClickFailure + locatorName);

		}
		return status;

	}
	 
	 
	 
}
