package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class SignInPage extends Base{

	public SignInPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")
	WebElement emailTextBox;
	
	@FindBy(xpath="//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")
	WebElement continueBtn;
	
	@FindBy(xpath = "//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[5]/input")
	WebElement loginBtn;
	
	public HomePage login(String phoneNo) throws InterruptedException {
	
	
		Action.insertText(emailTextBox,phoneNo);
		Action.onClick(webDriver, continueBtn);
		Action.wait(30000);
		Action.onClick(webDriver, loginBtn);
		
		return new HomePage();
	}
	
}
