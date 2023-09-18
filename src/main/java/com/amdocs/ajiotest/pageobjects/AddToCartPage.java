package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class AddToCartPage extends Base{

	@FindBy(xpath ="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[6]/div[3]/div/span")
	WebElement selectSizeBtn;
	
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]/div")
	WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]")
	WebElement cartBtn;
	public AddToCartPage() {
		PageFactory.initElements(webDriver,this);
	}
	
	public CartPage addtocart() {
		Action.onClick(webDriver, selectSizeBtn);
		Action.onClick(webDriver, addToCart);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Action.onClick(webDriver, cartBtn);
		
		return new CartPage();
	}
}
