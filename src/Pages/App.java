package Pages;

import org.testng.annotations.BeforeClass;


import common.BaseTest;


public class App extends BaseTest{
	
	public HomePage homePage = null;
	public RecipeDetails recipeDetails = null;
	
	@BeforeClass
	public void initializeApp() {	
		
	homePage = new HomePage(driver);
	recipeDetails = new RecipeDetails(driver);

}
}
