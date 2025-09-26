package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample02 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(1);
		
		WebElement button = driver.findElement(By.id("Click"));
		
		System.out.println(button.getText());
		
		driver.switchTo().defaultContent();
		System.out.println("Back to main page");
		
		driver.quit();
		
	}
}
