package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeListLocator {
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[1]")
	public WebElement ename;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement id;
	
	@FindBy(xpath="(//div[contains(text(),'-- Select --')])[1]")
	public WebElement employeeStatus;
	
	@FindBy(xpath="//span[text()='Part-Time Contract']")
	public WebElement statusOption;
	
	@FindBy(xpath="(//input[@placeholder='Type for hints...'])[2]")
	public WebElement supervisor;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")
	public WebElement jobTitle;
	
	@FindBy(xpath="//span[text()='Chief Technical Officer']")
	public WebElement chooseJob;
	
	@FindBy(xpath="(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[3]")
	public WebElement subUnit;
	
	@FindBy(xpath="//span[text()='Engineering']")
	public WebElement chooseSubUnit;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement search;
	
	@FindBy(xpath="//span[text()='(1) Record Found']")
	public WebElement validate;
	
	

}
