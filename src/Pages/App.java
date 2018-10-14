package Pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import common.BaseTest;

public class App extends BaseTest {

	public HomePage homePage = null;
	public RecipeDetails recipeDetails = null;

	// Initializing the constructor

	@BeforeClass
	public void initializeApp() {
		homePage = new HomePage(driver);
		recipeDetails = new RecipeDetails(driver);
	}

	//Launching the app before every test case
	@BeforeMethod(alwaysRun = true)
	public void beforeEachTest() throws Exception {
		homePage.launchApp();
	}

	// Closing the app after every test case
	@AfterMethod(alwaysRun = true)
	public void afterEachTest() throws Exception {
		homePage.closeApp();
	}
}
