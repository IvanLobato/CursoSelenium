package com.auotomatedtester.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC003_Chapter1_ValidateButtonLoadPage {
  
  @BeforeTest
  public void beforeTest() {
  }
  @Test
  public void TC003() throws InterruptedException {
	  
	  //Step 1
	  Reporter.log("Launch automatedtester app");
	  System.setProperty("webdriver.chrome.driver", "C:\\GIT\\CursoSelenium\\CursoSelenium\\Drivers\\Chrome\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://book.theautomatedtester.co.uk/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS); //este va a la espera de que cargue la pagina
	//Thread.sleep(3000);// solo se espera el tiempo indicado aunq no haya terminado de cargar la pagina u objeto.
	  
	  //Step 2
	  Reporter.log("Click link Chapter 1");
	  driver.findElement(By.xpath("//a[contains(text(), 'Chapter1')]")).click();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='radiobutton']")));//esta espera va enfocado al objeto
  
	  //Step 3
	  Reporter.log("Click button \"load text to the page\"");
	  driver.findElement(By.xpath("//input[@id='secondajaxbutton']")).click();
	  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	  
	  //Step 4
	  Reporter.log("Verify text box value inserted after click button \"load text to the page\"");
	  String lbl_assertion = driver.findElement(By.xpath("//div[@id=\"html5div\"]/div")).getText();
	  Assert.assertEquals(lbl_assertion,"I have been added with a timeout");
	  
	  //Step 5
	  Reporter.log("Navigate Home page clicking \"Home Page\" link");
	  driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
	  Thread.sleep(3000);
	  
	  //Step 6
	  Reporter.log("Close Browser");
	  driver.close();
	    
  }
  @AfterTest
  public void afterTest() {
  }

}
