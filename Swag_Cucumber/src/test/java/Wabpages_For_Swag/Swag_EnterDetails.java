package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class Swag_EnterDetails extends all_utilities_std {
	public Swag_EnterDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "firstName")
	private WebElement firstName;

	@FindBy(name = "lastName")
	private WebElement lastname;

	@FindBy(name = "postalCode")
	private WebElement pinCode;
	
	@FindBy(name = "continue")
	private WebElement login;

	public void userData(String username, String password, String pincode) {
		typeInput(firstName, username);
		typeInput(lastname, password);
		typeInput(pinCode, pincode);
	}
	
	public void clickOnContinue() {
		clickOnElement(login);
	}
}
