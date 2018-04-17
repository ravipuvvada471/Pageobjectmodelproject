package com.freecrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.freecrm.qa.testbase.Testbase;

public class contacts extends Testbase {
	
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactlabel;
	
	@FindBy(name="first_name")
	WebElement FirstName;
	
	@FindBy(name="surname")
	WebElement SurName;
	
	@FindBy(name="client_lookup")
	WebElement clientlookup;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save' and @class='button']")
	WebElement Savebutton;
	
	
	
	public contacts() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifycontactlabel() {
		
		return contactlabel.isDisplayed();
	}
	
		
	public void verifyname() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'chari kumar')]//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		}
	
	public void createnewcontact(String title, String fn, String Ln, String com) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		FirstName.sendKeys(fn);
		SurName.sendKeys(Ln);
		clientlookup.sendKeys(com);
		Savebutton.click();
		
		
	}
	
}

