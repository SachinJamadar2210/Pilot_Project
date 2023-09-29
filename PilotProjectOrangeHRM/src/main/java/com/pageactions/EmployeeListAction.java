package com.pageactions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.EmployeeListLocator;
import com.utils.DriverClass;

public class EmployeeListAction {
	EmployeeListLocator empAction;
	String strName, empid,supName;
	
	public EmployeeListAction() {
		this.empAction=new EmployeeListLocator();
		
		PageFactory.initElements(DriverClass.getDriver(), empAction);
	}
	
	public void enterDetails(String empname,String id,String superVisior) throws InterruptedException{
		empAction.ename.sendKeys(empname);
		WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(empAction.ename));
		empAction.ename.sendKeys(Keys.ARROW_DOWN);
		 wait.until(ExpectedConditions.elementToBeClickable(empAction.ename));
		empAction.ename.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(empAction.ename));
		empAction.id.sendKeys(id);	
		
		empAction.employeeStatus.click();
		wait.until(ExpectedConditions.elementToBeClickable(empAction.employeeStatus));
		empAction.statusOption.click();
		
		empAction.supervisor.sendKeys(superVisior);
		wait.until(ExpectedConditions.elementToBeClickable(empAction.supervisor));
		empAction.supervisor.sendKeys(Keys.ARROW_DOWN);
		wait.until(ExpectedConditions.elementToBeClickable(empAction.supervisor));
		empAction.supervisor.sendKeys(Keys.ENTER);
		
		
		empAction.jobTitle.click();
		wait.until(ExpectedConditions.elementToBeClickable(empAction.jobTitle));
		empAction.chooseJob.click();
		empAction.subUnit.click();
		wait.until(ExpectedConditions.elementToBeClickable(empAction.subUnit));
		empAction.chooseSubUnit.click();
	}
	public  void clickOnSearch() {
		empAction.search.click();
	}
	
	public void detailsOfEmployee() throws InterruptedException {
		File file=new File("C:\\Users\\pcpatil\\Desktop\\GitEXP\\Pilot_Project\\PilotProjectOrangeHRM\\src\\test\\resources\\EmployeeList.properties");
		
		FileInputStream fileInput=null;
		try {
			fileInput=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop= new Properties();
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		strName=prop.getProperty("EmpName");
		empid=prop.getProperty("EmpId");
		supName=prop.getProperty("SuperVisior");
		this.enterDetails(strName, empid,supName);
		
	}
	public String validateText() {
		return empAction.validate.getText();
	}

}
