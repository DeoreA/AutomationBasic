package Wabpages_For_Swag;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import utilities.all_utilities_std;

public class  Swag_CheckOut extends all_utilities_std {
	public Swag_CheckOut(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(@FindBy(css=".inventory_item_name"))
	private List<WebElement> allProduct;
	
	@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[2]/button[2]")
	private WebElement Checkout;
	
	public void CheckOutProduct() {
		setSleepTime(2000);
		 allProduct.get(0).getText();
		 allProduct.get(1).getText();
		 clickOnElement(Checkout);
	}

	

	
}

