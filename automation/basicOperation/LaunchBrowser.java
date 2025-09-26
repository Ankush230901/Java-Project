package com.automation.basicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.opentelemetry.sdk.metrics.internal.exemplar.AlwaysOffFilter;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C://Users//Dell//eclipse-workspace//SeleniumProject//drivers//msedgedriver.exe");
		WebDriver edge = new EdgeDriver();
		WebDriver edge1 = new EdgeDriver();
		WebDriver edge2 = new EdgeDriver();
		edge.manage().window().maximize();
		
		edge.get("https://www.healthasyst.com/checkinasyst/");
		edge1.get("https://www.youtube.com/");
		edge2.get("https://in.linkedin.com/");
		System.out.println("Website opened successfully");
		
		edge.manage().window().minimize();
		String title=edge.getTitle();
		System.out.println("getTitle() : " + title);
		
		String url = edge.getCurrentUrl();
		System.out.println("getCurrentUrl : " + url);
		
//		String pageSource = edge.getPageSource();
//		System.out.println("getPageSource() : " + pageSource);
		
		String windowHandle = edge.getWindowHandle();
		System.out.println("getWindowHandle() : " + windowHandle);
		
		edge.manage().window().fullscreen();
		edge.navigate().to("https://www.youtube.com/");
		System.out.println("Navigated to youtube");
		
		edge.navigate().back();
		System.out.println("Navigated back to checkInAsyst");

//		edge.navigate().forward();

		
		edge.quit();
	}
	
}
