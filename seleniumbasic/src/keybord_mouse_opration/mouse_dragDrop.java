package keybord_mouse_opration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.std_openbrower_url;

public class mouse_dragDrop {

	public static void main(String[] args) {
		WebDriver driver=std_openbrower_url.setUp("chrome", "https://jqueryui.com/droppable/");
		//switching control to frame
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, destination).build().perform();
	}
}
/**
login into Actitime without clicking on Login button

*/
