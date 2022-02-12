package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	






	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver_win32.zip");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		WebElement emailid =  driver.findElement(By.name("email"));
		emailid.sendKeys("Qwerty@gmail.com");
	
		String attribute = emailid.getAttribute("name");
		System.out.println(attribute);
		
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("123478");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
