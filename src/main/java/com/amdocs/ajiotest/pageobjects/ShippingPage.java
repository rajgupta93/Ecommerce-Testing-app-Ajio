package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class ShippingPage extends Base{

	@FindBy(xpath="//*[@id=\"dAccountWrapper\"]/div[2]/div[2]")
	WebElement paymentBtn;
	
	
	public ShippingPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public PaymentPage goToPaymentPage() {
		Action.onClick(webDriver, paymentBtn);
		return new PaymentPage();
		
	}
	
}
