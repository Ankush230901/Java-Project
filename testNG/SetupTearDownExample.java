package com.automation.testNG;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SetupTearDownExample {
	WebDriver driver;
	
//	Setup + runs before all tests
	@BeforeMethod
	  public void setUp() {
		System.out.println("Opening browser and launch url.");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
	  }
	
	
//	Test1
  @Test(priority = 2)
  public void verifyHomePage() {
	  String title = driver.getTitle();
	  System.out.println("Test 1 : Home Page Title is : " + title);
  }
  
//  Test2
  @Test(priority = 1)
  public void verifyCurrentUrl() {
	  String currentUrl = driver.getCurrentUrl();
	  System.out.println("Test 2: Current URL is : " + currentUrl);
  }
  
  //Teardown Runs after all tests
  @AfterMethod
  public void tearDown() {
	  System.out.println("Closing browser");
	  driver.quit();
  }

}
