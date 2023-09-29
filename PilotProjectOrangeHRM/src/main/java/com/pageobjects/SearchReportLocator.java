package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchReportLocator {
	@FindBy(xpath="//input[@placeholder='Search']")
	public WebElement search;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']")
	public WebElement pim;
	
	@FindBy(xpath="//a[normalize-space()='Reports']")
	public WebElement reports;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	public WebElement searchReport;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchButton;
	
	@FindBy(xpath="//span[@class='oxd-text oxd-text--span']")
	public WebElement validateRecord;

}
