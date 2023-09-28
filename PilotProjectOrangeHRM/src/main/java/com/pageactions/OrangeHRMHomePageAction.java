package com.pageactions;
import org.openqa.selenium.support.PageFactory;
import com.pageobjects.OrangeHRMHomePage;
import com.utils.DriverClass;

public class OrangeHRMHomePageAction {
	OrangeHRMHomePage homeLocator = null;
	
	public OrangeHRMHomePageAction() {
		// TODO Auto-generated constructor stub
		
		this.homeLocator = new OrangeHRMHomePage();
		PageFactory.initElements(DriverClass.getDriver(), homeLocator);
	}
	
	public String getHomePageText() {
		return homeLocator.homePage.getText();
	}
}
