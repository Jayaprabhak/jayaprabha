package com.simplilearn.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class login {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shine.com/login/");
		
		
		//email
		WebElement email= driver.findElement(By.id("id_email_login"));
		email.sendKeys("Jayaprabha06@gmail.com");
		
		
		//password
		WebElement password= driver.findElement(By.id("id_password"));
		password.sendKeys("Jayaprabha06");
		
		//button
		WebElement login= driver.findElement(By.cssSelector("#cndidate_login_widget"));
		login.click();
}
}