package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_JobObj {
	
	@FindBy(xpath = "//span[text()='Job ']") 
	public static WebElement selectJob;
	
	@FindBy(xpath = "//a[text()='Pay Grades']")
	public static WebElement selectPayGrades;
	
	@FindBy(xpath = "//button[text()=' Add ']")
	public static WebElement clickAddPayGrades;
	
	@FindBy(xpath = "//label[@class='oxd-label oxd-input-field-required']/following::input")
	public static WebElement entertheName;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public static WebElement clickSavePayGrades;
	
}
