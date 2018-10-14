package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;
import io.appium.java_client.AppiumDriver;

public class RecipeDetails extends BasePage {
	
	public RecipeDetails(AppiumDriver driver) {
		super(driver);
		
	}
	
	private By startButton = By.id("com.example.android.wearable.recipeassistant:id/action_cook");
	private By recipeImage = By.id("com.example.android.wearable.recipeassistant:id/recipeImageView");

	public WebElement checkStartButton() {
		return find(startButton);
	}

	public void tapStart() {
		tapElement(startButton);
	}
}
