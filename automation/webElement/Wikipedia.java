package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.findElement(By.id("searchInput")).sendKeys("Selenium automation");
		
		driver.findElement(By.cssSelector(".pure-button.pure-button-primary-progressive")).click();
		Thread.sleep(3000);
		
		System.out.println("Wikipedia successfully data searched");
		driver.close();
		
	}
}
