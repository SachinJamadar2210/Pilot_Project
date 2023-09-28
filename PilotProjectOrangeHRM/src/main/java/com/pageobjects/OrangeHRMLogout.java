package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMLogout {
	@FindBy(name="username") public static WebElement UserName;
	@FindBy(name="password") public static WebElement passWord;
	@FindBy(xpath="//button[@type=\"submit\"]") public static WebElement clickBtn;
	@FindBy(className = "oxd-icon bi-caret-down-fill oxd-userdropdown-icon") public static WebElement DropDown;
	@FindBy(linkText = "Logout") public static WebElement Logout;
}
