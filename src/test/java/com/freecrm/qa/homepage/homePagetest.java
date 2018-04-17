package com.freecrm.qa.homepage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.pages.homepage;
import com.freecrm.qa.pages.login;
import com.freecrm.qa.testbase.Testbase;
import com.freecrm.qa.utility.testutil;

public class homePagetest extends Testbase{
	
	login loginPage;
	homepage homePage;
	
	
	@BeforeMethod
	public void setUp(){
		initialization(); 
		loginPage = new login();
		homePage = new homepage();
		loginPage.loginmenthod("ravipuvvada" ,"ravipuvvada");
	}
	@Test(priority=1)
	public void homePageTitleTest(){
		String title = homePage.validatehomePageTitle();
		Assert.assertEquals(title, "CRMPRO", "page doesn't matched");
	}
	@Test(priority=2)
	public void verifyusernameTest() {
	    testutil.switchtoframe();
		Assert.assertTrue(homePage.verifycorrectusername());
	}
	@Test(priority=3)
	public void clickoncontactpageTest() {
		   testutil.switchtoframe();
		   homePage.ClickContactlink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
