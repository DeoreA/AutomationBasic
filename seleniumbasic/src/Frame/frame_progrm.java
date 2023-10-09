package Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.std_openbrower_url;

public class frame_progrm {

	public static void main(String[] args) {
		WebDriver driver=std_openbrower_url.setUp("chrome", "https://jqueryui.com/");
		
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		
		//identify frame and switch on it
//		WebElement frameElement=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frameElement);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("tags")).sendKeys("g");
		//get control back to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector(".logo")).click();
		
	}
}
/*
TODO:
open browser and enter url https://jqueryui.com/
click on sortable
sort element from 7 to 1.
*/
