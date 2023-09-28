package com.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooKs {
@Before
public void setUP() {
	DriverClass.setUpDriver();
}
@After(order = 1)

public void takeScreenshot(Scenario scenario) throws IOException{

	if(scenario.isFailed()) {

		TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();

		byte[] scr = ts.getScreenshotAs(OutputType.BYTES);

		scenario.attach(scr,"image/png","Screenshot");

	}else {

		TakesScreenshot ts = (TakesScreenshot) DriverClass.getDriver();

		byte[] scr = ts.getScreenshotAs(OutputType.BYTES);

		scenario.attach(scr,"image/png","Screenshot");
	}

	}
@After
public void setDown() {
	DriverClass.tearDown();
}

}
