package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_Dashboard extends all_utilities_std{
	
	public O_HRM_Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[text()='PIM']" )
	private WebElement Pim;
	
	public void ClickOnPIM() {
		clickOnElement(Pim);
	
	}
	

	
// logout process
	@FindBy(css=".oxd-userdropdown-tab")
	private WebElement userProfile;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	
	
	public void logoutFromApplication() {
		clickOnElement(userProfile);
		clickOnElement(logoutLink);
		}
	
}