package POM_Test_Script;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPages.Orange_HRM_Dashboard;
import WebPages.Orange_HRM_Login;
import utilities.all_utilities_std;


public class OrangeHRM_Login_logout extends all_utilities_std {
	WebDriver driver;
	Orange_HRM_Login getOrangeHRM_LoginPage;
	Orange_HRM_Dashboard getOrangeHRM_DashboardPage;

	@BeforeTest
	public void precondition() {
		driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
		// initialize your required WebPage class
		getOrangeHRM_LoginPage = new Orange_HRM_Login(driver);
		getOrangeHRM_DashboardPage = new Orange_HRM_Dashboard(driver);
	}

	@Test
	public void testLoginLogout() {
		getOrangeHRM_LoginPage.loginInOrangeHrmApplication("Admin", "admin123");
		String expectedHomeUrl="dashboard";
		String actualHomeUrl=getCurrentUrlOfApplication();
		Assert.assertTrue(actualHomeUrl.contains(expectedHomeUrl),"Home page not opened");
	}
	


	@AfterTest
	public void postCondition() {
		getOrangeHRM_DashboardPage.logoutFromApplication();
		cleanUp();
	}
}