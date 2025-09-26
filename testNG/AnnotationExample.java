package com.automation.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationExample {
  @Test
  public void test() {
	  System.out.println("From test methods");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("From before methods");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("From after methods");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("From beforeClass methods");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("From afterClass methods");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("From beforeTest methods");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("From afterTest methods");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("From beforeSuite methods");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("From afterSuite methods");
  }

}
