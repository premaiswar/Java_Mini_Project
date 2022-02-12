package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/?utm_source=Admitad&utm_medium=Affiliate&utm_campaign=5c8bb5c3b3310aefd70cf49c834290d7");
		
		driver.manage().window().maximize();
		
		
		//scrollup
		WebElement returns = driver.findElement(By.xpath("//a[@title='Returns']"));
		
		JavascriptExecutor hs = (JavascriptExecutor) driver;
		
		hs.executeScript("arguments[0].scrollIntoView();", returns);
		
		Thread.sleep(2000);
		
		//scrolldown
		WebElement top = driver.findElement(By.xpath("//a[@title='MEN']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		hs.executeScript("arguments[0].scrollIntoView();", top);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
