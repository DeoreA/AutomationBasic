package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class Swag_Finish extends all_utilities_std{
	public Swag_Finish(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "finish")
	private WebElement Finish;
	
	public void finishbutton() {
		clickOnElement(Finish);
	}
}
