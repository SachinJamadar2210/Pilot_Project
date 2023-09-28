package com.pageactions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.pageobjects.ConfigurationLocator;
import com.utils.DriverClass;

public class ConfigurationAction {
	
	ConfigurationLocator configLoc;
	String empName;
	WebDriver driver;
	
	public ConfigurationAction() {
		this.configLoc=new ConfigurationLocator();
		
		PageFactory.initElements(DriverClass.getDriver(), configLoc);
	}
	
	public void clickOnReport()  {
		configLoc.configurationList.click();
	}
	public void selectReportingMethods() {
		configLoc.reportingMethods.click();
	}

	public void clickOnAdd() {
		configLoc.add.click();
	}
	public void enterName(String name) {
		configLoc.name.sendKeys("Project");
	}
	public void clickOnSave() {
		configLoc.save.click();
	}
	public String validateRecord() {
		return configLoc.recordFound.getText();
	}
	public void nameEnter() {
		Properties prop=new Properties();
		empName=prop.getProperty("name");
		this.enterName(empName);
	}
}
