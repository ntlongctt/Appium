package com.longnguyen;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Lesson1 extends Base {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		/*AndroidDriver<AndroidElement> driver = setCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done!");*/
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		Thread.sleep(2000);
		//
		WebElement expandableLists = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		TouchAction t = new TouchAction(driver);
		t.tap(expandableLists).perform();
		Thread.sleep(2000);
		WebElement customAdapter = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		customAdapter.click();
		Thread.sleep(2000);
		//WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));// driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		TouchAction t2 = new TouchAction((PerformsTouchActions) driver);
		t2.press(driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"))).waitAction(Duration.ofSeconds(3)).release().perform();
		//t.press(peopleNames).waitAction(3000).release().perform();
		//peopleNames.click();
		WebElement titleName =  driver.findElementByXPath("//android.widget.TextView[@text='Sample menu']");
		System.out.println(titleName.getText());
		driver.quit();
		

	}
}
