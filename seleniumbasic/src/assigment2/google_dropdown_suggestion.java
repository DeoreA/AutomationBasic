package assigment2;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class google_dropdown_suggestion {
	public static WebDriver brower_url(String brower, String url) {
		WebDriver drive = null;
		if(brower.equalsIgnoreCase("chrome")) {
		      drive= new ChromeDriver();
		}else if(brower.equalsIgnoreCase("Firefox")){
		      drive = new FirefoxDriver();
		}
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drive.get(url);
		return drive;
		}	
	
	public static void main(String[] args) {
		WebDriver drive = brower_url("chrome", "https://www.google.com/");
		drive.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> suggList=drive.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		int suggCount=suggList.size();
		System.out.println("is Suggestion count 10? "+(suggCount==10));
		
		for(int i=0;i<suggCount;i++) {
			//below line will help you to avoid "StaleElementReferenceException"
			suggList=drive.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			
			WebElement element=suggList.get(i);
			String suggestion=element.getText();
			if(suggestion.contains("selenium")) {
				System.out.println("Suggestion "+i+" matching");
			}else {
				System.out.println("Suggestion "+i+" not matching");
			}
			//System.out.println(suggList.get(i).getText());
		}
	}

}