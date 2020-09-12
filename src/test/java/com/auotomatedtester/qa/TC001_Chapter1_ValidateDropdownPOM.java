package com.auotomatedtester.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.base.Base;
import com.project.base.GlobalVariables;
import com.project.classes.Chapter1Page;
import com.project.classes.HomePage;

public class TC001_Chapter1_ValidateDropdownPOM {
	
	WebDriver driver;
	Base base;
	HomePage home;
	Chapter1Page chapter1;

  @BeforeTest
  public void beforeTest() {
	  
	  base = new Base(driver);
	  driver = base.chromedriverConnection();
	  home = new HomePage(driver);
	  chapter1 = new Chapter1Page(driver);
  }
  @Test
  public void TC001() {
	  
	 //Step 1
	base.launchBrowser(GlobalVariables.SELENIUM_MAIN_URL);
	
	 //Step 2
	home.clickChapter1();
	
	//Step 3
	chapter1.clickRadio();
	
	//Step 4
	chapter1.selectTypeSelenium("Selenium Code");
	
	//Step 5
	chapter1.navigateHomePage();
	
	
	
  }

  @AfterTest
  public void afterTest() {
	//Step 6
		chapter1.closeBrowser();
	  
  }

}
