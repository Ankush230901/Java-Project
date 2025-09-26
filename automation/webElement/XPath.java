package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr635758");
		driver.findElement(By.xpath("//input[@name ='password']")).sendKeys("jenAnYj");
//		driver.findElement(By.xpath("//input[@name='btnReset']")).click();
		
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}
}
