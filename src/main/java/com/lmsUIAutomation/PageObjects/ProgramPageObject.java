package com.lmsUIAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgramPageObject {
    WebDriver driver;
    String title;



    @FindBy(id="program")
    WebElement programButtonOnNavigationBar;

    @FindBy(xpath = "//*[contains (text(), ' Manage Program')]")
    WebElement programPageTitle;

    @FindBy(id ="new")
    WebElement addAnewProgramButton;

    @FindBy(xpath = "//div[contains(text(),'Active')]/p-radiobutton/div/div[@class='p-radiobutton-box']")
    WebElement activeRadioButton;

    @FindBy(id = "Inactive")
    WebElement inactiveRadioButton;

    @FindBy(id = "programName")
    WebElement programNameTextBox;

    @FindBy(id = "programDescription")
    WebElement programDescriptionTextBox;

    @FindBy(id = "saveProgram")
    WebElement saveProgramButton;

    @FindBy(id = "pr_id_2-label")
    WebElement addNewProgramPopUpTitile;

    public ProgramPageObject(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnProgramButtonOnNavigationBar(){
        programButtonOnNavigationBar.click();
    }

    public void clickAddProgramButton(){
        addAnewProgramButton.click();
    }
    public void createProgramWithValidCredentials(){
        programNameTextBox.sendKeys("SDET1000");
        programDescriptionTextBox.sendKeys("Selenium Automation");
    }

    public void clickActiveRadioButton(){
        activeRadioButton.click();
    }

    public void clickSaveButton(){
        saveProgramButton.click();
    }
    public String getTitleTextAddProgramPopUp(){
        String actualTitle = addNewProgramPopUpTitile.getText();
        return actualTitle;
    }
    public void getTitleOfManageProgramPage(){

        System.out.println( programPageTitle.getText());
    }
}
