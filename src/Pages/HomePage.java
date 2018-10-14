package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;
import io.appium.java_client.AppiumDriver;

//Separate class to capture all the element in First screen
public class HomePage extends BasePage {

	public HomePage(AppiumDriver driver) {
		super(driver);
	}

	private By menuBar = By.id("android:id/action_bar_title");
	private By recipeOne = By.id("com.example.android.wearable.recipeassistant:id/imageView");
	
	
//Method to check menu bar presence
	public WebElement checkMenuBar() {
		return find(menuBar);
	}
	
//Method to tap a recipe

	public void tapRecipeOne() {
		tapElement(recipeOne);
	}

}