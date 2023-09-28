package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_UserManagementObj {
	@FindBy(linkText = "Admin") public static WebElement adminOp;
	
	@FindBy(xpath = "//span[text()='User Management ']") 
	public static WebElement userMangement;
	
	@FindBy(linkText = "Users") public static WebElement users;
	
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary']") 
	public static WebElement add;
	
	@FindBy(xpath = "//div[contains(text(),'-- Select --')]") 
	public static WebElement selectuserRole;
		
	@FindBy(xpath = "//input[@placeholder='Type for hints...']") 
	public static WebElement employeeName;
		
	@FindBy(xpath = "//div[@class='orangehrm-card-container']")
	public static WebElement clickBody;

	@FindBy(xpath = "//div[contains(text(),'-- Select --')]") 
	public static WebElement selectstatus;
	
	@FindBy(xpath = "//*[@class='oxd-grid-2 orangehrm-full-width-grid']/div[4]/div/div[2]/input") 
	public static WebElement userName;
	
	@FindBy(xpath = "//*[@class='oxd-form-row user-password-row']/div/div/div/div[2]/input") 
	public static WebElement passWord;
	
	@FindBy(xpath = "//*[@class='oxd-form-row user-password-row']/div/div[2]/div/div[2]/input") 
	public static WebElement confirmPassword;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public static WebElement userinfosave;
	
	@FindBy(xpath = "//span[text()='Invalid']")
	public static WebElement invalidStatus;
	
	@FindBy(xpath = "//span[text()='Invalid']")
	public static WebElement requiredSelect;
	
	@FindBy(xpath = "//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div/div/div[2]/input")
	public static WebElement enterUserName;
	
	@FindBy(xpath ="//button[text()=' Search ']")
	public static WebElement clickSearch;
	
	@FindBy(xpath ="//div[contains(text(),'Bug Striker')]")
	public static WebElement checktheUserName;
	
}
