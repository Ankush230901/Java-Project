package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDescendantExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		
		int totalInputs=driver.findElements(By.xpath("//form[@name='login']/descendant::input")).size();
		System.out.println("Total input fields under form : " + totalInputs);
		
		int totalButton = driver.findElements(By.xpath("//form[@name = 'login']/descendant::button")).size();
		System.out.println("Total input fields under form : + totalButton");
		
		driver.quit();
	}
}
