package com.pageactions;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_OrganizationObj;
import com.utils.DriverClass;

	
	public class Admin_OrganizationActions {
		Admin_OrganizationObj orgObj = null;
			
			public Admin_OrganizationActions() {
				this.orgObj = new Admin_OrganizationObj();
				
				PageFactory.initElements(DriverClass.getDriver(), orgObj);
			}
			
			public void setOrganization() {
				orgObj.selectOrganization.click();
			}
			
			public void setGeneralinfo() {
				orgObj.selectGeneralInformation.click();
			}
			
			public void setEdit() {
				orgObj.clickEdit.click();
			}
			
			public void setOrganizationName() {
				orgObj.enterOrganization.sendKeys("Expleo");
			}
			
			public void closeEdit() {
				orgObj.clickEdit.click();
			}
			
			public void setLocation() {
				orgObj.selectLocationOp.click();
			}
			
			public void setAdd() {
				orgObj.clickAdd.click();
			}
			
			public void setName() {
				orgObj.enterName.sendKeys("Sachin");
			}
			
			public void setCountry() {
				orgObj.selectCountry.click();
				orgObj.selectCountry.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			}
			
			public void setSave() {
				orgObj.clickSave.click();
			}
			
			public void setSelectLocation() {
				orgObj.selectLocation.click();
				orgObj.selectLocation.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			}
			
			public void setSearch() {
				orgObj.clilckSearch.click();
			}
	}



