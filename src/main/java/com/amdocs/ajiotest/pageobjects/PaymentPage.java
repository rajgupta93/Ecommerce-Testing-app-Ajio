package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class PaymentPage extends Base{
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[4]/div")
	WebElement upiBtn;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div[2]/div[2]/div/div/form[1]/div/div[2]/div/div/input")
	WebElement upiInputBox;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div[3]/div[2]/div[2]/div/div/form[1]/div/div[4]")
	WebElement proceedToBuyBtn;
	
	public PaymentPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public void doPayment() throws InterruptedException {
		Action.wait(5000);
		Action.onClick(webDriver, upiBtn);
		Action.wait(5000);
		Action.onClick(webDriver, upiInputBox);
		Action.insertText(upiInputBox, "8393828829@ybl");
		Action.onClick(webDriver, proceedToBuyBtn);
	}

}
