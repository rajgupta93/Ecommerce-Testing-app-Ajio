package com.amdocs.ajiotest.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ajiotest.base.Base;
import com.amdocs.ajiotest.pageobjects.AddToCartPage;
import com.amdocs.ajiotest.pageobjects.CartPage;
import com.amdocs.ajiotest.pageobjects.HomePage;
import com.amdocs.ajiotest.pageobjects.ShippingPage;

	
	
public class HomePageTest extends Base{

	private HomePage homePage;
	
	@BeforeMethod 
		public void setup() throws IOException {
		loadConfig();
		launchWebApp();
		homePage = new HomePage(); 
	}
	
	@Test
	public void loginTest() throws InterruptedException {
	}
}
