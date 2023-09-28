package com.stepdefinition;

import java.io.File;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import com.pageactions.SearchReportAction;
import com.utils.DriverClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchReportDefinition {
	// Initialize the SearchReportAction class to perform search and assert actions.
	SearchReportAction searchAction = new SearchReportAction();

	@When("click on the search")
	public void click_on_the_search() {
		// Step: Click on the "Search" button.
		searchAction.searchForPim();
	}

	@When("search for pim and click")
	public void search_for_pim_and_click() {
		// Step: Search for PIM and click.
		searchAction.searchForPim();
	}

	@Then("click on reports")
	public void click_on_reports() {
		// Step: Click on the "Reports" link.
		searchAction.clickReport();
	}

	@When("user enters (.*)$")
	public void user_enters_tr(String reportnames) {
		// Step: User enters a report name.
		searchAction.searchForReport(reportnames);
	}

	@Then("click on search button below")
	public void click_on_search_button_below() throws InterruptedException {
		// Step: Click on the search button below.
		searchAction.clickOnSearch();
	}

	@Then("assert the record")
	public void assert_the_record() {
		// Step: Assert the record is found.
//		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshotfile,new File("Screenshots\\UserValidateSaveSuccessfully.png"));
		Assert.assertTrue(searchAction.validateRecordFound().contains("(1) Record Found"));
	}
}
