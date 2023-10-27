package Wabpages_For_Swag;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.model.Test;

import utilities.all_utilities_std;

public class Swag_AddCard extends all_utilities_std {
	public Swag_AddCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBys(@FindBy(css=".inventory_container>div>div>:last-child>:last-child>button"))
	private List<WebElement> allProduct;
	
	 @FindBy(xpath = "//button[text()='Add to cart']")
	    private WebElement Added;
    
    @FindBy(css = ".shopping_cart_link")
    private WebElement SymbolBuy;
    
    public void ClickOnProduct() {
    	clickOnElement(allProduct.get(0));
		clickOnElement(allProduct.get(1));
		clickOnElement(Added);
    }
    
    
  //  public void product() {
  //  	setSleepTime(2000);
   // 	System.out.println("Added product :- "+allProduct.get(0).getText());
//		 allProduct.get(0).getText();
//		 allProduct.get(1).getText();
//	}
 
    
   
    public void ClickandAdd() {
		clickOnElement(SymbolBuy);
		
	}
   

    
    //*************************************************************************
  
    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id= "logout_sidebar_link")
    private WebElement logout;
    
    public void Logout() {
    	clickOnElement(menu);
    	clickOnElement(logout);
    }
	
}
