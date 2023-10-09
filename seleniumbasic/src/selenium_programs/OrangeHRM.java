package selenium_programs;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriver cdrive = new ChromeDriver();
		cdrive.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		cdrive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//cdrive.findElement(By.name("username")).sendKeys("Admin");
		//validation of username
		WebElement userNameInputField=cdrive.findElement(By.name("username"));
		System.out.println("is username input field visible? "+userNameInputField.isDisplayed());
		System.out.println("is username input field editable? "+userNameInputField.isEnabled());
		System.out.println("username input field default value- "+userNameInputField.getAttribute("placeholder"));
		//validation of passward
		//cdrive.findElement(By.name("password")).sendKeys("admin123");
		WebElement passwordInputField=cdrive.findElement(By.name("password"));
		System.out.println("is password input field visible? "+passwordInputField.isDisplayed());
		System.out.println("is password input field editable? "+passwordInputField.isEnabled());
		System.out.println("password input field default value- "+passwordInputField.getAttribute("placeholder"));
		WebElement password_x_y=cdrive.findElement(By.name("password"));
		//Point pp=password_x_y.getLocation();
	//	int pwd_x=pp.getX();
	//	int pwd_y=pp.getY();
		//System.out.println("pwd cord-x: "+pwd_x);
		//System.out.println("pwd cord-y: "+pwd_y);
		WebElement errorMsg=cdrive.findElement(By.className("oxd-input-field-error-message"));
		//Point pe=errorMsg.getLocation();
		//int error_x=pe.getX();
		//int error_y=pe.getY();
		//System.out.println("error cord-x: "+error_x);
		//System.out.println("error cord-y: "+error_y);
		//System.out.println("is error msg getting displayed below password field? "+(pwd_y<error_y));
		cdrive.findElement(By.tagName("button")).click();
		cdrive.findElement(By.className("oxd-userdropdown-name")).click();
		cdrive.findElement(By.linkText("Logout")).click();

	}
}
