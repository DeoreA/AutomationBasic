package assigment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automation_register {	
	public static void main(String[] args) {
		WebDriver ref = new ChromeDriver();
		ref.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		ref.get( "https://demo.automationtesting.in/Register.html");
		List<WebElement> menu = ref.findElements(By.cssSelector("#header>nav>div>:last-child>ul>li>a"));
		for(int i=1; i<menu.size(); i++) {
			System.out.println(menu.get(i).getText());
		}System.out.println("count of menu  =  "+menu.size());

	}

}
