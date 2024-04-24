package com.LMSUIAutomation.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.lmsUIAutomation.Utility.PageObjectManager;
import com.lmsUIAutomation.driverFactory.DriverFactory;


public class TestContext {

	WebDriver driver;
	DriverFactory currentDriver= new DriverFactory();
	public PageObjectManager pageManager;
	
	
	public TestContext()
	{
		 if(driver ==  null)
		 {
		driver = Hooks.getDriver();
		 }
		pageManager = new PageObjectManager(driver);
		
	}
}
