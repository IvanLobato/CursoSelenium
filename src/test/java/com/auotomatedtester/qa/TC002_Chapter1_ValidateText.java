package com.auotomatedtester.qa;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class TC002_Chapter1_ValidateText {
 
  @BeforeTest
  public void beforeTest() {
  }
  
  @Test
  public void TC002() {
	  
	  //Step 1
	  Reporter.log("Launch automatedtester app");
	  System.setProperty("webdriver.chrome.driver", "C:\\GIT\\CursoSelenium\\CursoSelenium\\Drivers\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//Thread.sleep(3000);
	  
	  //Step 2
	  Reporter.log("Click link Chapter 1");
	  driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));
	  
  
  
  }

  @AfterTest
  public void afterTest() {
  }

}
