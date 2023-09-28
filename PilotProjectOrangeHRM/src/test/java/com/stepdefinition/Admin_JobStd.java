package com.stepdefinition;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.pageactions.Admin_JobActions;
import com.pageactions.Admin_UserManagementActions;
import com.utils.DriverClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Admin_JobStd {
	Admin_UserManagementActions aum = new Admin_UserManagementActions();
	Admin_JobActions ajActions = new Admin_JobActions();
	
	@Given("Select Job and click on Pay Grades")
	public void select_job_and_click_on_pay_grades() {
	    ajActions.setJob();
	    ajActions.setPayGrades();
	}
	
	@When("Click on Add and fill the details of Pay Grades")
	public void click_on_add_and_filling_the_details_of_Pay_Grades() throws InterruptedException {
	    ajActions.setAddPayGrades();
	    ajActions.setNameinPayGrades();
	}

	@When("Click on Save Pay Grades")
	public void click_on_save_pay_grades() {
		ajActions.setSavePayGrades();		
	}
	
	@Then("User validate the saved successfully Pay Grades")
	public void user_validate_the_saved_successfully_Pay_Grades() throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		File screenshotfile = ((TakesScreenshot)DriverClass.getDriver()).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile,new File("Screenshots\\PayGrades.png"));
			
	}
	
}
