package propertyFile_with_Selenium.property_with_selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.std_openbrower_url;

public class selenium_with_property {

	public static void main(String[] args) throws IOException {
		
	FileInputStream ref = new FileInputStream("D:\\Automation folder\\workspace\\seleniumbasic\\src\\propertyFile_with_Selenium\\property_with_selenium\\selenium_property");
	Properties prop=new Properties();
	prop.load(ref);
	
	String browserName=prop.getProperty("browsername");
	String url=prop.getProperty("appUrl");
	String userName=prop.getProperty("user-name");
	String password=prop.getProperty("password");
	
	//WebDriver driver=std_openbrower_url.setUp(browserName,url);
	                           //or
	WebDriver driver=std_openbrower_url.setUp(prop.getProperty("browsername"),prop.getProperty("appUrl"));
			
	driver.findElement(By.id("user-name")).sendKeys(userName);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.id("login-button")).click();
	}

}
