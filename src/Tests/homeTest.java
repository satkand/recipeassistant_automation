package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.App;


public class homeTest extends App{

	
	@Test
	public void recipePreviewTest() {
		System.out.println("Test.......");
		Assert.assertNotNull(homePage.checkMenuBar(), "MenuBar not shown");
		System.out.println("Menu Bar verified");
		homePage.tapRecipeOne();
	}
	
	@Test
	public void recipeDetailsTest() {
		System.out.println("Details Test.......");
		Assert.assertNotNull(recipeDetails.checkStartButton(), "Start Button not shown");
		System.out.println("Start Button verified");
		recipeDetails.tapStart();
	}
}
