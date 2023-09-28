package com.pageactions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.DeleteRecordLocator;
import com.utils.DriverClass;

public class DeleteRecordAction {
	WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(),Duration.ofSeconds(10));
	
	DeleteRecordLocator deleteLocator;
	//sWebDriver driver;
	
	public DeleteRecordAction() {
		this.deleteLocator=new DeleteRecordLocator();
		PageFactory.initElements(DriverClass.getDriver(), deleteLocator);
	}
	
	public void scrollDown() {
		 wait.until(ExpectedConditions.visibilityOf(deleteLocator.search));
		JavascriptExecutor js = (JavascriptExecutor) DriverClass.getDriver();
		js.executeScript("arguments[0].scrollIntoView();", deleteLocator.search);
	}
	public void clickOnDelete() {
		wait.until(ExpectedConditions.visibilityOf(deleteLocator.delete));
		deleteLocator.delete.click();
		
	}
	public void handlePopUp() {
		deleteLocator.alert.click();
	}
	public String validateSuccess() {
		return deleteLocator.validate.getText();
	}

}
