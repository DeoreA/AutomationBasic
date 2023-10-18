package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_login extends all_utilities_std{
	
	public O_HRM_login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
     //find element
	@FindBy(name="username")
	private WebElement usernameInputField;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement passwordInputField;
	
	@FindBy(css=".orangehrm-login-button")
	private WebElement loginButton;
	
	//sendKeys
	public void loginInOrangeHrmApplication(String username,String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
	}
	
	
	}


