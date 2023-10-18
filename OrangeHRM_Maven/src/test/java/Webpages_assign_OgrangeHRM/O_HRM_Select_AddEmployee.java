package Webpages_assign_OgrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class O_HRM_Select_AddEmployee extends all_utilities_std{

	public O_HRM_Select_AddEmployee(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//***************************************************************

	/*@FindBy(name="firstName")
	private WebElement FistName;

	@FindBy(name="lastName")
	private WebElement LastName;

	@FindBy(css=".oxd-form-actions>:last-child")
	private WebElement savebutton;

	public void EnteringDetails(String Aishwarya,String Deore) {
		typeInput(FistName, Aishwarya);
		typeInput(LastName, Deore);
		clickOnElement(savebutton);
	}*/	

	//*******************************************************************
	
/*	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement FistName1;

	@FindBy(css = ".oxd-table-filter>:last-child>form>:last-child>:last-child")
	private WebElement ClickOnSearchName;

	public void searchingDetail(String Aishwarya) {
		typeInput(FistName1, Aishwarya);
		clickOnElement(ClickOnSearchName);	
	}*/
	
	//**************************************************************************
	 
	 
	@FindBy(css = ".oxd-checkbox-input")
	private WebElement tickButton;
	
	@FindBy(xpath = "/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button")
	private WebElement DeleteOpartion;
	
	@FindBy(xpath = "//*[@id='app']/div[3]/div/div/div/div[3]/button[2]")
	private WebElement DeletePermanantly;
	 
	 public void DeletePIM() {
		 clickOnElement(tickButton);	
		 clickOnElement(DeleteOpartion);	
		 clickOnElement(DeletePermanantly);	
	 }
	 
	 
	 
	 
	 
	 
	 
	 }
