package com.automation.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Guru99 {
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Opening browser");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
	}
	
	@Test(enabled = true, invocationCount = 5)
	public void login1() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr635758");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jenAnYj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println("Login1 executed");
		
	}
	@Test(enabled = true , invocationCount = 3)
	public void login2() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("Ankush");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("jenAnYj");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println("Login2 executed");
		
	}
	@Test(  enabled = true,invocationCount = 4,timeOut = 500)
	public void login3() {
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr635");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sagar");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println("Login3 executed");
		
	}

  
  //Teardown Runs after all tests
  @AfterMethod
  public void tearDown() {
	  System.out.println("Closing browser");
	  driver.quit();
  }

}
