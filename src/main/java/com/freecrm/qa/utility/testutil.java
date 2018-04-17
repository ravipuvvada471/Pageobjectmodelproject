package com.freecrm.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.freecrm.qa.pages.homepage;
import com.freecrm.qa.pages.login;
import com.freecrm.qa.testbase.Testbase;
import com.google.common.io.Files;

public class testutil extends Testbase {
public static int Page_Timeout = 30;
public static int implicit_wait = 15;

login loginPage;
homepage homePage;
 public static void switchtoframe() {
	 driver.switchTo().frame("mainpanel");
 }
 public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	
	Files.copy(scrFile, new File(currentDir + "/Scrennshots/" + System.currentTimeMillis() + ".png"));
	
	}

}
