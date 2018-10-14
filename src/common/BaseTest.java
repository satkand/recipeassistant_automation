package common;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	@SuppressWarnings("rawtypes")

	public static AppiumDriver driver = null;

	// public AppiumServiceBuilder service;
	private AppiumDriverLocalService service = null;
	private String AppiumNodeFilePath = "/usr/local/bin/node";
	private String AppiumJavaScriptServerFile = "/usr/local/lib/node_modules/appium/build/lib/main.js";

	@BeforeSuite(alwaysRun = true)
	public void setup() throws IOException, InterruptedException {

		stopAppiumServer();
		startAppiumServer();

		// File f=new File("src");
		// File app=new File(f,"application-debug.apk");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Samsung");
		capabilities.setCapability("automationName", "UIAutomator2");
		// capabilities.setCapability("app", app.getAbsolutePath());
		capabilities.setCapability("appPackage", "com.example.android.wearable.recipeassistant");
		capabilities.setCapability("appActivity", "com.example.android.wearable.recipeassistant.MainActivity");
		capabilities.setCapability("appWaitActivity", "*");
		capabilities.setCapability("udid", "9885e63843544b4d49");
		capabilities.setCapability("platformVersion", "8.0.0");
		this.driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}

	// To start Appium server automatically for every run
	private void startAppiumServer() throws IOException, InterruptedException {

		System.out.println("Starting Appium Server ......");

		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder().usingDriverExecutable(new File(AppiumNodeFilePath))
						.withAppiumJS(new File(AppiumJavaScriptServerFile)));

		service.start();
		System.out.println("Appium Server Started !!");
	}

	/* This method is to stop the Appium Server automatically,by stopping the 
	 * service that was started by startAppiumServer method */

	private void stopAppiumServer() throws IOException {
		try {
			service.stop();
			System.out.println("Appium Server is now Stopped!!");
		} catch (NullPointerException e) {
			System.out.println("Appium Server is already Stopped !!");
		}
	}

	@AfterSuite(alwaysRun = true)
	public void teardown() throws IOException {
		driver.quit();
	}

}