package Frame;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.std_openbrower_url;

public class sorted_frame_jquery {

	public static void main(String[] args) throws Exception  {
		WebDriver sample = std_openbrower_url.setUp("chrome","https://jqueryui.com/sortable/");
		Actions action1=new Actions(sample);

		sample.findElement(By.cssSelector("#sidebar>aside>ul>:last-child>a")).click();
		//1st method to enter into frame (index base)
		sample.switchTo().frame(0);
		//2nd method to enter into frame (webElemet base)
		//WebElement frameElement = sample.findElement(By.cssSelector("html>:nth-child(2)>#sortable"));
		//sample.switchTo().frame(frameElement);
		//3rd method to enter into frame (frame-name base)
		//sample.switchTo().frame(frame-name);
		List<WebElement> ref=sample.findElements(By.cssSelector("html>body>#sortable>li"));
		WebElement source = ref.get(0);
		Thread.sleep(2000);
		for(int i=ref.size()-1; i>=1; i--) {
			WebElement destination = ref.get(i);
			action1.dragAndDrop(source, destination).build().perform();
		}

	}
}




