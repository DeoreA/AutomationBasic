package assigment2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class custom_dropdown {

	public static void main(String[] args) {
		WebDriver ref = new ChromeDriver();
		ref.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		//when there is no select option on drpodown than we have to go with custom dropdown
		ref.findElement(By.cssSelector(".dropdown-toggle")).click();

		List<WebElement> options=ref.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		System.out.println("Options count: "+options.size());

		for(int i=0;i<options.size();i++) {
		options.get(i).getText();
		}
		options.get(4).click();		
	}
}


