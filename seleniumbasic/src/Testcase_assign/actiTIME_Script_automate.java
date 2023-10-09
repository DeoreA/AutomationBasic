package Testcase_assign;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTIME_Script_automate {

	public static void main(String[] args) throws InterruptedException {
		WebDriver acti = new ChromeDriver();
		acti.get("https://demo.actiTIME.com");
		acti.manage().window().maximize();
		acti.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		acti.findElement(By.id("username")).sendKeys("admin");
		acti.findElement(By.name("pwd")).sendKeys("manager");
		acti.findElement(By.id("loginButton")).click();
		acti.findElement(By.id("container_tasks")).click();
		acti.findElement(By.className("downIcon")).click();
		acti.findElement(By.className("createNewTasks")).click();


		acti.findElement(By.cssSelector(".customerSelector>div>.comboboxButton>.selectedItem")).click();
		List<WebElement> option=acti.findElements(By.cssSelector(".customerSelector>div>.comboboxButton>:last-child"));
		Thread.sleep(1000);
		System.out.println(option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());
		if(option.size()>2) {
			option.get(option.size()-1).click();
			Thread.sleep(1000);
			acti.findElement(By.cssSelector(".projectSelector>div>.comboboxButton>.selectedItem")).click();
			Thread.sleep(1000);
			List<WebElement> projectList = acti.findElements(By.cssSelector(".projectSelector .searchItemList>div"));		
			if(projectList.size()>3) {
				projectList.get(3).click();
			}else {
				projectList.get(0).click();
				Thread.sleep(1000);
				acti.findElement(By.cssSelector(".selectProjectRow .newProject")).sendKeys("iphone 15");
			}
		}else {
			option.get(0).click();
			Thread.sleep(1000);
			List<WebElement> creted = acti.findElements(By.cssSelector(".newCustomerProjectField"));
			creted.get(0).sendKeys("hello");
			creted.get(1).sendKeys("welcome");
		}
		}
		Thread.sleep(1000);
		acti.findElement(By.cssSelector(".createTasksTable>tbody>tr>td>input")).click();
		acti.findElement(By.cssSelector(".createTasksTable>tbody>tr>td>input")).sendKeys("Aishwarya");
		acti.findElement(By.cssSelector(".basicLightboxFooter>:last-child>div>div>div")).click();

	//	acti.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/table/tbody/tr/td[1]/div/div")).click();
	//	acti.findElement(By.cssSelector("#taskListBlock>:nth-child(4)>div>div>:first-child>div>:nth-child(6)")).click();
	//	acti.findElement(By.cssSelector(".dialogWithPointerWrapper>div>div>div>:nth-child(6)>div>div>span")).click();

			
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		System.out.println(option.size());
		for(int i=0;i<option.size();i++) {
			System.out.println(option.get(i).getText());

			if(option.size()>2) {
				option.get(4).click();
			}else {
				option.get(0).click();
				List<WebElement> newcustomerlist=acti.findElements(By.cssSelector(".newCustomerProjectField"));
				newcustomerlist.get(0).sendKeys("sample");
				newcustomerlist.get(0).sendKeys("NewSample");
			}

		}

		acti.findElement(By.cssSelector(".projectSelector>div>div>:last-child")).click();
		List<WebElement> option1=acti.findElements(By.cssSelector(".projectSelectorRow>td>div>div>:last-child>div>div>div>div"));
		for(int i=0;i<option1.size();i++) {
			System.out.println(option1.get(i).getText());
			if(option1.size()>1) {
				option1.get(5).click();
			}else {
				option1.get(0).click();
				List<WebElement> newcustomerlist1=acti.findElements(By.xpath("//tr[@class='selectProjectRow']/td/input"));
				newcustomerlist1.get(0).sendKeys("NewProject");
			}
		}

		acti.findElement(By.cssSelector("#createTasksPopup_content>:nth-child(2)>div>div>:last-child>div>div>table>tbody>tr>td>input")).click();
		acti.findElement(By.cssSelector(".createTasksTable>tbody>tr>td>input")).sendKeys("Aishwarya D");
		acti.findElement(By.cssSelector(".basicLightboxFooter>:last-child>div>div>div")).click();

		acti.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[1]/table/tbody/tr/td[1]/div/div")).click();
		acti.findElement(By.cssSelector("#taskListBlock>:nth-child(4)>div>div>:first-child>div>:nth-child(6)")).click();
		acti.findElement(By.cssSelector(".dialogWithPointerWrapper>div>div>div>:nth-child(6)>div>div>span")).click();

	}
}

*/



