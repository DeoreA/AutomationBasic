package selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class chrome {

	public static void main(String[] args) {
		//FirefoxDriver fdriver = new FirefoxDriver();
		//ChromeDriver cdriver = new ChromeDriver();
		                 //or
		//WebDriver wdriver = new ChromeDriver();//upcasting
		
//**********************actiTime****************************//
		ChromeDriver cdriver = new ChromeDriver();
	    cdriver.get("https://demo.actiTIME.com");
		System.out.println("Title  "+cdriver.getTitle());
		String sourceCode=cdriver.getPageSource();
		//System.out.println("Source code: "+sourceCode);
		System.out.println("Source code lenght: "+sourceCode.length());
		System.out.println("current url: "+cdriver.getCurrentUrl());
		String Excepted_title = "actiTIME - Login";
		String Actual_title = cdriver.getTitle();
		System.out.println(Actual_title.equals(Excepted_title));
	    cdriver.close();
	
//**********************vtiger****************************//
	ChromeDriver c1driver = new ChromeDriver();
	c1driver.get("https://demo.vtiger.com/vtigercrm/index.php");
	System.out.println("titile" +c1driver.getTitle());
	String sourcecode = c1driver.getPageSource();
	System.out.println("length"+sourcecode.length());
	System.out.println("url"+ c1driver.getCurrentUrl());
	String Excepted_Title = "vtiger";
	String Actual_Title = c1driver.getTitle();
	System.out.println(Actual_Title.equals(Excepted_Title));
	c1driver.close();
	
//**********************flipkart****************************//
	ChromeDriver c2driver = new ChromeDriver();
	c2driver.get("https://www.flipkart.com");
	System.out.println("title" + c2driver.getTitle());
	String sc = c2driver.getPageSource();
	System.out.println("length"+sc.length());
	System.out.println("url"+c2driver.getCurrentUrl());
	String excepted_Title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
	String actual_Title = c2driver.getTitle();
	System.out.println(actual_Title.equals(excepted_Title));
	c2driver.close();
	
//**********************amazon****************************//
	ChromeDriver c3driver = new ChromeDriver();
	c3driver.get("https://www.amazon.com");
	System.out.println("title"+c3driver.getTitle());
	String we =c3driver.getPageSource();
	System.out.println(we.length());
	System.out.println("url"+c3driver.getCurrentUrl());
	String expect = "Amazon.com";
	String act = c3driver.getTitle();
	System.out.println(act.equals(expect));
	c3driver.close();

//**********************OrangeHRM****************************//
	ChromeDriver c4driver = new ChromeDriver();
	c4driver.get("https://www.orangehrm.com");
	System.out.println("title"+c4driver.getTitle());
	String te = c4driver.getPageSource();
	System.out.println(te.length());
	System.out.println("url"+c4driver.getCurrentUrl());
	String actualtitle = c4driver.getTitle();
	String expectedTitle="OrangeHRM HR Software | OrangeHRM";
	System.out.println(actualtitle.equals(expectedTitle));
	c4driver.close();
	
	
	
	}

}
