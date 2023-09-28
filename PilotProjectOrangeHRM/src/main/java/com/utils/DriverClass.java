/**
*	@ Driver Class for all the methods and constructor.
*	@author Bug Strikers (Expleo)
*	@since JDK17 22/09/2023
*/

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

	// Initializes a Chrome WebDriver instance, maximizes the browser window, and sets up implicit and explicit wait mechanisms.
	DriverClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
	}

	// This method utilizes explicit wait, waiting for a given WebElement to become clickable.
	public static void explicitWait(WebElement explicitWait) {
		wait.until(ExpectedConditions.elementToBeClickable(explicitWait));
	}

	// Opens a web page by navigating the WebDriver to the provided URL.
	public static void openPage(String url) {
		driver.get(url);
	}

	// Retrieves the WebDriver instance, allowing external code to access it.
	public static WebDriver getDriver() {
		return driver;
	}

	// Initializes the DriverClass if it hasn't been already, creating a new WebDriver instance if necessary.
	public static void setUpDriver() {
		if (driverClass == null) {
			driverClass = new DriverClass();
		}
	}

	// Closes and quits the WebDriver instance, effectively ending the browser session.
	public static void tearDown() {
		if (driver != null) {
			//driver.quit();
		}
		
		driverClass = null;
	}

//	// Closes the currently active tab in the browser.267910 code26
//	public static void closeTab() {
//		if (driver != null) {
//			//driver.close();
//		//	driver.close();	
//		driverClass = null;
//	}
}
