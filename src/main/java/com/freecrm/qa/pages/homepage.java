package com.freecrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.qa.testbase.Testbase;

public class homepage extends Testbase {
	
	@FindBy(xpath="//td[contains(text(), 'User: Ravi Puvvada')]")
	WebElement usernamelabel;
	
	@FindBy(xpath="//a[contains(text(), 'Contacts')]")
	WebElement Contactslink;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	WebElement newcontactlink;
	
	
	@FindBy(xpath="//a[contains(text(), 'Deals')]")
	WebElement Dealslink;
	
	
	
	public homepage() {
		PageFactory.initElements(driver, this);
	}
	public String validatehomePageTitle(){
		return driver.getTitle();
	}
	public boolean verifycorrectusername() {
		return usernamelabel.isDisplayed();
	}
	public void ClickContactlink() {
		Contactslink.click();
	}
	public void ClickDealspage() {
		Dealslink.click();
	}
	public void Clickonnewcontaclink() {
		
		Actions action = new Actions(driver);
		action.moveToElement(Contactslink).build().perform();
		
		newcontactlink.click();
	}
	
	

}
