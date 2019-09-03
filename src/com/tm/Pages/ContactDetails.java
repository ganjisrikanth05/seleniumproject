package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class ContactDetails  extends Weblibrary {
	
	
	@FindBy(how = How.ID, using = "btnSave")
	public static WebElement btn_Edit;
	
	@FindBy(how = How.ID, using = "contact_street1")
	public static WebElement txt_Streetname1;

	@FindBy(how = How.ID, using = "contact_street2")
	public static WebElement txt_Streetname2;
	
	@FindBy(how = How.ID, using = "contact_city")
	public static WebElement txt_city;
	
	@FindBy(how = How.ID, using = "contact_province")
	public static WebElement txt_state;
	
	@FindBy(how = How.XPATH, using = "//select[@id='contact_country']/option[@value='IN']")
	public static WebElement txt_country;
	
	//@FindBy(how = How.XPATH, using = "//select[@id='contact_country']//option[@value='IN']")
	//public static WebElement txt_country;
	

	@FindBy(how = How.ID, using = "contact_emp_mobile")
	public static WebElement txt_mobile;
	
	
	@FindBy(how = How.ID, using = "contact_emp_oth_email")
	public static WebElement txt_Email;
	
	
	public void editcontactdetails() {
		boolean status;
		
		
		status = clickElement(btn_Edit);
		logEvent(status, "User able to click on edit button", "Unable to click on edit button");
		
		
		status = setText(txt_Streetname1, "JNTU");
		logEvent(status, "User able to write  Streetname1 ", "Unable to write  Streetname1");
		
		status = setText(txt_Streetname2,"biside KPHP PS");
		logEvent(status, "User able to write Streetname2", "Unable to write Streetname2");
		
		status = setText(txt_city,"HYD");
		logEvent(status, "User able to write city", "Unable to write city");
		
		status = setText(txt_state,"TS");
		logEvent(status, "User able to write state", "Unable to write state");
		
		status = clickElement(txt_country);
		logEvent(status, "User able to write country", "Unable to write country");
		
		status = setText(txt_mobile,"9012345678");
		logEvent(status, "User able to write mobileno.", "Unable to write mobileno.");
		
		logEvent(status, "User able to write emialid", "Unable to write emailid");
		status =setText(txt_Email,"TM2019@gmial.com");
		
		
		
	}
	
	
	
	
	
}
