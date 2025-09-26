package com.automation.basicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.bing.com/");
		
		driver.manage().window().minimize();
		
		driver.navigate().back();
		
		driver.manage().window().fullscreen();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());
		
		driver.quit();
		
	}
}
