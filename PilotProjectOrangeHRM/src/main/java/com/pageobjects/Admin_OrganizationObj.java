package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_OrganizationObj {
	@FindBy(xpath = "//span[text()='Organization ']") 
	public static WebElement selectOrganization;
	
	@FindBy(linkText = "General Information")
	public static WebElement selectGeneralInformation;
	
	@FindBy(xpath = "//label[text()='Edit']")
	public static WebElement clickEdit;
	
	@FindBy(xpath = "//form[@class='oxd-form']/div/div/div/div/div[2]/input")
	public static WebElement enterOrganization;
	
	@FindBy(xpath ="//a[contains(text(),'Locations')]") 
	public static WebElement selectLocationOp;
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	public static WebElement selectLocation;
	
	@FindBy(xpath ="//button[text()=' Search ']")
	public static WebElement clilckSearch;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	public static WebElement clickAdd;
	
	@FindBy(xpath = "//div[@class='oxd-form-row']/div/div/div/div[2]/input")
	public static WebElement enterName;
	
	@FindBy(xpath = "//div[text()='-- Select --']")
	public static WebElement selectCountry;
	
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement clickSave;
	
}
