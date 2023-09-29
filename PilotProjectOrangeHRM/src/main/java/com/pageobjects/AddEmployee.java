package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployee {
	
	// WebElement for the 'PIM' link in the navigation menu
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM'])[1]")
	public WebElement pim;
	
	// WebElement for the 'Add Employee' 
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	public WebElement AddEmp;
	
	 // WebElement for the 'First Name' input field
	@FindBy(name="firstName")
	public WebElement firstname;
	
	// WebElement for the 'Middle Name' input field
	@FindBy(name="middleName")
	public WebElement middlename;
	
	// WebElement for the 'Last Name' input field
	@FindBy(name="lastName")
	public WebElement lastname;
	
	// WebElement for the 'Employee ID' input field
	@FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
	public WebElement empId;
	
	// WebElement for the toggle button
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	public WebElement toggleButton;
	
	// WebElement for the 'Username' input field
	@FindBy(xpath="(//input[@autocomplete='off'])[1]")
	public WebElement username;
	
	// WebElement for the 'Password' input field
	@FindBy(xpath="(//input[@type='password'])[1]")
	public WebElement pass;
	
	// WebElement for the 'Confirm Password' input field
	@FindBy(xpath="(//input[@type='password'])[2]")
	public WebElement confirmPass;
	
	// WebElement for the 'Save' button
	@FindBy(xpath="//button[@type='submit']")
	public WebElement save;
	
	@FindBy(xpath="//a[normalize-space()='Contact Details']")
	public WebElement contact;
	
	@FindBy(xpath="(//input)[2]")
	public WebElement street1;
	
	@FindBy(xpath="(//input)[3]")
	public WebElement street2;

	@FindBy(xpath="(//input)[4]")
	public WebElement city;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement saveContact;
	
	@FindBy(xpath="//p[text()='Successfully Updated']")
	public WebElement validtaeText;


}
