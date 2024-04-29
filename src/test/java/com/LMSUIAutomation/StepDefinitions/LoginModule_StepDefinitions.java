package com.LMSUIAutomation.StepDefinitions;

import com.lmsUIAutomation.PageObjects.LoginPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginModule_StepDefinitions {
	
	TestContext testContext;
	LoginPageObject loginPage;
	
	public LoginModule_StepDefinitions(TestContext testContext)
	{
		this.testContext = testContext;
		loginPage = testContext.pageManager.getloginPage();
	}
	
	@Given("Admin is in LMS-UI Home Page")
	public void admin_is_in_lms_ui_home_page() {
		loginPage.launchHome();
	}
	@When("Admin enters valid credentials and clicks login button through keyboard")
	public void admin_enters_valid_credentials_and_clicks_login_button_through_keyboard() {
		loginPage.enterValidCredentials();
	}

	@Then("Admin Should land on LMS-UI Dashboard Page")
	public void admin_should_land_on_lms_ui_dashboard_page() {
	
	}


}
