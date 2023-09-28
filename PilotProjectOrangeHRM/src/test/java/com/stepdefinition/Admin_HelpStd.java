package com.stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageactions.Admin_HelpActions;
import com.utils.BugStriker;
import com.utils.DriverClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_HelpStd {
	Admin_HelpActions aha = new Admin_HelpActions();
	private String handles = null;
	
	@When("Click on Help")
	public void click_on_help() throws InterruptedException {
		handles = BugStriker.getBeforeWindowHandles();
	    aha.setClickHelp();
	}

	@Then("validate Help function working fine or not")
	public void validate_help_function_working_fine_or_not() throws IOException {
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\AdmihHelp.png"));
		BugStriker.setSwitchBeforeWindow(handles);
	}

}
