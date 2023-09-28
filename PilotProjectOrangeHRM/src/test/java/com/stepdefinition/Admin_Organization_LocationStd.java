package com.stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageactions.Admin_OrganizationActions;
import com.utils.BugStriker;
import com.utils.DriverClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_Organization_LocationStd {
	Admin_OrganizationActions aorg = new Admin_OrganizationActions();
		
	@When("Click on Organization and select Location")
	public void click_on_organization_and_select_location() throws InterruptedException {
		Thread.sleep(3000);
		aorg.setOrganization();
		aorg.setLocation();

	}

	@When("Click on Add and fill the details")
	public void click_on_add_and_fill_the_details() throws InterruptedException {
		Thread.sleep(3000);
		aorg.setAdd();
		aorg.setName();
		aorg.setCountry();
		aorg.setSave();
	}

	@When("Click on Organization and select Location for search")
	public void click_on_organization_and_select_location_for_search() {
		aorg.setOrganization();
		aorg.setLocation();
	    aorg.setSelectLocation();
	}

	@When("User Click the Search Btn in Organiztion")
	public void user_click_the_search_btn_in_organiztion() throws InterruptedException, IOException {
		aorg.setSearch();
		Thread.sleep(3000);
	}
	
	@Then("get the user and validate the user by it location")
	public void get_the_user_and_validate_the_user_by_it_location() throws IOException {
//		BugStriker.WindowScroll("200");
//		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile,new File("Screenshots\\OrganiztionSearch.png"));
	}
	
}

