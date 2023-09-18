package com.amdocs.ajiotest.pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class HomePage extends Base{

//	@FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/header/div[2]/ul/li[5]/a")
//	WebElement login;
//	
//	@FindBy(xpath ="//*[@id=\"glass-gdpr-default-consent-accept-button\"]/span[1]")
//	WebElement allow;
//	// tbc
	
//	@FindBy(xpath ="//*[@id=\"delivery_to_pincode\"]")
//	WebElement changePincodeBtn;
//	
//	@FindBy(xpath= "//*[@id=\"txtpincode\"]")
//	WebElement pincodeInputBox;
//	
//	@FindBy(xpath ="//*[@id=\"btnapply\"]")
//	WebElement applyPincode;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/button/span")
	WebElement searchBtn;
	
	@FindBy(xpath = "//*[@id=\"products\"]/div[3]/div[1]/div/div[2]/a/div/div[1]/div[1]/img")
	WebElement product;
	
	public HomePage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public AddToCartPage search() throws InterruptedException {
		Action.wait(3000);
		Action.onClick(webDriver, searchBox);
		Action.insertText(searchBox,"Tee");
		Action.onClick(webDriver, searchBtn);
		Action.wait(3000);
		Action.onClick(webDriver, product);
		ArrayList<String> tabs = new ArrayList<String> (webDriver.getWindowHandles());

		webDriver.switchTo().window(tabs.get(1));
//		Action.scrollDown();
		
		
		return new AddToCartPage();
		
	}
	
}
