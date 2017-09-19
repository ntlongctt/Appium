package com.longnguyen;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
public class swipedemo extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement dateWidget = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		dateWidget.click();
		WebElement inline = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		inline.click();
	
		
		
	}

}
