package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class CartPage extends Base{

	@FindBy(xpath="//*[@id=\"dCartWrapper\"]/div[2]/div[2]/div[2]/div[2]")
	WebElement shippingBtn;
	public CartPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public ShippingPage goToshipping() {
		Action.onClick(webDriver, shippingBtn);
		return new ShippingPage();
	}
}
