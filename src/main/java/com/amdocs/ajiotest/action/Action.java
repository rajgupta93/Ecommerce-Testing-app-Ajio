package com.amdocs.ajiotest.action;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.amdocs.ajiotest.base.Base;

public class Action extends Base{
	
	public static void onClick(WebDriver webDriver, WebElement webElement) {
		
		Actions action = new Actions(webDriver);
		action.moveToElement(webElement).click().build().perform();
		System.out.print("Clicked on" + webElement) ;
		
	}
	
	public static void insertText(WebElement webElement, String text) {
//		webElement.clear();
		String inputText = webElement.getAttribute("value");
        if( inputText != null ) {
            for(int i=0; i<inputText.length();i++) {
                webElement.sendKeys(Keys.BACK_SPACE);
            }
        }
        
		System.out.print(inputText);
		webElement.sendKeys(text);
		
	}
	
	

	public static void wait(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollBy(0,150)", "");
	}
}
