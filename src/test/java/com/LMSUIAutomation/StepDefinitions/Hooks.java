package com.LMSUIAutomation.StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.lmsUIAutomation.driverFactory.DriverFactory;

import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;
	DriverFactory currentDriver= new DriverFactory();
	
	 @Before
	    public void beforeScenario() {
	    	
	    	try {
	    	
	    	if(driver== null) {
	    		driver = currentDriver.launchBrowser();
	    		driver.manage().window().maximize();
	    	
	    	}
//	    	LOG.info("Browser is launched");
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    }
	 public static WebDriver getDriver() {
			return driver;
		}
}
