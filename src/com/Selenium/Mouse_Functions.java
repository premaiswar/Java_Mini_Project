package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Functions {
	
	public static void main(String[] args) throws InterruptedException {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe ");
    
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://demoqa.com/buttons");
		
    driver.manage().window().maximize();
    
    Thread.sleep(1500);
    
    //Action syntax
    Actions qw = new Actions(driver);
    
    //click
    WebElement clickbtn = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
    qw.click(clickbtn).build().perform();

    //rightclick
    WebElement rightclickbtn = driver.findElement(By.id("rightClickBtn"));
    qw.contextClick(rightclickbtn).build().perform();
    
    //doubleclick
    WebElement doubleclickbtn = driver.findElement(By.id("doubleClickBtn"));
    qw.doubleClick(doubleclickbtn).build().perform();
    
    //drag and drop
    driver.navigate().to("http://www.leafground.com/pages/drop.html");
    
    WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drop = driver.findElement(By.id("droppable"));	
	
	qw.dragAndDrop(drag, drop).build().perform();
	
	Thread.sleep(2000);
	//moveToElement
	WebElement move = driver.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']"));
	qw.moveToElement(move).build().perform();
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
