package com.stepdefinition;


import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.utils.BugStriker;
import com.utils.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;

public class HooKs {
	BugStriker bs = new BugStriker();	
	@When("Use enter login details")
	public void Use_enter_login_details(){
		bs.setLoginBS();
	}
	@Before(order = 1)
		public void before() {
			DriverClass.setUpDriver();;
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
	@After(order = 0)
	public void setLogout() {
		bs.setLogoutBS();
		
	}

}
