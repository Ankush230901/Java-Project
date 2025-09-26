package com.automation.webElementPart2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeExample {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://jqueryui.com/resizable/");
	
	driver.switchTo().frame(0);
	Actions actions = new Actions(driver);
	WebElement element = driver.findElement(By.cssSelector(".ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se"));
	actions.clickAndHold(element).moveByOffset(150, 150).click().build().perform();
	System.out.println("Resize done");
	}
}
