package assigment2;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

public class GSMarena {

	public static void main(String[] args) {
		WebDriver sample = new ChromeDriver();
	//implicit wait
		sample.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	//excplicte wait - webdriverwait
		//WebDriverWait ref= new  WebDriverWait(sample,Duration.ofSeconds(30));
		//ref.until();
		
	//EXplicte wait- fulent wait
		//Fluentwait ref1 = Fluentwait(sample);
		//ref1.withTimeout(Duration.ofSeconds(30));
		//ref1.pollingevery(Duration.ofSeconds(5));
		//ref1.ingoring(NoSuchElementException.class);
		
		sample.get( "https://www.gsmarena.com/");
		List<WebElement> mobile = sample.findElements(By.cssSelector("#wrapper>div>:last-child>aside>div>ul>li>a"));
		for(int i=1; i<mobile.size(); i++) {
			System.out.println(mobile.get(i).getText());
		}System.out.println("count of mobile phones = "+mobile.size());

		WebDriver sample1 = new ChromeDriver();
		sample1.get( "https://www.gsmarena.com/samsung-phones-9.php");
		List<WebElement> mobile1 = sample1.findElements(By.cssSelector("#wrapper>div>:last-child>div>:nth-child(2)>div>ul>li>a"));
		for(int j=1; j<mobile1.size(); j++) {
			System.out.println(mobile1.get(j).getText());
		}System.out.println("count of mobile phones = "+mobile1.size());

		
	}

	
}
