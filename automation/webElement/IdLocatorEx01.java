package com.automation.webElement;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocatorEx01 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver chrome = new ChromeDriver();
		
		chrome.get("https://www.saucedemo.com/");
		
		WebElement userName = chrome.findElement(By.id("user-name"));
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement password = chrome.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		WebElement loginButton = chrome.findElement(By.id("login-button"));
		loginButton.click();
		
		WebElement addCart = chrome.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		
		
		Thread.sleep(10000);
		
		chrome.quit();
	}
}
