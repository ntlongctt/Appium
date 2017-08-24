package com.longnguyen;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static AndroidDriver<AndroidElement> setCapability() throws MalformedURLException {
		File appDemo = new File("src\\ApiDemos-debug.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Demo");
		capabilities.setCapability(MobileCapabilityType.APP, appDemo.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		return driver;
	}

}
