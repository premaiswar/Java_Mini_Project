package com.Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Functions {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Actions qa = new Actions(driver);
		
		WebElement images = driver.findElement(By.xpath("(//a[@class='gb_f'])[2]"));
		qa.contextClick(images).build().perform();
		
		Robot q = new Robot();
		
		q.keyPress(KeyEvent.VK_DOWN);
		q.keyRelease(KeyEvent.VK_DOWN);
		
		q.keyPress(KeyEvent.VK_DOWN);
		q.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
	
	
	
	
	
	
	

}
