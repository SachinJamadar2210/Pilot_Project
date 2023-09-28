package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfigurationLocator {
	

	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM'])[1]")
	public WebElement pim;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-down']")
	public WebElement configurationList;
	
	@FindBy(xpath="//a[contains(text(),'Reporting Methods')]")
	public WebElement reportingMethods;
	
	@FindBy(xpath="//button[normalize-space()='Add']")
	public WebElement add;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement name;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	public WebElement save;
	
	@FindBy(xpath="//div[@class='orangehrm-header-container']//child::p")
	public WebElement recordFound;


}
