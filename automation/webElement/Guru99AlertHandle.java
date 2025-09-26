package com.automation.webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99AlertHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr635");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jenAnYj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr635758");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jenAnYj");
		
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		System.out.println("Page logined successfully.");
		
		
		
	}
}
