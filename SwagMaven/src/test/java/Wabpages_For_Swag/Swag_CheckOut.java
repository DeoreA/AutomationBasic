package Wabpages_For_Swag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class  Swag_CheckOut extends all_utilities_std {
	public Swag_CheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="div[class = 'inventory_item_name']")
	private WebElement validating;
	public void validatingProduct() {
		System.out.println("Validating Product Name:- "+validating.getText());	
	}
//	String clickandAdd = "Sauce Labs Backpack";
//	 String ProductAdded = validatingProduct;


	@FindBy(name = "checkout")
	private WebElement Checkout;

	public void cheackOut() {
		clickOnElement(Checkout);
	}


	
}

