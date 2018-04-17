package com.freecrm.qa.contacts;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.pages.contacts;
import com.freecrm.qa.pages.homepage;
import com.freecrm.qa.pages.login;
import com.freecrm.qa.testbase.Testbase;
import com.freecrm.qa.utility.testutil;

public class contactPageTest  extends Testbase{
	login loginPage;
	homepage homePage;
	contacts contactPage;
	testutil testutility;
	@BeforeMethod
	public void setUp(){
		initialization(); 
		loginPage = new login();	
		homePage = new homepage();
		contactPage = new contacts();
		loginPage.loginmenthod("ravipuvvada" ,"ravipuvvada");
		testutil.switchtoframe();
		//homePage.ClickContactlink();
		testutility =new testutil();
		
	}
	@Test(priority=1)
	public void verifycontactlabelTest(){
		//testutil.switchtoframe();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Assert.assertTrue(contactPage.verifycontactlabel());
	}
	@Test(priority=2)
	public void verifynamecheckboxTest() throws Exception {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		contactPage.verifyname();
	}
	
	
	
	/*@DataProvider
	public Object[][] getcrmdata(){
		Object data[][]=excelldata.getTestData("contacts");
		return data;
		
	}
	@Test(priority=3, dataProvider="getcrmdata")
	public void createnewcontactTest(String title, String firstname, String Lastname, String company) {
	homePage.Clickonnewcontaclink();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	contactPage.createnewcontact(title,firstname,Lastname,company);
	//contactPage.createnewcontact("Mr.", "sham", "Nandhan", "google");
	}*/
		
	@AfterMethod
	public void tearDown(){
		//driver.quit();
	}

	
}
