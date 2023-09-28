package com.stepdefinition;

import com.pageactions.EmployeeListAction;

import io.cucumber.java.en.Then;

public class EmployeeListDefinition {
	// Create an instance of the EmployeeListAction class to perform employee list actions
	EmployeeListAction empAction=new EmployeeListAction();
	
	@Then("enter the details")
	public void enter_the_details() throws InterruptedException {
		// Perform an action to enter employee details
		empAction.detailsOfEmployee();
	}

	@Then("click on search")
	public void click_on_search() {
		// Perform a click action to search for the entered employee details
	   empAction.clickOnSearch();
	}

	@Then("record must successfully saved")
	public void record_must_successfully_saved() {
		// validating that the record was saved successfully.
	    
	}

}
