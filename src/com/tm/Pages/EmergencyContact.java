package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class EmergencyContact extends Weblibrary {

	
	@FindBy(how = How.XPATH, using = "//a[text()='Emergency Contacts']")
	public static WebElement Link_EmergencyContact;
	
	@FindBy(how = How.ID, using = "btnAddContact")
	public static WebElement btn_AddContact;
	
	@FindBy(how = How.ID, using = "emgcontacts_name")
	public static WebElement txt_emgContactname;
	

	@FindBy(how = How.ID, using = "emgcontacts_relationship")
	public static WebElement txt_emgcontactsrelationship;
	
	@FindBy(how = How.ID, using = "emgcontacts_mobilePhone")
	public static WebElement txt_emgcontactsmobilePhone;
	
	@FindBy(how = How.ID, using = "btnSaveEContact")
	public static WebElement btn_btnSaveEContact;
	
	
	
	public void EditEmergencycontact()//(String name, String relation, String mobile) 
	{
		boolean status;
				
		status = clickElement(btn_AddContact);
		logEvent(status, "User able to click on add button", "Unable to click on add button");

		wait(1);
		status = setText(txt_emgContactname, "Testing1");
		logEvent(status, "User able to ente the addcontact ", "User unable to ente the addcontact ");
		
		wait(1);
		status = setText(txt_emgcontactsrelationship, "brother");
		logEvent(status, "User able to ente the emgcontactrelationship ", "User unable to ente the emgcontactrelationship ");
		

		wait(1);
		status = setText(txt_emgcontactsmobilePhone, "9989595959");
		logEvent(status, "User able to ente the emgcontactsmobilePhone ", "User unable to ente the emgcontactsmobilePhone ");
		
		wait(1);
		status = clickElement(btn_btnSaveEContact);
		logEvent(status, "User able to click on Save button", "Unable to click on save button");
		
		
	}
}
