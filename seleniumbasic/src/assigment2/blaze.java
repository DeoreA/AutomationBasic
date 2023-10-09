package assigment2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class blaze {
	public static WebDriver brower_url(String brower, String url) {
		WebDriver dr= null;
		if(brower.equalsIgnoreCase("chrome")) {
			dr= new ChromeDriver();
		}else if(brower.equalsIgnoreCase("Firefox")){
			dr = new FirefoxDriver();
		}
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		dr.get(url);
		return dr;
	}
	public static void main(String[] args) {
		WebDriver dr = brower_url("chrome","https://www.demoblaze.com/");
		List<WebElement> listphone = dr.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		for(int i=1; i<listphone.size(); i++) {
			System.out.println(listphone.get(i).getText());	
		}
		List<WebElement> listprize =dr.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
		for(int j=1; j<listprize.size(); j++) {
			System.out.println(listprize.get(j).getText());	
		}
	
	}
	}

