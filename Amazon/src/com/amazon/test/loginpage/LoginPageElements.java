package com.amazon.test.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.main.ActionsPage;

public class LoginPageElements {
	

	public static By sinintext;
	public static By emailId;
	public static By password;
	public static By signin_button;
	public static By error_email;
	public static By error_pwd;
	public static By my_accountlist;
	public static By logout_button;
	
	
	
	static{
		sinintext=By.xpath("//span[text()='Hello. Sign in']");
		
		emailId = By.xpath(".//*[@id='ap_email']");
		password= By.id("ap_password");
		signin_button=By.id("signInSubmit");
		error_email=By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li/span");
		error_pwd=By.xpath(".//*[@id='auth-error-message-box']/div/div/ul/li");
		my_accountlist=By.xpath(".//*[@id='nav-link-yourAccount']/span[2]");
		logout_button= By.xpath(".//*[@id='nav-item-signout']/span");
	}
			
}
