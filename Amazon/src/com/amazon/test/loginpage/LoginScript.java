package com.amazon.test.loginpage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginScript extends LoginLib{

	@BeforeMethod()
	public void browserInvoking() throws Throwable{
		
		System.out.println("initializing broswer");
		fireFoxDriverInit("http:/www.amazonindia.com");
	
	}
	
	/*
	@DataProvider(name = "Authentication")
	 
	  public static Object[][] credentials() {
	 
	        return new Object[][] {
	        	{ "surimahesh123@gmail.com", "mahesh@amazon" }, 
	        	{ "surimahesh@gmail.com", "mahesh" },
	        	
	        };
	 
	  }
	@Test(dataProvider = "Authentication")
	
	public void invalidUserNamePwd(String Username,String password) throws Throwable{
		
		
		try {
			verifyLoginIn();
			invalidUsernamePassword(Username, password);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}*/
	@Test()
	public void validCredentials() throws Throwable{
		
		verifyLoginIn();
		validUsernamePassword("surimahesh@gmail.com", "mahesh@amazon");
		String title=driver.getTitle();
		System.out.println(title);
		click(LoginPageElements.my_accountlist, "my_accountlist");
		WebDriverWait wait =new  WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(LoginPageElements.logout_button)));
		logoutVerify();
		
		} 
	}


		
	


	
