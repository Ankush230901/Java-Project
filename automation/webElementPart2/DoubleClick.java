package com.automation.webElementPart2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		
		Actions actions = new Actions(driver);
		WebElement doubleClickBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		actions.doubleClick(doubleClickBtn).perform();
		Thread.sleep(4000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text : " + alert.getText());
		Thread.sleep(4000);
		alert.accept();
		
		driver.quit();
	}
}
