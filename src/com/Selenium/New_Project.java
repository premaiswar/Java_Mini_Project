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
import org.openqa.selenium.support.ui.Select;

public class New_Project {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://adactinhotelapp.com/index.php");
	    
	    driver.manage().window().maximize();
	
	    WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("iswariswar");
	
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("qwerty");
	    
	    WebElement login = driver.findElement(By.id("login"));
	    login.click();
	    
	    WebElement location = driver.findElement(By.id("location"));
	    Select q = new Select(location);
	    q.selectByValue("Sydney");
	    
	    WebElement hotel = driver.findElement(By.id("hotels"));
	    Select w = new Select(hotel);
	    w.selectByValue("Hotel Sunshine");
	    
	    WebElement roomtype = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
	    Select e = new Select(roomtype);
	    e.selectByValue("Super Deluxe");
	    
	    WebElement persons = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
	    Select r = new Select(persons);
	    r.selectByIndex(1);
	    
	    WebElement roomcapacity = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
	    Select t = new Select(roomcapacity);
	    t.selectByIndex(2);
	    
	    WebElement submit = driver.findElement(By.id("Submit"));
	    submit.click();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    WebElement selection = driver.findElement(By.xpath("//input[@type='radio']"));
	    selection.click();
	    
	    WebElement continue1 = driver.findElement(By.id("continue"));
	    continue1.click();
	    
	    WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
	    fname.sendKeys("Iswar");
	
	    Thread.sleep(1000);
	    
	    WebElement lname = driver.findElement(By.id("(//input[@type='text'])[12]"));
	    lname.sendKeys("Periasamy");
	    
	    WebElement address = driver.findElement(By.id("address"));
	    address.sendKeys("qwertyuiop");
	    
	    WebElement cardnumber = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
	    cardnumber.sendKeys("9876543210123456");
	    
	    WebElement cardtype = driver.findElement(By.xpath("(//select)[1]"));
	    Select y = new Select (cardtype);
	    y.selectByValue("VISA");
	    
	    WebElement cardmonth = driver.findElement(By.xpath("(//select)[2]"));
	    Select u = new Select(cardmonth);
	    u.selectByValue("2");
	    
	    WebElement cardyear = driver.findElement(By.xpath("(//select)[3]"));
	    Select i = new Select(cardyear);
	    i.selectByValue("2022");
	    
	    WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
	    cvv.sendKeys("123");
	    
	    WebElement book = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	    book.click();
	    
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Screenshot\\hotelbooking.png");
	    FileUtils.copyFile(src, dest);
	    
	    
	
	}
	
	
	

}
