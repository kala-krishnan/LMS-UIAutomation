package com.lmsUIAutomation.Utility;

import com.lmsUIAutomation.PageObjects.ProgramPageObject;
import org.openqa.selenium.WebDriver;

import com.lmsUIAutomation.PageObjects.LoginPageObject;

public class PageObjectManager {
	
	WebDriver driver = null;
	LoginPageObject loginPage;
	ProgramPageObject programPage;
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

	public ProgramPageObject getProgramPage()
	{
		if (programPage==null)
		{
			programPage = new ProgramPageObject(driver);
		}
		return programPage;
	}

}
