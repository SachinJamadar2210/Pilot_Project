package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteRecordLocator {
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement search;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	public WebElement delete;
	
	@FindBy(xpath="//button[normalize-space()='Yes, Delete']")
	public WebElement alert;
	
	@FindBy(xpath="(//div[@class='oxd-toast oxd-toast--success oxd-toast-container--toast oxd-toast-list-leave-active oxd-toast-list-leave-to'])[1]")
	public WebElement validate;
	
}
