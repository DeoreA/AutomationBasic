package POM_Test_Script;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.Google_page;
import utilities.all_utilities_std;

public class Google_SearchPage extends all_utilities_std {

	WebDriver driver;
	Google_page getGooglePage;
	Google_SearchPage getGoogleSearchPage;
	
	@BeforeTest
	public void precondition() {
		driver=setUp("chrome", "https://www.google.com");
		getGooglePage=new Google_page(driver);
		getGoogleSearchPage=new Google_SearchPage();
	}
	@Test(priority=1)
	public void testGoogleHomePage() {
		Assert.assertEquals(getCurrentTitleOfApplication(), "Google");
	}
	
	@Test(priority=2)
	public void testSuggestionCount() {
		getGooglePage.enterText("Selenium");
		List<WebElement> suggestionList=getGooglePage.getSuggestionList();
		Assert.assertTrue(suggestionList.size()==10);
	}
	
	@Test(priority=3)
	public void testGoogleSearchPage() {

		getGooglePage.clickOnSearchButton();
		String actualTitle=getGoogleSearchPage.searchedPageTitle();
		Assert.assertTrue(actualTitle.contains("Selenium"));
	}
	

	@AfterTest
	public void postCondition() {
		cleanUp();
	}
}