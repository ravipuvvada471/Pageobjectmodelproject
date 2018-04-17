package com.freecrm.qa.loginpage;



	import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.qa.pages.homepage;
import com.freecrm.qa.pages.login;
import com.freecrm.qa.testbase.Testbase;
public class loginpagetest  extends Testbase{
login loginPage;
//homepage homePage;



@BeforeMethod
public void setUp(){
	initialization(); 
	loginPage = new login();	
}

@Test(priority=1)
public void loginPageTitleTest(){
	String title = loginPage.validateLoginPageTitle();
	Assert.assertEquals(title, "Free CRM in the cloud software boosts sales");
}

@Test(priority=2)
public void crmLogoImageTest(){
	boolean flag = loginPage.validateCRMImage();
	Assert.assertTrue(flag);
}

@Test(priority=3)
public void loginTest(){
      loginPage.loginmenthod("ravipuvvada" ,"ravipuvvada");
      
}


@AfterMethod
public void tearDown(){
	driver.quit();
}

}
    
