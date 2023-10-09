package assigment2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class std_dropdown {

	public static void main(String[] args) {
		WebDriver ref = new ChromeDriver();
		ref.get("https://demo.automationtesting.in/Register.html");
		//step1: identify dropdown list
		WebElement skillDropdown=ref.findElement(By.id("Skills"));
		//Step2: create object of Select class and pass above dropdown object to its constructor
		Select slt=new Select(skillDropdown);
		//return ture or flase?
		System.out.println("Is multi-select allowed or not? "+slt.isMultiple());
		System.out.println("Default selected value is: "+slt.getFirstSelectedOption().getText());
		//dropdown list:-
		List<WebElement> skillList=slt.getOptions();
		System.out.println("Skill count: "+skillList.size());

		for(int i=0;i<skillList.size();i++) {
			System.out.println(skillList.get(i).getText());
		}

		//******************3 methods************* :--
		// 1 method
		slt.selectByIndex(2);
		System.out.println("select value from dropdown using index option:"+slt.getFirstSelectedOption().getText());
		// 2n method
	//	slt.selectByValue("Android");
//		System.out.println("select value from dropdown using value option: "+slt.getFirstSelectedOption().getText());
		// 3rd method
	//	slt.selectByVisibleText("Backup Management");
//		System.out.println("select value from dropdown using visible text option: "+slt.getFirstSelectedOption().getText());


		//validate dropdown element sequence 
		
		String expectedOptions="Select Skills,Adobe InDesign,Adobe Photoshop,Analytics,Android,APIs,Art Design,AutoCAD,Backup Management,C,C++,Certifications,Client Server,Client Support,Configuration,Content Managment,Content Management Systems (CMS),Corel Draw,Corel Word Perfect,CSS,Data Analytics,Desktop Publishing,Design,Diagnostics,Documentation,End User Support,Email,Engineering,Excel,FileMaker Pro,Fortran,HTML,Implementation,Installation,Internet,iOS,iPhone,Linux,Java,Javascript,Mac,Matlab,Maya,Microsoft Excel,Microsoft Office,Microsoft Outlook,Microsoft Publisher,Microsoft Word,Microsoft Visual,Mobile,MySQL,Networks,Open Source Software,Oracle,Perl,PHP,Presentations,Processing,Programming,PT Modeler,Python,QuickBooks,Ruby,Shade,Software,Spreadsheet,SQL,Support,Systems Administration,Tech Support,Troubleshooting,Unix,UI / UX,Web Page Design,Windows,Word Processing,XML,XHTML";
		String acutaulOptions="";
		for(int i=0;i<skillList.size();i++) {
			if(i<skillList.size()-1) {
				acutaulOptions=acutaulOptions+skillList.get(i).getText()+",";
			}else {
				acutaulOptions=acutaulOptions+skillList.get(i).getText();
			}
		}
		System.out.println("Actual Options: "+acutaulOptions);		
		System.out.println("is Options sequence correct? "+acutaulOptions.equals(expectedOptions));
		
//*****************************************************************************************//	
		
		// year validation 
		//by using arraylist
		WebElement yearDropdown=ref.findElement(By.id("yearbox"));
		Select years = new Select(yearDropdown);
		ArrayList<WebElement> yearList = new ArrayList<WebElement>(years.getOptions());
		System.out.println("year count: "+yearList.size());
		for(int i=0;i<yearList.size();i++) {
		System.out.println(yearList.get(i).getText());
		}
		//by using only list
//		WebElement yearDropdown=ref.findElement(By.id("yearbox"));
//		Select years = new Select(yearDropdown);
//		List<WebElement> yearList=years.getOptions();
//		System.out.println("year count: "+yearList.size());
//		for(int i=0;i<yearList.size();i++) {
//			System.out.println(yearList.get(i).getText());
//		}
		String exceptedyear="year,1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015";
		String actualyear = "";
		for(int i=0;i<yearList.size();i++) {
			if(i<yearList.size()-1) {
				actualyear=actualyear+yearList.get(i).getText()+",";
			}else {
				actualyear=actualyear+yearList.get(i).getText();
			}
		}
		System.out.println("Actual Options: "+actualyear);		
		System.out.println("is Options sequence correct? "+actualyear.equals(exceptedyear));
		
		
	}
}
