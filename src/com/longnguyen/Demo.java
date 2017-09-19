package com.longnguyen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo extends Base {

	@SuppressWarnings("null")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AndroidDriver<MobileElement> driver;
		// File appDemo = new File("src\\ApiDemos-debug.apk");
		// File appDemo = new File("src\\flashAir.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.125.101:5555");
		//
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		//
		capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
		// capabilities.setCapability(MobileCapabilityType.APP,
		// appDemo.getAbsolutePath());
		capabilities.setCapability("platformName", "Android");
		//
		capabilities.setCapability("appPackage", "jp.co.toshiba.android.FlashAir");
		capabilities.setCapability("appActivity", "jp.co.toshiba.android.FlashAir.FSSplashActivity");

		// capabilities.setCapability("appPackage",
		// "jp.co.toshiba.android.FlashAir");
		//
		// capabilities.setCapability("appActivity",
		// "jp.co.toshiba.android.FlashAir.FSSplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		Thread.sleep(5000);
		// ==== Click here
		driver.findElement(By.xpath("//*[1]//*[1]//*[1]//*[1]//*[3]//*[2]//*[1]")).click();
		System.out.println("click here");
		Thread.sleep(5000);
		// --------- Cancel popup ----------//

		Thread.sleep(3000);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		Thread.sleep(3000);

		driver.pressKeyCode(AndroidKeyCode.BACK);
		System.out.println("back");

		// --- Click icon Settings
		driver.findElementByXPath("//android.widget.LinearLayout[@index='2']//android.widget.ImageButton[@index='2']")
				.click();
		Thread.sleep(2000);
		System.out.println("click icon settings");

		// -----Click menu Settings.
		driver.findElementByXPath("//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='0']")
				.click();
		Thread.sleep(2000);
		System.out.println("click menu settings");

		// ---- Scroll to end.
//		Dimension dimensions = driver.manage().window().getSize();
//		// System.out.println("Size of screen= " + dimensions);
//		int Startpoint = (int) (dimensions.getHeight() * 0.9);
//		// System.out.println("Size of scrollStart= " + Startpoint);
//		int scrollEnd = (int) (dimensions.getHeight() * 0.001);
//		// System.out.println("Size of cscrollEnd= " + scrollEnd);
//		driver.swipe(0, Startpoint, 0, scrollEnd, 1000);
//
//		// System.out.println("Size of screen= " + dimensions);
//		int Startpoint1 = (int) (dimensions.getHeight() * 0.9);
//		// System.out.println("Size of scrollStart= " + Startpoint);
//		int scrollEnd1 = (int) (dimensions.getHeight() * 0.001);
//		// System.out.println("Size of cscrollEnd= " + scrollEnd);
//		driver.swipe(0, Startpoint1, 0, scrollEnd1, 1000);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"OSS information\"));");
		Thread.sleep(2000);
		// ---- Click Help
		driver.findElementByXPath("//android.widget.LinearLayout[@index='5']//android.widget.TextView[@index='0']")
				.click();
		Thread.sleep(2000);

		System.out.println("Open Help");
		Thread.sleep(5000);
		
		
		//WebElement content =  driver.findElement(By.xpath("//"))
		// driver.findElementByXPath("//android.view.View[@content-desc='Getting
		// started with FlashAir Link']").click();
		// //
		// WebElement contentHelp = driver.findElementByXPath(
		// "//android.view.View[@content-desc='FlashAir is an SD card with
		// embedded wireless LAN functionality. Photos taken with a digital
		// camera can be displayed on a PC, smartphone or tablet without
		// removing the card from the camera.']");
		// System.out.println(contentHelp.getText());
		driver.quit();

	}

}
