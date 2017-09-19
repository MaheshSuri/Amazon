package com.amazon.test.loginpage;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.amazon.main.ActionsPage;

public class LoginLib extends ActionsPage{

	public static void verifyLoginIn() throws Throwable{
		//fireFoxDriverInit("http:/www.amazonindia.com");
		mouseHover(LoginPageElements.sinintext,"sinin Text");
		click(LoginPageElements.sinintext,"sinin Text");
	}
	
	public static void invalidUsernamePassword(String username,String pwd ) throws Throwable{
		
		text(LoginPageElements.emailId, "emailId", username);
		text(LoginPageElements.password, "password", pwd);	
		click(LoginPageElements.signin_button, "signin_button");
		errorHandle();
		
	
	}
public static void validUsernamePassword(String username,String pwd ) throws Throwable{
		
		text(LoginPageElements.emailId, "emailId", username);
		text(LoginPageElements.password, "password", pwd);	
		click(LoginPageElements.signin_button, "signin_button");

	
	}
	
	
	public static void errorHandle(){
		
		WebElement errorElement= driver.findElement(LoginPageElements.error_email);
				
		
		String alertMessage=errorElement.getText();
		
		
		System.out.println(alertMessage);
	}

	public static void logoutVerify() throws Throwable{
		mouseHover(LoginPageElements.logout_button,"logout_button");
		click(LoginPageElements.logout_button,"logout_button");
	}
	
	public static void getAllElements(String loctaor){
		
		if(driver.findElement(By.xpath(loctaor)).isDisplayed()){
			System.out.println("List elements selected");
		List<WebElement> productList=driver.findElements(By.xpath(loctaor));
	
		for(int i=1;i<productList.size();i++){
			String text=productList.get(i).getText();
			System.out.println(i+"  Product Name is ::  "+text);			
			    }
			}
	}
}

