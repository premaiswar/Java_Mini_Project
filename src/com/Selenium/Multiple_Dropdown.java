package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();

		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		 Select s = new Select(multiple);
		 boolean b = s.isMultiple();
		 System.out.println("Is Multiple or not :" + b);
		 
		 s.selectByValue("1");
		 s.selectByIndex(3);
		 s.selectByVisibleText("Appium");
		
		 s.deselectByVisibleText("Appium");
		                                     
		 s.deselectAll(); 
		 
		 //getoptions
		 System.out.println(" < All Options >");
		 
		 List<WebElement> options = s.getOptions();
		 
		 for (WebElement c : options) {
			 String text = c.getText();
			 System.out.println(text);
			
		}
		 
		 //getAllSelectedOptions
		 System.out.println("< All Selected >");
		 
		 List<WebElement> allSelected = s.getAllSelectedOptions();
		 
		 for (WebElement d : allSelected) {
			 String text = d.getText();
			 System.out.println(text);
			
		}
		 
		 //getFirstSelected
		 System.out.println("< First Selected >");
		 
		 WebElement firstSelected = s.getFirstSelectedOption();
		 String text = firstSelected.getText();
		 System.out.println(text);
		 
	}

}





















