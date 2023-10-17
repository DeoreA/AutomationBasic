package POM_Test_Script;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.Actitime_Home_Page;
import WebPages.Actitime_Login_page;
import utilities.all_utilities_std;


public class ActitmeLogin extends all_utilities_std {
	
	Actitime_Login_page getActitimeLoginPage;
	Actitime_Home_Page getActitimeHomePage;
	WebDriver driver;
	@BeforeTest
	public void precondition() {
		driver=setUp(getValueFromPropertyFile("browserName"),getValueFromPropertyFile("appUrl"));
		getActitimeLoginPage=new Actitime_Login_page(driver);
		getActitimeHomePage=new Actitime_Home_Page(driver);
	}

	@Test(priority=1)
	public void testLoginWithValidData() {
		getActitimeLoginPage.enterUserName(getValueFromPropertyFile("username"));
		getActitimeLoginPage.enterPassword(getValueFromPropertyFile("password"));
		getActitimeLoginPage.clickOnLoginButton();
		String expectedTitle=getValueFromPropertyFile("homePageTitle");
		String actualTitle=getCurrentTitleOfApplication();
		Assert.assertEquals(actualTitle, expectedTitle,"Either login failed or home page title got changed");
	}
	@Test(priority=2)
	public void testLogout() {
		getActitimeHomePage.clickOnLogout();
		String expectedTitle=getValueFromPropertyFile("loginPageTitle");
		Assert.assertEquals(getCurrentTitleOfApplication(expectedTitle), expectedTitle);
	}
	@AfterTest
	public void postcondition() {
		cleanUp();
	}
}
/*
 * PreCondition: Application url is already opened on the browser
 * 	1. enter valid username as admin
 *  2. enter password as manager
 *  3. click on login  button
 *  4. click on logout link
 *  5. validate login page is displayed or not 
 */