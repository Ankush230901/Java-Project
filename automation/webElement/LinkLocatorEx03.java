package com.automation.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkLocatorEx03 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://demo.guru99.com/test/newtours/");
		driver.get("https://www.healthasyst.com/checkinasyst/");
//		driver.findElement(By.linkText("SIGN-ON")).click();
		
//		driver.findElement(By.partialLinkText("ar Renta")).click();
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int count =0;
		for (WebElement link : elements) {
			System.out.println(link.getText());
			
			count++;
		}
		System.out.println(elements.size());
		
		System.out.println(count);
	}
}
