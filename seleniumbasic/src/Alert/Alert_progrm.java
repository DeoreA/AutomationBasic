package Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.std_openbrower_url;
public class Alert_progrm {

	public static void main(String[] args) {
		WebDriver driver=std_openbrower_url.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
			
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		System.out.println("Alert msg: "+driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	
	}
}
/*
TODO:
open browser and enter url https://jqueryui.com/
click on sortable
sort element from 7 to 1.
*/