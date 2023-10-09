package Frame;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.std_openbrower_url;


public class frameassign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=std_openbrower_url.setUp("Chrome", "https://jqueryui.com/");
		
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		 // #sidebar>aside>ul>:last-child>a
		driver.switchTo().frame(0);
		Actions action=new Actions(driver);
		List<WebElement> item=driver.findElements(By.xpath("//html/body/ul/li"));
		System.out.println(" item size:"+item.size());
		for(int i=0;i<item.size();i++)
		{
			System.out.println(item.get(i).getText());
			
		}
		WebElement source=item.get(6);
		WebElement destination=item.get(0);
		action.dragAndDrop(source, destination).build().perform();
		
		WebElement source1=item.get(5);
		WebElement destination1=item.get(0);
		action.dragAndDrop(source1, destination1).build().perform();
		
		WebElement source2=item.get(4);
		WebElement destination2=item.get(0);
		action.dragAndDrop(source2, destination2).build().perform();
		
		
		WebElement source3=item.get(3);
		WebElement destination3=item.get(0);
		action.dragAndDrop(source3, destination3).build().perform();
		
		WebElement source4=item.get(2);
		WebElement destination4=item.get(0);
		action.dragAndDrop(source4, destination4).build().perform();
		
		WebElement source5=item.get(1);
		WebElement destination5=item.get(0);
		action.dragAndDrop(source5, destination5).build().perform();
		
		WebElement source6=item.get(0);
		WebElement destination6=item.get(0);
		action.dragAndDrop(source6, destination6).build().perform();
		//driver.switchTo().defaultContent();
	}
}

