package com.automation.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.pageObjects.LoginPage;

public class TC_LoginTest extends BaseClass {

	@Test
	public void LoginTest() {
		driver.get(BaseUrl);
		LoginPage lp = new LoginPage(driver);
		lp.clicklogin();
		lp.setUsername(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equals("borgataonline"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
