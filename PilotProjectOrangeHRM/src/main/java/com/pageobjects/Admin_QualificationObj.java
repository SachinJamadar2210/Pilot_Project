package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_QualificationObj {
	
		@FindBy(xpath = "//header/div[2]/nav[1]/ul[1]/li[4]/span[1]")
		public static WebElement selectQualification;
		
		@FindBy(xpath = "//a[text()='Skills']")
		public static WebElement selectSillks;
		
		@FindBy(xpath = "//button[text()=' Add ']")
		public static WebElement clickAdd;
		
		@FindBy(xpath = "//div[@class='oxd-form-row']/div/div[2]/input")
		public static WebElement userName;
		
		@FindBy(xpath = "//button[text()=' Save ']")
		public static WebElement clickSaveSillks;
}
