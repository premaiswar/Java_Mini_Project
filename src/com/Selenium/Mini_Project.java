package com.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_Project {
	


	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		
		WebElement new_acc = driver.findElement(By.xpath("//a[@class='login']"));
		new_acc.click();
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    email.sendKeys("iswarperiasamy@gmail.com");
	    
	    WebElement create = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		create.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
        WebElement fname = driver.findElement(By.name("customer_firstname"));
	    fname.sendKeys("Iswar");
				
		WebElement lname = driver.findElement(By.name("customer_lastname"));
		lname.sendKeys("P");
		
		WebElement password = driver.findElement(By.name("passwd"));
		password.sendKeys("qwerty");
		
		WebElement day = driver.findElement(By.id("days"));
		Select q = new Select(day);
		q.selectByValue("3");
		
		WebElement month = driver.findElement(By.id("months"));
		Select w = new Select(month);
        w.selectByValue("6");	
        
        
		WebElement year = driver.findElement(By.id("years"));
		Select e = new Select(year);
		e.selectByValue("1997");
		
		WebElement add_fname = driver.findElement(By.id("firstname"));
		add_fname.sendKeys("Iswar");
		
		WebElement add_lname = driver.findElement(By.id("lastname"));
		add_lname.sendKeys("P");
		
		WebElement add_st_name = driver.findElement(By.id("address1"));
		add_st_name.sendKeys("Melrose Avenue");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Los Angeles");
		
		WebElement state = driver.findElement(By.xpath("(//select[@class='form-control'])[4]"));
		Select r = new Select(state);
		r.selectByVisibleText("California");
		
		WebElement zip = driver.findElement(By.name("postcode"));
		zip.sendKeys("90038");
		
		WebElement con_number = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		con_number.sendKeys("9876543210");
		
		WebElement ref_add = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		ref_add.sendKeys("iswarkathir");
		
		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		register.click();
	
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Screenshot.png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
	}
	
	
	
	

}
