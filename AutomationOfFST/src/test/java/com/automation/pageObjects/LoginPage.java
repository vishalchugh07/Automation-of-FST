package com.automation.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.testCases.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[(contains(text(),'Log in'))or(contains(text(),'Einloggen'))]")
	WebElement LoginButton;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='login w-100 btn btn-primary']")
	WebElement submitbutton;
	
	public void clicklogin()
	{
		LoginButton.click();
	}
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		submitbutton.click();
	}
}
