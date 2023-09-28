package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportLocator {
	@FindBy(xpath="//a[normalize-space()='Reports']")
	public WebElement reports;
	
	@FindBy(xpath="//div[@class='orangehrm-header-container']//child::button")
	public WebElement add;
	
	@FindBy(xpath="//input[@placeholder='Type here ...']")
	public WebElement reportName;
	
	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[1]")
	public WebElement criteria;
	
	@FindBy(xpath="//span[text()='Education']")
	public WebElement employeeCriteria;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")
	public WebElement displayFieldGroup;
	
	@FindBy(xpath="//span[text()='Contact Details']")  
	public WebElement groupOption;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div[1]/div[2]/div/div/div[1]")
	public WebElement displayField;
	
	@FindBy(xpath="//span[text()='Mobile']")
	public WebElement fieldOption;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	public WebElement plus;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save;
	
	
	
	
}
