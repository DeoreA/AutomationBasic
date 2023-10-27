package StepDefination;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Wabpages_For_Swag.Swag_AddCard;
import Wabpages_For_Swag.Swag_CheckOut;
import Wabpages_For_Swag.Swag_EnterDetails;
import Wabpages_For_Swag.Swag_Finish;
import Wabpages_For_Swag.Swag_Login;
import Wabpages_For_Swag.Swag_ThanksMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.all_utilities_std;

public class Swagstep26_10_23 extends all_utilities_std {
	WebDriver driver;
	Swag_Login getLogin;
	Swag_AddCard getAddCard;
	Swag_CheckOut getCheckout;
	Swag_EnterDetails getDetails;
	Swag_Finish getfinish;
	Swag_ThanksMessage getMessage;
	String ExceptedProduct;
	String ActualProductAdded;
	
	@Given("user is already in Swag application login page")
	public void user_is_already_in_swag_application_login_page() {
		 WebDriver driver = setUp("chrome","https://www.saucedemo.com");
			getLogin = new Swag_Login(driver);
			 getAddCard = new Swag_AddCard(driver);
			 getCheckout = new Swag_CheckOut(driver);
			 getDetails = new Swag_EnterDetails(driver);
			 getfinish = new Swag_Finish(driver);
			 getMessage = new Swag_ThanksMessage(driver);
	 }

	 @Given("logged in with valid username and password")
	 public void logged_in_with_valid_username_and_password() {
		 getLogin.LoginSwagApp("standard_user", "secret_sauce");
	 }

	 @When("User click on any product")
	 public void user_click_on_any_product() throws Throwable {
		 getAddCard.ClickOnProduct();
		 Thread.sleep(2000);
	     
	 }

	 @When("Click on Add to card button")
	 public void click_on_add_to_card_button() throws Throwable {
		 getAddCard.ClickandAdd();
		 Thread.sleep(2000);
	 }

	 @Then("Validate Product is added or not")
	 public void validate_product_is_added_or_not() {
		 getAddCard.ClickOnProduct();
	        getCheckout.CheckOutProduct();
	        Assert.assertEquals(ExceptedProduct, ActualProductAdded);
	 }

	 @Then("user can click on checkout button")
	 public void user_can_click_on_checkout_button() {
		 getCheckout.CheckOutProduct();
	 }

	 @Then("User Enter there  personal detail than click on login button")
	 public void user_enter_there_personal_detail_than_click_on_login_button() {
		 getDetails.userData("Aishwarya", "Deore", "422101");
		 getDetails.clickOnContinue();
	 }

	 @Then("User can able to click on Finish button")
	 public void user_can_able_to_click_on_finish_button() {
		 getfinish.finishbutton();
	 }

	 @Then("User can validate the ThankYou meassage")
	 public void user_can_validate_the_thank_you_meassage() {
		 getMessage.VerifyMessage();

	 }

	 @Then("Logout from application")
	 public void logout_from_application() {
		 getAddCard.Logout();
	 }
	
}