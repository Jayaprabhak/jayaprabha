package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebooklogin {
	
	WebDriver driver=null;
	
	 
	
	@Test(groups = "Chrome")
	public void launchChrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(groups = "Chrome",dependsOnMethods = {"launchChrome"})
	public void loginWithChrome() {
		
		driver.findElement(By.id("email")).sendKeys("JP@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.name("login")).submit();
		//driver.close();
	}
}