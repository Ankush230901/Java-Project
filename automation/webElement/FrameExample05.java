package com.automation.webElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample05 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Click Here")).click();
		
		String parentWindow =  driver.getWindowHandle();
	
		Set<String> handles = driver.getWindowHandles();

		for (String handle : handles) {
			if (!handle.equals(parentWindow)) {
				driver.switchTo().window(handle);
				System.out.println("Child window title : " + driver.getTitle());
				driver.close();
			}
		}
		Thread.sleep(4000);
		driver.switchTo().window(parentWindow);
		System.out.println("Back to parent window : " + driver.getTitle());
		Thread.sleep(4000);
//		driver.quit();
	}
}
