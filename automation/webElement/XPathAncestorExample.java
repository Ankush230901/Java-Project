package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAncestorExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		WebElement ancestorFrom = driver.findElement(By.xpath("//input[@id='username']/ancestor::form"));
		System.out.println("Ancestor form name : " + ancestorFrom.getAttribute("name"));
		
	}
}
