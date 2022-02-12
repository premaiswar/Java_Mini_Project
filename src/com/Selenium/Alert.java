package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		
		//AlertOpening
		
		WebElement alertbutton = driver.findElement(By.xpath("(//h5[@class='wp-categories-title'])[9]"));
		alertbutton.click();
		
		//SimpleAlert
		WebElement button1 = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		button1.click();
		
		Thread.sleep(2000);
		
		 org.openqa.selenium.Alert simpleAlert = driver.switchTo().alert();
		 simpleAlert.accept();
		 
		 //ConfirmAlert
		 WebElement button2 = driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		 button2.click();
		 
		 org.openqa.selenium.Alert confirmAlert = driver.switchTo().alert();
		 confirmAlert.dismiss();
		 
		 //PromptAlert
		 WebElement button3 = driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		 button3.click();
		 
		 Thread.sleep(2000);
		 
		 org.openqa.selenium.Alert promptAlert = driver.switchTo().alert();
		 promptAlert.sendKeys("Java");
		 String text = promptAlert.getText();
		 System.out.println(text);
		 promptAlert.accept();
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
	}
	
	
	

}
