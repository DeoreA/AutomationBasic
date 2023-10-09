package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sauce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cdn = new ChromeDriver();
		cdn.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cdn.get("https://www.saucedemo.com/");
		System.out.println("Title"+cdn.getTitle());
		cdn.findElement(By.id("user-name")).sendKeys("standard_user");
		cdn.findElement(By.id("password")).sendKeys("secret_sauce");
		//cdn.findElement(By.id("login-button")).click();
	   //validation of user interface(UI)
		WebElement ref_login = cdn.findElement(By.id("login-button"));
		System.out.println("login is display "+ref_login.isDisplayed());
		System.out.println("login is editable "+ref_login.isEnabled());
		System.out.println("Login button name "+ref_login.getText());
		//CSS selector-font,size,colour
		System.out.println("Login text size: "+ref_login.getCssValue("font-size"));
		System.out.println("Login text family: "+ref_login.getCssValue("font-family"));
		System.out.println("Login text color: "+ref_login.getCssValue("color"));
		System.out.println("Login button background color: "+ref_login.getCssValue("background-color"));
	
		cdn.findElement(By.className("bm-burger-button")).click();
		cdn.findElement(By.id("logout_sidebar_link")).click();
		}

}
