package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


public class RunnerClass {
	@CucumberOptions(
			features = "\\src\\test\\resources\\Features\\OHRMLoginPageTest01.feature"
					,
			glue ="com.stepdefinition",
			plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

	}
}

