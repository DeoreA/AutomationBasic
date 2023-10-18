package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_Select_PIM extends all_utilities_std{
	
	public O_HRM_Select_PIM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath ="//a[text()='Add Employee']" )
	private WebElement addemplye;

	public void ClickOnaddEmplye() {
		clickOnElement(addemplye);
	}	
	@FindBy(name="firstName")
	private WebElement FistName;

	@FindBy(name="lastName")
	private WebElement LastName;

	@FindBy(css=".oxd-form-actions>:last-child")
	private WebElement savebutton;

	public void EnteringDetails(String Aishwarya,String Deore) {
		typeInput(FistName, Aishwarya);
		typeInput(LastName, Deore);
		clickOnElement(savebutton);
	}	
}

