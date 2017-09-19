package com.longnguyen;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.WebElement;
public class DragAndDrop extends Base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		//
		TouchAction t =  new TouchAction(driver);
		WebElement drag =  driver.findElementById("drag_dot_1");
		//WebElement drag =  driver.findElementByXPath("//android.view.View[contains(@resource-id,'com.example.android.apis:id/drag_dot_1']");
		WebElement drop = driver.findElementById("drag_dot_3");
		//WebElement drop =  driver.findElementByXPath("//android.view.View[contains(@resource-id,'com.example.android.apis:id/drag_dot_2']");
		t.longPress(drag).moveTo(drop).waitAction(Duration.ofSeconds(3)).release().perform();
		driver.quit();
	}

}
