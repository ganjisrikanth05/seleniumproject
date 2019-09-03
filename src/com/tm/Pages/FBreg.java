package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class FBreg extends Weblibrary{

	
	
	@FindBy(how = How.XPATH, using = "//input[@name='firstname']")
	public static WebElement txt_FirstName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='lastname']")
	public static WebElement txt_lastname;
	
	
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email__']")
	public static WebElement txt_RegEmail;
	
	@FindBy(how = How.XPATH, using = "//input[@name='reg_email_confirmation__']")
	public static WebElement txt_emailconf;
	
	@FindBy(how = How.XPATH, using = "//input[@name='reg_passwd__']")
	public static WebElement txt_Regpasword;
	
	@FindBy(how = How.XPATH, using = "//select[@id='day']/option[@value='25']")
	public static WebElement txt_Day;
	
	@FindBy(how = How.XPATH, using = "//select[@id='month']/option[@value='9']")
	public static WebElement txt_month;
	
	@FindBy(how = How.XPATH, using = "//select[@id='year']/option[@value='1998']")
	public static WebElement txt_Year;
	

	@FindBy(how = How.XPATH, using = "//input[@value='2']")
	public static WebElement btn_gender;
	
	@FindBy(how = How.XPATH, using = "//button[@name='websubmit']")
	public static WebElement btn_signup;
	
	
	public void Fbregedit() {
		boolean status;
		
		
		status = setText(txt_FirstName, "testing");
		logEvent(status, "User able to write  Firstname ", "Unable to write  Firstname");
		
		status = setText(txt_lastname, "Master");
		logEvent(status, "User able to write  lastname ", "Unable to write  lastname");
		
		status = setText(txt_RegEmail, "TM1234@gmail.com");
		logEvent(status, "User able to write  email ", "Unable to write  email");
		
		status = setText(txt_emailconf, "TM1234@gmail.com");
		logEvent(status, "User able to write  emailconf ", "Unable to write  emailconf");

		status = setText(txt_Regpasword, "Tmaster@");
		logEvent(status, "User able to write  password ", "Unable to write  password");
		
		status = clickElement(txt_Day);
		logEvent(status, "User able to click day", "Unable to click day");
		status = clickElement(txt_month);
		logEvent(status, "User able to click month", "Unable to click month");
		status = clickElement(txt_Year);
		logEvent(status, "User able to click day", "Unable to click day");
		status = clickElement(btn_gender);
		logEvent(status, "User able to click gender", "Unable to click gender");
		status = clickElement(btn_signup);
		logEvent(status, "User able to click signup", "Unable to click signup");
		
	}
	
}
