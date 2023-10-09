package Testcase_assign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.std_openbrower_url;

public class orange_hrm {

	public static void main(String[] args) throws Throwable {
		WebDriver Driver= std_openbrower_url.setUp("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Driver.manage().window().maximize();
	    Driver.findElement(By.name("username")).sendKeys("Admin");
		Driver.findElement(By.name("password")).sendKeys("admin123");
		Driver.findElement(By.cssSelector(".orangehrm-login-button")).click();
		Driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		Driver.findElement(By.name("firstName")).sendKeys("Pranita");
		Driver.findElement(By.name("lastName")).sendKeys("Deore");
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector(".oxd-switch-input")).click();
		Driver.findElement(By.cssSelector(".orangehrm-employee-form>:nth-child(4)>div>div>div>:nth-child(2)>input")).sendKeys("prau");
		Driver.findElement(By.cssSelector(".orangehrm-employee-form>:nth-child(5)>div>div>div>:last-child>input")).sendKeys("a1499prau");
		Driver.findElement(By.cssSelector(".orangehrm-employee-form>:nth-child(5)>div>:last-child>div>:nth-child(2)>input")).sendKeys("a1499prau");
		Driver.findElement(By.cssSelector(".oxd-form-actions>:last-child")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//a[text()='Employee List']")).click();
		Driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Pranita");
		Thread.sleep(1000);
		Driver.findElement(By.cssSelector(".oxd-table-filter>:last-child>form>:last-child>:last-child")).click();
		Driver.findElement(By.cssSelector(".oxd-checkbox-input")).click();
		Driver.findElement(By.cssSelector(".oxd-button--label-danger")).click();
		Driver.findElement(By.cssSelector(".oxd-sheet>:last-child>:last-child")).click();
		Driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}
