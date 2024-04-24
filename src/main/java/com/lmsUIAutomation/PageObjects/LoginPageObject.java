package com.lmsUIAutomation.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
	WebDriver driver;
	String title;
	
	@FindBy(id="username")
	WebElement userName;
	@FindBy(id="password")
	WebElement passWord;
	
	@FindBy(id="login")
	WebElement loginButton;
	
	
	
	public LoginPageObject(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void launchHome()
	{
		driver.get("https://lms-frontend-api-hackathon-apr-326235f3973d.herokuapp.com/login");
		title= driver.getTitle();
	}
	public void enterValidCredentials()
	{
		userName.sendKeys("sdetorganizers@gmail.com");
		passWord.sendKeys("UIHackathon@02");
		loginButton.click();
	}
	

}
