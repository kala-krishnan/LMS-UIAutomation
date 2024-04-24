package com.lmsUIAutomation.Utility;

import org.openqa.selenium.WebDriver;

import com.lmsUIAutomation.PageObjects.LoginPageObject;

public class PageObjectManager {
	
	WebDriver driver = null;
	LoginPageObject loginPage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPageObject getloginPage()
	{
		if (loginPage==null)
		{
			loginPage = new LoginPageObject(driver);
		}
		return loginPage;
	}

}
