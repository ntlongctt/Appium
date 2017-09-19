package com.longnguyen;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class LongPress extends Base{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(4000);
		//
		WebElement expandableLists = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		TouchAction t = new TouchAction(driver);
		t.tap(expandableLists).perform();
		Thread.sleep(4000);
		WebElement customAdapter = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		customAdapter.click();
		Thread.sleep(4000);
		WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		new TouchAction((PerformsTouchActions) driver).press(peopleNames).waitAction(Duration.ofSeconds(3)).release().perform();
		WebElement titleName =  driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']");
		System.out.println(titleName.getText());
		driver.quit();
	}

}
