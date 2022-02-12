package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	




	public static void main(String[] args) {
		
	  System.getProperty("webdriver.chrome.driver","C: \\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver_win32.zip" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
		
		driver.manage().window().maximize();
		
	  String title = driver.getTitle();
	  System.out.println("Title is :" + title);
	  
      String currentUrl = driver.getCurrentUrl();		
      System.out.println("CurrentUrl is :" + currentUrl);
      
		
	}
	
	
	
	

}
