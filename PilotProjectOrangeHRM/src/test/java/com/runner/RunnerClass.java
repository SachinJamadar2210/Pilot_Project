package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(
			tags="",
			features = {"src\\test\\resources\\Features\\OHRMLoginPageTest01.feature",
					"src\\test\\resources\\Features\\Admin_UserMagement.feature",
					"src\\test\\resources\\Features\\Admin_Organization.feature",
					"src\\test\\resources\\Features\\Admin_Job.feature"},
			glue ="com.stepdefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}
}

