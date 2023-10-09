package keybord_mouse_opration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utility.std_openbrower_url;

public class keybord_oparation {

	public static void main(String[] args) {
		WebDriver driver=std_openbrower_url.setUp("chrome", "https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']"))
		.sendKeys("Nashik",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//textarea[@class='form-control ng-valid ng-dirty ng-valid-parse ng-touched']")).sendKeys("Nashik");
	}

}
/**
login into Actitime without clicking on Login button

 */
