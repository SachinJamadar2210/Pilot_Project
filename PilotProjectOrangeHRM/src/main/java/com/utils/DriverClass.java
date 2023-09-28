package com.utils;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverClass {

	// Declaration of required variables...
	private static DriverClass driverClass;
	private static WebDriver driver;
	private static WebDriverWait wait;
	private final static int TIMEOUT = 10;

	DriverClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}

	public static void explicitWaitClickable(WebElement explicitWait) {
		wait.until(ExpectedConditions.elementToBeClickable(explicitWait));
	}
	
	public static void explicitWaitVisibility(WebElement explicitWait) {
		wait.until(ExpectedConditions.visibilityOf(explicitWait));
	}


	public static void openPage(String url) {
		driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver() {
		if (driverClass == null) {
			driverClass = new DriverClass();
		}
	}
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
		
		driverClass = null;
	}

	// Closes the currently active tab in the browser.
	public static void closeTab() {
		if (driver != null) {
			driver.close();
		}
		
		driverClass = null;
	}
		
}