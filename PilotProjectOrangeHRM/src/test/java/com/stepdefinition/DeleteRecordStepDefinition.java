package com.stepdefinition;

import org.testng.Assert;

import com.pageactions.DeleteRecordAction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DeleteRecordStepDefinition {
	// Create an instance of the DeleteRecordAction class to perform deletion actions
	DeleteRecordAction deleteAction=new DeleteRecordAction();
	
	@Given("scroll down the page")
	public void scroll_down_the_page() {
		// Perform scrolling action on the page
	    deleteAction.scrollDown();
	}

	@Given("I click on delete")
	public void i_click_on_delete() {
		// Perform a click action to delete a record
	    deleteAction.clickOnDelete();
	}

	@Given("I grant delete access")
	public void i_grant_delete_access() {
		// Handle a pop-up or confirmation dialog to grant delete access
	    deleteAction.handlePopUp();
	}

	@Then("validate the deleted record")
	public void validate_the_deleted_record() {
		// Validate that the record deletion was successful by checking for a success message
	    Assert.assertTrue(deleteAction.validateSuccess().contains("Success"));
	}

}
