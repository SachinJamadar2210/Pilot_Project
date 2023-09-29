package com.pageactions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import com.pageobjects.AddEmployee;
import com.utils.DriverClass;

public class AddEmployeeAction {
	AddEmployee addEmp;
	String nick, otId, driving;

	public void openUrl(String url) {
		DriverClass.getDriver().get(url);
	}

	public AddEmployeeAction() {
		this.addEmp = new AddEmployee();
		PageFactory.initElements(DriverClass.getDriver(), addEmp);
	}

	public void clickOnPim() {
		addEmp.pim.click();
	}

	public void clickOnAddEmp() {
		addEmp.AddEmp.click();
	}

	public void enterDetails(String name, String mName, String lName, String id) {
		addEmp.firstname.sendKeys(name);
		addEmp.middlename.sendKeys(mName);
		addEmp.lastname.sendKeys(lName);
		addEmp.empId.sendKeys(id);
	}

	public void ClickOnToggle() {
		addEmp.toggleButton.click();
	}

	public void enterCredential(String userName, String password, String confirmPassword) {
		addEmp.username.sendKeys(userName);
		addEmp.pass.sendKeys(password);
		addEmp.confirmPass.sendKeys(confirmPassword);
	}

	public void AddEmployee(String ename, String midName, String lasName, String eId) {
		this.enterDetails(ename, midName, lasName, eId);

	}

	public void userDetails(String usname, String passwo, String cnfrmpass) {
		this.enterCredential(usname, passwo, cnfrmpass);
	}

	public void clickOnSave() {
		addEmp.save.click();
	}
	
	public void clickOnContact() {
		addEmp.contact.click();
	}

	public void ContactUsForm(String s1,String s2,String s3 )
	{ 
		WebDriverWait wait = new WebDriverWait(DriverClass.getDriver(),Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable(addEmp.street1));
			addEmp.street1.sendKeys(s1);
			wait.until(ExpectedConditions.elementToBeClickable(addEmp.street2));
			addEmp.street2.sendKeys(s2);
			wait.until(ExpectedConditions.elementToBeClickable(addEmp.city));
			addEmp.city.sendKeys(s3);
	    }
	
	public void clickOnSaveContact() {
		addEmp.saveContact.click();
	}
	public String validate() {
		return addEmp.validtaeText.getText();
	}
	
}
