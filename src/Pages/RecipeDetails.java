package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;
import io.appium.java_client.AppiumDriver;

//Separate class to capture all the element in recipe detail screen

public class RecipeDetails extends BasePage {

	public RecipeDetails(AppiumDriver driver) {
		super(driver);
	}

	private By startButton = By.id("com.example.android.wearable.recipeassistant:id/action_cook");
	private By recipeImage = By.id("com.example.android.wearable.recipeassistant:id/recipeImageView");
	
	//Method to check start button presence

	public WebElement checkStartButton() {
		return find(startButton);
	}

	//Method to tap start button
	public void tapStart() {
		tapElement(startButton);
	}
}
