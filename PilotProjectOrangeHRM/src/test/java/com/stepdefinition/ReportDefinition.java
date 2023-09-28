package com.stepdefinition;

import com.pageactions.ReportAction;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ReportDefinition {
	ReportAction reportAction=new ReportAction();
	@When("I click on reports")
	public void i_click_reports() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.clickOnReport();
	}

	@Then("click on add")
	public void click_on_add() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.clickOnAdd();
	}

	@Then("enter report name")
	public void enter_rport_name() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.reportName();
	}

	@Then("select select criteria")
	public void select_select_criteria() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.clickOnSelectionCreteria();
	    
	}
	@Then("choose the option")
	public void choose_the_option() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.chooseCreteria();
	}
	
	@Then("select dispay fields group")
	public void select_dispay_fields_group() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.selectGroupField();
	}

	@Then("choose display group option")
	public void choose_display_group_option() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.groupOption();
	}

	@Then("select display field")
	public void select_display_field() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.selectDisplayField();
	}

	@Then("choose thr display option")
	public void choose_thr_display_option() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.displayOption();
	}
	@Then("click on plus")
	public void click_on_plus() {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.clickOnPlus();
	}

	@Then("save the record and validate it")
	public void save_the_record() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    reportAction.clickOnSave();
	}


}
