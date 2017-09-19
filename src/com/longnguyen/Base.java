package com.longnguyen;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	

	public static AndroidDriver<AndroidElement> setCapability() throws MalformedURLException {
		AndroidDriver<MobileElement> driver;
		//File appDemo = new File("src\\ApiDemos-debug.apk");
		//File appDemo = new File("src\\jp.co.toshiba.android.FlashAir_2017-04-27.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.125.101:5555");
		//
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
		//
		capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
		//capabilities.setCapability(MobileCapabilityType.APP, appDemo.getAbsolutePath());
		capabilities.setCapability("platformName", "Android");
		//
		capabilities.setCapability("appPackage", "jp.co.toshiba.android.FlashAir");
		//
		capabilities.setCapability("appActivity", "jp.co.toshiba.android.FlashAir.FSSplashActivity");
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//return driver;
		return null;
	}

}
