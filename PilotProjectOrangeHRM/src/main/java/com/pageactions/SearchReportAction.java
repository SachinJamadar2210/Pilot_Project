package com.pageactions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.SearchReportLocator;
import com.utils.DriverClass;

public class SearchReportAction {
	SearchReportLocator searchLocator;
	WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(),Duration.ofSeconds(10));
	
	public SearchReportAction() {
		this.searchLocator=new SearchReportLocator();
		PageFactory.initElements(DriverClass.getDriver(), searchLocator);
	}
	
	public void  searchForPim() {
		searchLocator.search.sendKeys("PIM",Keys.ENTER);
		searchLocator.pim.click();
	}
	public void clickReport() {
		searchLocator.reports.click();
	}
	public void searchForReport(String reportname) {
		searchLocator.searchReport.sendKeys(reportname);
		 wait.until(ExpectedConditions.elementToBeClickable(searchLocator.searchReport));
		searchLocator.searchReport.sendKeys(Keys.ARROW_DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(searchLocator.searchReport));
		searchLocator.searchReport.sendKeys(Keys.ENTER);	
	}
	public void clickOnSearch() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(searchLocator.searchButton));
		searchLocator.searchButton.click();
	}
	public String validateRecordFound() {
		return searchLocator.validateRecord.getText();
	}
}
