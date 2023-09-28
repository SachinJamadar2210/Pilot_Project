package com.stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageactions.Admin_OrganizationActions;
import com.utils.DriverClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Admin_Organization_General_InformationStd {
	Admin_OrganizationActions aorg = new Admin_OrganizationActions();
	
	@When("Click on Organization and select General Informationf")
	public void click_on_organization_and_select_general_informationf() {
	    aorg.setOrganization();
	    aorg.setGeneralinfo();
	}

	@When("Click on Edit and fill the details")
	public void click_on_edit_and_fill_the_details() throws InterruptedException {
		Thread.sleep(3000);
		aorg.setEdit();
		Thread.sleep(3000);
		aorg.setOrganizationName();
		aorg.closeEdit();
	}

	@Then("Take screeshotUser succesfully")
	public void take_screeshot_user_validate_the_saved_succesfully() throws IOException {
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\OrganizationEdited.png"));
	}
}

