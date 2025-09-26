package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorEx02 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		WebElement searchText = driver.findElement(By.name("search_query"));
		searchText.sendKeys("kgf trailer kannada");
		Thread.sleep(2000);
		
		WebElement searchButton = driver.findElement(By.className("ytSearchboxComponentSearchButton"));
		searchButton.click();
		Thread.sleep(2000);
		
		WebElement video = driver.findElement(By.id("video-title"));
		video.click();
		Thread.sleep(30000);
		
		WebElement pause = driver.findElement(By.id("movie_player"));
		pause.click();
		Thread.sleep(4000);
		
		
		driver.quit();
		
		
	}
}
