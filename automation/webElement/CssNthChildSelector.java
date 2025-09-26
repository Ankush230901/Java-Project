package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssNthChildSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/tables");
		
		driver.manage().window().maximize();
		
		String website = driver.findElement(By.cssSelector("#table1 tr:nth-child(4) td:nth-child(5)")).getText();
		
		System.out.println("4 th row web site : " + website);
		
		String title = driver.findElement(By.cssSelector("#table1 thead tr:nth-child(1) th:nth-child(6)")).getText();
		System.out.println("table head 6 th column " + title);
		
//		driver.quit();
		
		driver.navigate().to(website);
	}
}
