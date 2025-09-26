package com.automation.webElement;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.asm.Advice.Enter;

public class BookMyShow {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://in.bookmyshow.com/explore/home/mumbai");

		 
		 driver.findElement(By.xpath("//div[@id='common-header-region']//*[name()='svg']")).click();
		 
		 List<WebElement> cityName = driver.findElements(By.cssSelector(".sc-eykeme-1.iVbwwW"));
		 
	
		System.out.println(cityName.size());
		
		for (WebElement city : cityName) {

			String cities = city.getAttribute("alt");
			if (cities.equals("Bengaluru")) {
				city.click();
			}
			
		}
		
		 
	}
}
