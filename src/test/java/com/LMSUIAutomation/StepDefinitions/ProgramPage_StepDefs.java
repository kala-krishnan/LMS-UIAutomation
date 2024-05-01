package com.LMSUIAutomation.StepDefinitions;

import com.lmsUIAutomation.PageObjects.ProgramPageObject;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ProgramPage_StepDefs {
    TestContext testContext;
    ProgramPageObject programPage;

    public ProgramPage_StepDefs(TestContext testContext) {
        this.testContext = testContext;
        programPage = testContext.pageManager.getProgramPage();
    }

    @Given("Admin is on manage program page")
    public void admin_is_on_manage_program_page() {
        programPage.clickOnProgramButtonOnNavigationBar();
        programPage.getTitleOfManageProgramPage();
    }

    @When("Admin clicks on add a new program button")
    public void admin_clicks_on_add_a_new_program_button() {
        programPage.clickAddProgramButton();
    }

    @Then("Admin should see popup window with title {string}")
    public void admin_should_see_popup_window_with_title(String ExpectedTitle) {
        String ActualTitle = programPage.getTitleTextAddProgramPopUp();
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Given("Admin is on program details popup window after clicking add a new program button")
    public void admin_is_on_program_details_popup_window_after_clicking_add_a_new_program_button() {
        programPage.getTitleTextAddProgramPopUp();
    }

    @When("Admin click save button after inputting valid credentials")
    public void admin_click_save_button_after_inputting_valid_credentials() {
        programPage.createProgramWithValidCredentials();
        programPage.clickActiveRadioButton();
        programPage.clickSaveButton();
    }

    @Then("Admin should see a message {string}")
    public void admin_should_see_a_message(String string) {
        programPage.getTitleOfManageProgramPage();
    }


   }
