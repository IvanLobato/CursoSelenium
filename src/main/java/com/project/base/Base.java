package com.project.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Base {
	
	/**
	 * Constructor del WebDriver
	 */
	private WebDriver driver;
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Chrome Driver connection
	 * @author ivan.lobato
	 */
	
	public WebDriver chromedriverConnection() {
	System.setProperty(GlobalVariables.CHROME_WEBDRIVER_NAME, GlobalVariables.CHROME_DRIVER_PATH);
	 WebDriver driver = new ChromeDriver();
	return driver;
	}
	/**
	 * Launch Browser
	 * @author ivan.lobato
	 * @param url
	 */
	public void launchBrowser (String url) {
		Reporter.log("Launch Browser"+ url);
		driver.get(url);
		driver.manage().window().maximize();
	    implicitlyWait(5);
		
	}
	
	/**
	 * Reporter Log
	 * @author ivan.lobato
	 */
	public void reporterLog (String log) {
		Reporter.log(log);
	}
	
	/*
	 * Implicit Wait
	 * @author ivan.lobato
	 */
	public void implicitlyWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	/**
	 * Click Object
	 * @author ivan.Lobato
	 * @param Locator
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/**
	 * Wait for Element Present
	 * @author ivan.lobato
	 * @param locator
	 */
	public void waitForElementPresent(By locator) {
		try {
		WebDriverWait wait = new WebDriverWait(driver,GlobalVariables.General_TIMEOUT);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(TimeoutException e) {
			reporterLog("Timeout error");
			
		}
		
	}
	/**
	 * Select
	 *  Value from DropDown by Value
	 * @author ivan.lobato
	 * @param locator, value
	 */
	public void selectByValueDropdown (By locator,String value) {
		waitForElementPresent(locator);
		WebElement element = driver.findElement(locator);
		Select dropdown = new Select(element);
		  dropdown.selectByValue(value);
	}
	
	/**
	 *Close Browser 
	 *@author ivan.lobato
	 */
	
	public void closeBrowser() {
		try {
			reporterLog("Close Browser");
			driver.close();
		}catch(NoSuchSessionException e) {
			reporterLog("Closing Browser is failed");
			
		}
	}
}
