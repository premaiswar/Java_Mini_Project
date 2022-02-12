package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {
	



	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	//WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		
		//email.sendKeys("qwerty@gmail.com");
		
    //  WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
		 
        // login.click();
		
		WebElement new_account = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		new_account.click();
		
		Thread.sleep(3000);
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Iswar");
		
		WebElement sname = driver.findElement(By.name("lastname"));
		sname.sendKeys("Periasamy");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    email.sendKeys("Iswar@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		pass.sendKeys("12345678");
		
		WebElement category = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		category.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
