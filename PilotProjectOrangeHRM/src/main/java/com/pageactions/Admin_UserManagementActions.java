package com.pageactions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import com.pageobjects.Admin_UserManagementObj;
import com.utils.DriverClass;

public class Admin_UserManagementActions {
	Admin_UserManagementObj userManagementObj = null;
	
	public Admin_UserManagementActions() {
	
		this.userManagementObj = new Admin_UserManagementObj();
		
		PageFactory.initElements(DriverClass.getDriver(), userManagementObj);
	}
		
	public void setAdmin() {
		userManagementObj.adminOp.click();
	}
	
	public void setUserManagement() {
		userManagementObj.userMangement.click();
	}
	
	public void setUser() {
		userManagementObj.users.click();
	}
	
	public void setAdd() {
		userManagementObj.add.click();
	}
	
	public void addUser() throws InterruptedException {
		userManagementObj.selectuserRole.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.employeeName.sendKeys("a");
		Thread.sleep(2000);
		userManagementObj.employeeName.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.selectstatus.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		userManagementObj.userName.sendKeys("Admin");
		userManagementObj.passWord.sendKeys("admin123");
		userManagementObj.confirmPassword.sendKeys("admin123");
	}
	public void setSaveUser() {
		userManagementObj.userinfosave.click();
	}
	
	public void setClickSearch() {
		userManagementObj.clickSearch.click();
	}
	public void searchUser(String searchName) {
		userManagementObj.enterUserName.sendKeys(searchName);
	}
	
	public String getUserName() {
		return userManagementObj.checktheUserName.getText();
	}
	
	public String getAlertMessage() {
		return DriverClass.getDriver().switchTo().alert().getText();
	}
}