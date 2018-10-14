/*Test Automation for Domain Technical test
 * Author: Sat Kandhaswami
 */

package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.App;

public class homeTest extends App {

//Test case to verify the app launch and welcome screen

	@Test(groups = { "TC-1", "Recipe Assistant", "Home Page", "priority-minor" })

	public void recipePreviewTest() {
		System.out.println("Test.......");
		Assert.assertNotNull(homePage.checkMenuBar(), "MenuBar not shown");
		System.out.println("Menu Bar verified");
		homePage.tapRecipeOne();
		System.out.println("Recipe opened");
	}

//Test case to start cooking	
	
	@Test(groups = { "TC-2", "Recipe Assistant", "Home Page", "priority-major" })

	public void recipeDetailsTest() {
		System.out.println("Details Test.......");
		homePage.tapRecipeOne();
		Assert.assertNotNull(recipeDetails.checkStartButton(), "Start Button not shown");
		System.out.println("Start Button verified");
		recipeDetails.tapStart();
		System.out.println("Cooking started");
		
	}
}
