package com.amazon.test.category;

import org.testng.annotations.Test;

public class CategoryScript extends CategoryLib{

	@Test()
	public void categoryValid() throws Throwable{
		
		shopByCategory();
		
		
	}
	
}
