package com.automation.basicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.wikipedia.org");
		
		driver.navigate().to("https://www.youtube.com");
		
	}
}
