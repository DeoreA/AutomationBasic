package selenium_programs;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {

		public static void main(String[] args) {
			WebDriver cd = new ChromeDriver();
			cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			cd.get("https://demo.vtiger.com/vtigercrm/index.php");
			System.out.println(cd.getTitle());
			WebElement element=cd.findElement(By.id("username"));
			element.sendKeys("admin");
			element.clear();
			WebElement element1=cd.findElement(By.id("password"));
			element1.sendKeys("admin");
			element1.clear();
			cd.findElement(By.className("username")).sendKeys("admin");
			cd.findElement(By.id("password")).sendKeys("admin");
			cd.findElement(By.tagName("button")).click();
			//cd.findElement(By.className("keyword-input")).click();
			//cd.findElement(By.className("adv-search")).click();
			//cd.findElement(By.className("userName")).click();
                                  //or
			cd.findElement(By.className("fa-user")).click();
			cd.findElement(By.linkText("Sign Out")).click();
		
		}

	}

