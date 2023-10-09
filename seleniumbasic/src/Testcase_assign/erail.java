package Testcase_assign;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.std_openbrower_url;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=std_openbrower_url.setUp("chrome", "https://etrain.info/in");	
		//get home window id for future reference
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id:"+homeWinId);
		driver.findElement(By.cssSelector(".icon-twitter")).click();
		//get all window ids open by current driver instance
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All windows id:"+allWinIds);
		allWinIds.remove(homeWinId);
		System.out.println("After removing Home Window id, All windows id:"+allWinIds);

		//		Iterator<String> itr=allWinIds.iterator();
		//		String childWinId=itr.next();
		//or
		String childWinId=allWinIds.iterator().next();
		System.out.println("Child window id: "+childWinId);

		System.out.println("Before switching to child window, current window title: "+driver.getTitle());

		//now we have child window id to switch
		driver.switchTo().window(childWinId);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs("Log in to Twitter / X"));
		System.out.println("After switching to child window, current window title: "+driver.getTitle());
		//below statement will close current window that is Twitter
		//driver.close();
		//now move control back to main window
		driver.switchTo().window(homeWinId);
		System.out.println("After coming back to home window title is: "+driver.getTitle());
		//driver.close();
		//below statement will close all the open instance of driver
		driver.quit();
	}
}
/*
 * open browser and enter url https://erail.in/
 * click on Tour Packages
 * select origin as AHEMDABAD
 * print package name and price
 * come back to main page select source as Pune and destination as Bangalore
 * date from next month
 * print train number and train name 
 * 
 * PIM- create, modify and delete
 */