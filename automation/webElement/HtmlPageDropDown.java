package com.automation.webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HtmlPageDropDown {
	 
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testpages.eviltester.com/styled/basic-html-form-test.html");
		driver.findElement(By.name("username")).sendKeys("Skandha Jain");
		driver.findElement(By.name("password")).sendKeys("Abc@123");
//        driver.findElement(By.xpath("//input[@name='filename']")).sendKeys("C:/Users/Dell/Desktop/Output.txt");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb1']")).click();
        driver.findElement(By.xpath("//input[@type='checkbox' and @value='cb3']")).click();
        driver.findElement(By.xpath("//input[@type='radio' or @value='rd2']")).click();
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='dropdown']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Drop Down Item 5");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"back_to_form\"]")).click();
		
	}
}