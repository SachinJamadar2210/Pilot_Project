package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.pageactions.AddEmployeeAction;
import com.pageactions.OrangeHRMHomePageAction;
import com.pageactions.OrangeHRMLoginPageActions;
import com.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeDefinition {
	// Initialize necessary objects
	OrangeHRMLoginPageActions ol = new OrangeHRMLoginPageActions();
	OrangeHRMHomePageAction oh = new OrangeHRMHomePageAction();
	AddEmployeeAction addEmp = new AddEmployeeAction();

	@Given("the employee is logged into the {string}")
	public void the_employee_is_logged_into_the(String string) {

		addEmp.openUrl(string); // Open the specified URL
		ol.login(); // Perform login
		ol.setLoingbtn(); // Set the login button

	}

	@When("user click the {string} tab in the menu")
	public void i_click_the_tab_in_the_menu(String string) {
		// Step: Click on a menu tab
		addEmp.clickOnPim();
	}

	@When("user click add Employee")
	public void i_click_the_add_employee() {
		// Step: Click on "Add Employee"
		addEmp.clickOnAddEmp();
	}

	@When("add the details")
	public void add_the_details(io.cucumber.datatable.DataTable dataTable) {
		// Step: Add employee details from a DataTable
		List<List<String>> data = dataTable.cells();
		int rows = dataTable.height();
		for (int i = 1; i < rows; i++) {
			String fname = data.get(i).get(0);
			String mname = data.get(i).get(1);
			String lname = data.get(i).get(2);
			String eId = data.get(i).get(3);
			addEmp.AddEmployee(fname, mname, lname, eId);
		}

	}

	@Then("click on toggleButton")
	public void click_on_toggle_button() {
		// Step: Click on a toggle button
		addEmp.ClickOnToggle();
	}

	@Then("enter details")
	public void enter_details(io.cucumber.datatable.DataTable dataTable) {
		// Step: Enter user details from a DataTable
		List<List<String>> data = dataTable.cells();
		int rows = dataTable.height();
		for (int i = 1; i < rows; i++) {
			String usrname = data.get(i).get(0);
			String passowrd = data.get(i).get(1);
			String confPassword = data.get(i).get(2);
			addEmp.userDetails(usrname, passowrd, confPassword);
		}
	}

	@Then("click on save button")
	public void click_on_save_button() {
		// Step: save the record
		addEmp.clickOnSave();
	}
	
	@Then("click on contactDetails")
	public void click_on_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
	    addEmp.clickOnContact();
	}

	@Then("Enter Data in Contactus form {string} and {int}")
	public void enter_data_in_contactus_form_and(String nickname, Integer rownumber)
			throws InvalidFormatException, IOException {
		// Write code here that turns the phrase above into concrete actions
		ExcelReader excelReader = new ExcelReader();
		List<Map<String, String>> addEmp1 = excelReader.getData("src/main/java/com/testData/orange.xls", nickname);
		String stree1 = addEmp1.get(rownumber).get("str1");
		String stree2 = addEmp1.get(rownumber).get("str2");
		String PerCity = addEmp1.get(rownumber).get("Pcity");
		addEmp.ContactUsForm(stree1, stree2,PerCity);
	}
	
	@Then("save the details")
	public void save_the_details() {
	    // Write code here that turns the phrase above into concrete actions
	    addEmp.clickOnSaveContact();
	}
	@Then("validate successfull addition of contact details")
	public void validate_successfull_addition_of_contact_details() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(addEmp.validate().contains("Successfully Updated"));
	}

}
