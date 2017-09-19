package com.amazon.test.category;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.log4testng.Logger;

import com.amazon.main.ActionsPage;

public class CategoryLib extends ActionsPage {

	  public  void shopByCategory() throws Throwable{
		   
		  mouseHover(CategoryPageElements.catrgory,"catrgory");
		  click(CategoryPageElements.catrgory,"catrgory");
	   }

	}

