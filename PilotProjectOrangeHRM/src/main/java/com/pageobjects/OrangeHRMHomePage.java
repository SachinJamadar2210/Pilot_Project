package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMHomePage {
	@FindBy(xpath="//*[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\"]")
	public static WebElement homePage;
}
