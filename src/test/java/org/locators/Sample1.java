package org.locators;

import org.functionallib.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Sample1 extends Baseclass {
	


	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Udhayakumar\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://facebook.com");
	
	driver.manage().window().maximize();
	
	WebElement user = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("pass"));
	
	
	
	
	
}

}
