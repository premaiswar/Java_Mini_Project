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

public class Miniproject {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		sign_in.click();
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("iswarperiasamy@gmail.com");
		
		WebElement password = driver.findElement(By.id("passwd"));
		password.sendKeys("qwerty");
		
		WebElement login = driver.findElement(By.id("SubmitLogin"));
		login.click();
		
		WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		tshirt.click();
		
		//WebElement qview = driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
     	//qview.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
        WebElement addcart = driver.findElement(By.xpath("//a[@title='Add to cart']"));
		addcart.click();
		
		WebElement proceed1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		proceed1.click();
		
		WebElement proceed2 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		proceed2.click();
		
		WebElement proceed3 = driver.findElement(By.name("processAddress"));
		proceed3.click();
		
		WebElement t_c = driver.findElement(By.id("cgv"));
		t_c.click();
		
		WebElement proceed4 = driver.findElement(By.name("processCarrier"));
		proceed4.click();
		
		WebElement payment = driver.findElement(By.xpath("//a[@class='cheque']"));
		payment.click();
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		confirm.click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\sivam\\eclipse-workspace\\Selenium_Project\\Screenshot.png");
		FileUtils.copyFile(src, dest);
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
