package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		 driver.manage().window().maximize();

	
		        driver.get("https://jqueryui.com/resizable/");

		        WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));

		     
		        driver.switchTo().frame(iframe);

		
		        WebElement resizeHandle = driver.findElement(By.cssSelector(".ui-resizable-se"));


		        Actions actions = new Actions(driver);
		        actions.clickAndHold(resizeHandle)
		               .moveByOffset(100, 50) 
		               .release()
		               .perform();

		
		        driver.switchTo().defaultContent();


		        driver.quit();
		    
	}
}
