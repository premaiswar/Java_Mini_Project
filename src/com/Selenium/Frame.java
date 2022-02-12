package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//single frame
		driver.switchTo().frame("singleframe");
WebElement box1 = driver.findElement(By.xpath("//input[@type='text']"));
		box1.sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		//multi frame
		WebElement iframebutton = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframebutton.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		WebElement box2 = driver.findElement(By.xpath("//input[@type='text']"));
		box2.sendKeys("java");
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
