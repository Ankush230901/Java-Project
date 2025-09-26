package com.automation.testNG;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ScreenShotTestNG {

	WebDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
	}
	
	@Test
	public void screenshot() throws IOException {
		File scrnsht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnsht, new File("./screenshot/screenshotTestNg.png"));
		driver.quit();
	}
}
