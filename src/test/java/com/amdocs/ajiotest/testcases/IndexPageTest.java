package com.amdocs.ajiotest.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amdocs.ajiotest.base.Base;
import com.amdocs.ajiotest.pageobjects.AddToCartPage;
import com.amdocs.ajiotest.pageobjects.CartPage;
import com.amdocs.ajiotest.pageobjects.HomePage;
import com.amdocs.ajiotest.pageobjects.IndexPage;
import com.amdocs.ajiotest.pageobjects.PaymentPage;
import com.amdocs.ajiotest.pageobjects.ShippingPage;
import com.amdocs.ajiotest.pageobjects.SignInPage;

public class IndexPageTest extends Base{
	
	private IndexPage indexPage;
	
	@BeforeMethod 
	public void setup() throws IOException {
	loadConfig();
	launchWebApp();
	indexPage = new IndexPage(); 
}
	
	@Test
	public void onClickTest() throws InterruptedException {
		SignInPage signInPage  =  indexPage.ClickOnSignInButton();
		HomePage homePage = signInPage.login(getPhoneNumber());
		AddToCartPage addToCartPage = homePage.search();
		CartPage cartPage = addToCartPage.addtocart();
		ShippingPage shippingPage = cartPage.goToshipping();
		PaymentPage paymentPage = shippingPage.goToPaymentPage();
		paymentPage.doPayment();
	}
	
}
