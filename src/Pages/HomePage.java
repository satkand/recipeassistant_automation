package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BasePage;

public class HomePage extends BasePage {
	

	private By menuBar = By.id("android:id/action_bar_title");
	private By recipeOne = By.id("com.example.android.wearable.recipeassistant:id/imageView");

	public WebElement checkMenuBar() {
		return find(menuBar);
	}

	public void tapRecipeOne() {
		tapElement(recipeOne);
	}

}
