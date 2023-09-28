package com.utils;

import org.openqa.selenium.JavascriptExecutor;

import com.pageactions.OrangeHRMLoginPageActions;
public class BugStriker {
	
	OrangeHRMLoginPageActions loginBS = new OrangeHRMLoginPageActions();
	OrangeHRMLoginPageActions logoutBS = new OrangeHRMLoginPageActions();
	
	public void setLoginBS() {
		loginBS.login("Admin","admin123");
	}
	
	public void setLogoutBS() {
		logoutBS.setLogOut();
	}
	
	public static void WindowScroll(String num){
		JavascriptExecutor jss = (JavascriptExecutor)DriverClass.getDriver();
        jss.executeScript("window.scrollBy(0,"+num+")", "");
	}
	
	public static String getBeforeWindowHandles() {
		String windwoBef = DriverClass.getDriver().getWindowHandle();
		return windwoBef;
	}
	
	public static void setSwitchBeforeWindow(String handles) {
		DriverClass.getDriver().switchTo().window(handles);
	}
}

