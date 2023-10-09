package selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actiTIME {

	public static void main(String[] args) {
		WebDriver ac= new ChromeDriver();
		ac.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//selenium 4.0 ....perdefine method
		ac.get("https://demo.actiTIME.com");
		ac.findElement(By.id("username")).sendKeys("admin");
		ac.findElement(By.name("pwd")).sendKeys("manager");
		//login
		ac.findElement(By.id("loginButton")).click();
		//externally we have to use explicit wait for logout
//ac.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//selenium 4.0 ....perdefine method
	    //explicit wait of web driver wait
		String exceptedTitle= "actiTIME - Enter Time-Track";
		WebDriverWait wait = new WebDriverWait(ac, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(exceptedTitle));
		//or
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("LogoutLink")));
		//excepted wait in flunent wait
		FluentWait<WebDriver> ref=new FluentWait<WebDriver>(ac)
				.withTimeout(Duration.ofSeconds(20)); //total time
				//.pollingEvery(Duration.ofSeconds(5)) //retry time
		        //.ignoring(Exception.class);
		String actual_title= ac.getTitle();
		System.out.println("excepted_title"+ exceptedTitle);
		System.out.println("actual_title"+actual_title);
		ac.manage().window().maximize();//to maximized window
		//ac.manage().window().setSize(new dimension(int width, int height));// to minimized window
		ac.navigate().forward();//forward page
		ac.navigate().back();//backward page
		ac.navigate().refresh();//refresh page
		ac.get("https://demo.actiTIME.com");//it will hit the url and will wait for page load
		
		ac.navigate().to("https://demo.actiTIME.com");//it will hit the url and it will not wait for page load
		//logout
		ac.findElement(By.id("logoutLink")).click();// it will not login becuase of time synchronaization(speed doenot match) bettween tool an application
		ac.close();
		
	}

}
