package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(
			tags="",
			features = {"src\\test\\resources\\Features\\AddEmployee.feature","src\\test\\resources\\Features\\Configuration.feature","src\\test\\resources\\Features\\DeleteEmployee.feature","src\\test\\resources\\Features\\EmployeeList.feature","src\\test\\resources\\Features\\Reports.feature","src\\test\\resources\\Features\\SearchReports.feature"},
			glue ="com.stepdefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}
}

