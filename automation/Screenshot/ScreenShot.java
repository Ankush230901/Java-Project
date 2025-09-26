package com.automation.Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("userName")).sendKeys("Ankush");
		driver.findElement(By.id("userEmail")).sendKeys("ankush@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Banglore");
		driver.findElement(By.id("permanentAddress")).sendKeys("Hassan");
		driver.findElement(By.id("submit")).click();
		
		File fullscreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fullscreenshot, new File("./screenshot/fullPage.png"));

		driver.quit();
		
		
	}
}
