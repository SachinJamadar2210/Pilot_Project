package com.pageactions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import com.pageobjects.ReportLocator;
import com.utils.DriverClass;

public class ReportAction {
	ReportLocator reporLocator;
	String reportname;
	
	public ReportAction() {
		this.reporLocator=new ReportLocator();
		PageFactory.initElements(DriverClass.getDriver(), reporLocator);
	}
	
	public void clickOnReport() {
		reporLocator.reports.click();	
	}
	public void clickOnAdd() {
		reporLocator.add.click();
	}
	public void EnterReportName(String reportName) {
		reporLocator.reportName.sendKeys("Java Selenium");
	}
	public void clickOnSelectionCreteria() throws InterruptedException {
		Thread.sleep(3000);
		reporLocator.criteria.click();
	}
	public void chooseCreteria() {
		reporLocator.employeeCriteria.click();
	}
	public void selectGroupField() throws InterruptedException {
		Thread.sleep(3000);
		reporLocator.displayFieldGroup.click();
		
	}
	public void groupOption() {
		reporLocator.groupOption.click();
	}
	
	public void selectDisplayField() throws InterruptedException {
		Thread.sleep(3000);
		reporLocator.displayField.click();
	}
	public void displayOption() {
		reporLocator.fieldOption.click();
	}
	public void clickOnPlus() {
		reporLocator.plus.click();
		
	}
	public void clickOnSave() throws InterruptedException {
		Thread.sleep(3000);
		reporLocator.save.click();
	}
	
	Properties prop=new Properties();
	public void reportName() {
		reportname=prop.getProperty("reportName");
		this.EnterReportName(reportname);
		
	}

}
