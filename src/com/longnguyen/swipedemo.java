package com.longnguyen;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
public class swipedemo extends Base{

	/*public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String expoected = "9pm15";
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement dateWidget = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		dateWidget.click();
		WebElement inline = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		inline.click();
		//driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();/
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@content-desc='9']").click();
		Thread.sleep(2000);
//		driver.findElementByXPath("//*[@content-desc='50']").click();
//		Thread.sleep(2000);
		TouchAction t= new TouchAction(driver);
		WebElement minute1 = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement minute2 = driver.findElementByXPath("//*[@content-desc='45']");
		t.press(minute1).moveTo(minute2).waitAction(Duration.ofSeconds(3)).release().perform();
		driver.quit();
		Assert.assertEquals("test", "test");
		String hourExpected = "9"
		String minuteExpected = "45"
		String hourActual = element.getText();
		String minuteActual = element.getText();
		Assert.assertEquals(hourExpected, hourActual, "Loi");
		
		
	}*/
	
	@Test
	public void testSwipe() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = setCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		WebElement dateWidget = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		dateWidget.click();
		WebElement inline = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		inline.click();
		//driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();/
		Thread.sleep(2000);
		driver.findElementByXPath("//*[@content-desc='9']").click();
		Thread.sleep(2000);
//		driver.findElementByXPath("//*[@content-desc='50']").click();
//		Thread.sleep(2000);
		TouchAction t= new TouchAction(driver);
		WebElement minute1 = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement minute2 = driver.findElementByXPath("//*[@content-desc='45']");
		t.press(minute1).moveTo(minute2).waitAction(Duration.ofSeconds(3)).release().perform();
		String hourExpected = "9";
		String minuteExpected = "46";
		String hourActual = driver.findElementById("android:id/hours").getText();
		String minuteActual = driver.findElementById("android:id/minutes").getText();
		Assert.assertEquals("Gio khong nhu mong doi", hourActual, hourExpected);
		Assert.assertEquals("Phut ko nhu mong doi", minuteActual, minuteExpected);

		
		driver.quit();
	}
	@Test
	public void testSwipe2() {
		System.out.println("Day la buoc 1: bla bla bla");
		String expected = "Hoa ngo";
		System.out.println("day la buoc 2: bla bla bla");
		Assert.assertEquals("Hoa ngoaaa", expected, "Ket qua ko nhu mong doi");
	}

}
