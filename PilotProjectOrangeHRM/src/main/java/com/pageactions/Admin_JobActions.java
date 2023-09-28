package com.pageactions;

import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_JobObj;
import com.utils.DriverClass;

public class Admin_JobActions {
		Admin_JobObj jobObj = null;
		public Admin_JobActions() {
			this.jobObj = new Admin_JobObj();	
			PageFactory.initElements(DriverClass.getDriver(), jobObj);
		}
		public void setJob() {
			jobObj.selectJob.click();
		}
		public void setPayGrades() {
			jobObj.selectPayGrades.click();
		}
		
		public void setAddPayGrades() {
			jobObj.clickAddPayGrades.click();
		}
		
		public void setNameinPayGrades() {
			jobObj.entertheName.sendKeys("Sachin");
		}
		public void setSavePayGrades() {
			jobObj.clickSavePayGrades.click();
		}
	}

