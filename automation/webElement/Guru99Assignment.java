package com.automation.webElement;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;import org.openqa.selenium.bidi.module.Input;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Guru99Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='user_title']"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Mr");
		
		
		driver.findElement(By.id("user_firstname")).sendKeys("ankush");
		driver.findElement(By.id("user_surname")).sendKeys("Kumar");
		driver.findElement(By.name("phone")).sendKeys("9019623744");
		
		WebElement yearDropdown = driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']"));
		Select year = new Select(yearDropdown);
		year.selectByVisibleText("1995");
		
		WebElement monthDropdown = driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']"));
		Select month = new Select(monthDropdown);
		month.selectByVisibleText("September");
		
		WebElement dateDropdown = driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']"));
		Select date = new Select(dateDropdown);
		date.selectByVisibleText("23");
		
		driver.findElement(By.xpath("//input[@id='licencetype_f']")).click();
		
		
		WebElement occupationDropdown = driver.findElement(By.xpath("//select[@id='user_occupation_id']"));
		Select occupation = new Select(occupationDropdown);
		occupation.selectByVisibleText("Engineer");
		
		driver.findElement(By.name("street")).sendKeys("Vijaynagar");
		driver.findElement(By.name("city")).sendKeys("Hassan");
		
		driver.findElement(By.name("county")).sendKeys("India");
		driver.findElement(By.name("post_code")).sendKeys("573202");
		driver.findElement(By.name("email")).sendKeys("ankush@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.name("c_password")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankush@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//body/p[@class='barone']/a[1]/img[1]")).click();
		
		
		
	}
}
