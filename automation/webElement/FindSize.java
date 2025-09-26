package com.automation.webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		
		List<WebElement> checkboxes = driver.findElements(By.name("checkboxes[]"));
		
		System.out.println(checkboxes.size());
		
	}
}
