package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_EmployeeList extends all_utilities_std {
	
	public O_HRM_EmployeeList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement FistName1;


	@FindBy(css = ".oxd-table-filter>:last-child>form>:last-child>:last-child")
	private WebElement ClickOnSearchName;


	public void searchingDetail(String Aishwarya) {
		typeInput(FistName1, Aishwarya);
		clickOnElement(ClickOnSearchName);	

	}

}
