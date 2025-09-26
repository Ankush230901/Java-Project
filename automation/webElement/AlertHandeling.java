package com.automation.webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandeling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		System.out.println("Alert message = " + alert.getText());
//		Thread.sleep(4000);
//		alert.accept();
//		System.out.println("Alert accepted.");
//		Thread.sleep(4000);
		
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		
//		Alert alert2 = driver.switchTo().alert();
//		Thread.sleep(4000);
//		alert2.dismiss();
//		System.out.println("dismiss");
//		Thread.sleep(4000);
//		
//		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
//		alert2.accept();
//		System.out.println("accepted");
		
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Data cannot be used");
		alert.accept();
		
		
		
	}
}
