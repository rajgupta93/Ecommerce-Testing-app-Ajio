package com.amdocs.ajiotest.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.ajiotest.action.Action;
import com.amdocs.ajiotest.base.Base;

public class IndexPage extends Base{
	
//	@FindBy(xpath="//*[@id=\"userBtn\"]")
//	WebElement userBtn;
	
	@FindBy(xpath = "//*[@id=\"appContainer\"]/div[1]/div/header/div[1]/ul/li[1]")
	WebElement signIn;
	
	public IndexPage() {
		PageFactory.initElements(webDriver,this);
	}
	
	public SignInPage ClickOnSignInButton() {
//		Action.onClick(webDriver, userBtn);
		Action.onClick(webDriver, signIn);
		return new SignInPage();
	}
}
