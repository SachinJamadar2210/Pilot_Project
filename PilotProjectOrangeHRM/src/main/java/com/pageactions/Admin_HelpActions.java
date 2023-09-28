package com.pageactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import com.pageobjects.Admin_HelpObj;
import com.utils.DriverClass;

public class Admin_HelpActions {
	
		Admin_HelpObj ahobj = null;
		
		public Admin_HelpActions(){
			this.ahobj = new Admin_HelpObj();
			
			PageFactory.initElements(DriverClass.getDriver(), ahobj);
		}
		
		public void setClickHelp() throws InterruptedException {
			ahobj.clikHelp.click();
			Thread.sleep(3000);
			ahobj.clikHelp.sendKeys(Keys.CONTROL,Keys.TAB);
		}
		
		public String getTextsHelpPage() {
			return ahobj.getTextHelp.getText();
		}
	}



