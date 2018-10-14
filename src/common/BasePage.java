package common;

import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;

public class BasePage extends BaseTest {

	protected WebElement find(final By locator, int... args) {

		int timeout = (args.length > 0 ? args[0] : 15);
		try {
			FluentWait<AppiumDriver> wait = new FluentWait<AppiumDriver>(driver).withTimeout(timeout, TimeUnit.SECONDS)
					.pollingEvery(200, TimeUnit.MILLISECONDS).ignoring(Exception.class)
					.ignoring(NoSuchElementException.class);

			WebElement webelement = wait.until(new Function<AppiumDriver, WebElement>() {
				public WebElement apply(AppiumDriver driver) {
					return driver.findElement(locator);
				}
			});
			return webelement;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			return null;
		}
	}

	protected void tapElement(By locator) {
		WebElement element = find(locator);
		element.click();
	}

}
