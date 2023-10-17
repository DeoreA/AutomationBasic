package POM_Test_Script;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Webpages_assign_OgrangeHRM.O_HRM_Dashboard;
import Webpages_assign_OgrangeHRM.O_HRM_EmployeeList;
import Webpages_assign_OgrangeHRM.O_HRM_PersonalDetails;
import Webpages_assign_OgrangeHRM.O_HRM_Select_AddEmployee;
import Webpages_assign_OgrangeHRM.O_HRM_Select_PIM;
import Webpages_assign_OgrangeHRM.O_HRM_login;
import utilities.all_utilities_std;

	public class OrangeHRM_fullscripte extends all_utilities_std {
		WebDriver driver;
		O_HRM_login getLogin;
		O_HRM_Dashboard getDashboard;
		O_HRM_Select_PIM getPim;
		O_HRM_Select_AddEmployee getaddEmplyo;
		O_HRM_PersonalDetails getPersonalDetail;
		O_HRM_EmployeeList getSearchDetail;
		O_HRM_Dashboard getDashboardForLogout;
		
		
		@BeforeTest
		public void pre() {
			driver = setUp("chrome", "https://opensource-demo.orangehrmlive.com/");
			// initialize your required WebPage class
			getLogin = new O_HRM_login(driver);
			getDashboard = new O_HRM_Dashboard(driver);
			getPim= new O_HRM_Select_PIM(driver);
			getaddEmplyo = new O_HRM_Select_AddEmployee(driver);
			getPersonalDetail = new O_HRM_PersonalDetails(driver);
			getSearchDetail = new O_HRM_EmployeeList(driver);
			getDashboardForLogout = new O_HRM_Dashboard(driver);
		}
		
		@Test(priority=1)
		public void login_O_HRM() throws InterruptedException {
			getLogin.loginInOrangeHrmApplication("Admin", "admin123");
		String expectedHomeURL = "dashboard";
		String actualHomeURL = getApplicationUrl();
		Assert.assertTrue(actualHomeURL.contains(expectedHomeURL), "Home page not opened");
		}
		@Test(priority=2)
		public void clickOnpim() {
			getDashboard.ClickOnPIM();
		}
		
	   @Test(priority=3)
	   public void details() {
		   getPim.ClickOnaddEmplye();
		   getPim.EnteringDetails("Aishwarya", "Deore");
		   getPersonalDetail.Middlename("Sunil");
		   
	   }   
	   @Test(priority=4)
		   public void deleteOpration() {
		   getSearchDetail.searchingDetail("Aishwarya");
		   getaddEmplyo.DeletePIM();
			
		}
		
		@AfterTest
		public void post() {
			getDashboardForLogout.logoutFromApplication();
		}
			
		
}
