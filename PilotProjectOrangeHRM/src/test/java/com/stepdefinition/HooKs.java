package com.stepdefinition;

import com.utils.DriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooKs {
@Before
public void setUP() {
	DriverClass.setUpDriver();
}
@After
public void setDown() {
	DriverClass.tearDown();
}

}
