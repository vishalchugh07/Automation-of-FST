package com.automation.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public String BaseUrl = " https://qa2.casino.pa.borgataonline.com/en/games";
	public String username = "miney@yopmail.com";
	public String password = "Test@123";
	public static WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	/*@AfterClass
	public void tearDown() {
		driver.quit();
	}*/
}
