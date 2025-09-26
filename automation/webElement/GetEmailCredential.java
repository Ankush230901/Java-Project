package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class GetEmailCredential {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("healthasyst@gmail.com");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		String userId = driver.findElement(By.xpath("//td[normalize-space()='mngr635758']")).getText();
		String password = driver.findElement(By.xpath("//td[normalize-space()='jenAnYj']")).getText();
		System.out.println(userId);
		System.out.println(password);
		driver.navigate().to("https://demo.guru99.com/V4/");
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userId);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
		System.out.println("Page logined successfully.");
		Thread.sleep(5000);
		
		driver.quit();
	}
}
