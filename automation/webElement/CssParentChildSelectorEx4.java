package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssParentChildSelectorEx4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector("div#content  > div.example > button")).click();
		System.out.println("Clicked add element button");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
