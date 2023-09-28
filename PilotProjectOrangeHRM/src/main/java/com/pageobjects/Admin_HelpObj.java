
package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin_HelpObj {
	
	@FindBy(xpath = "//button[@title=\"Help\"]")
	public static WebElement clikHelp;
	
	@FindBy(partialLinkText = "Admin User Guide")
	public static WebElement getTextHelp;

}
