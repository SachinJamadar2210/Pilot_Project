package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageactions.ConfigurationAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfigurationDefinition {
	// Create an instance of the ConfigurationAction class to perform configuration actions
	ConfigurationAction configAction=new ConfigurationAction();
	
	@When("I click configuration")
	public void i_click_configuration() {
		// Perform a click action to access the configuration section
	   configAction.clickOnReport();
	}

	@Then("select reporting methods")
	public void select_reporting_methods() {
		// Select reporting methods within the configuration
	    configAction.selectReportingMethods();
	}

	@Then("click add")
	public void click_add() {
		// Perform a click action to add a new reporting method
	    configAction.clickOnAdd();
	}

	@Then("enter name")
	public void enter_name() {
		// Enter a name for the reporting method
	    configAction.nameEnter();
	}
	@Then("click on save")
	public void click_on_save() {
		// Perform a click action to save the configuration
	    configAction.clickOnSave();	
	}
	@Then("assert the found record")
	public void assert_the_found_record() {
		// Assert that the configured record contains the expected text "Reporting Methods"
	    Assert.assertTrue(configAction.validateRecord().contains("Reporting Methods"));
	}
}
