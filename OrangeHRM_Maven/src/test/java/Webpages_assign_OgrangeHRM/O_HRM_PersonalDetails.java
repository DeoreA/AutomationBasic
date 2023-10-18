package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_PersonalDetails extends all_utilities_std {
	public O_HRM_PersonalDetails(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")
	private WebElement middleName;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button")
	private WebElement SaveButton;
	
	@FindBy(xpath ="//a[text()='Employee List']")
	private WebElement employeeList;

	public void Middlename(String MiddleName) {
		typeInput(middleName, MiddleName);
		clickOnElement(SaveButton);
		clickOnElement(employeeList);
	}
	
}
