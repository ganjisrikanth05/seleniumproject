package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class NaukriRegister extends Weblibrary {
	

	@FindBy(how = How.XPATH, using = "//a[@href='https://www.naukri.com/account/createaccount?othersrcp=16201&err=1']")
	public static WebElement btn_Regnw;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button']")
	public static WebElement btn_Fresher;
	
	@FindBy(how = How.ID, using = "fname")
	public static WebElement txt_fullname;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement txt_email;
	

	@FindBy(how = How.XPATH,  using = "//input[@type='passwordi']")
	public static WebElement txt_password;
	
	@FindBy(how = How.XPATH,  using = "//input[@name='number']")
	public static WebElement txt_mblenumber;
	
			
	//@FindBy(how = How.XPATH, using = "//input[@type='text']")
	//public static WebElement txt_Location;
	
	@FindBy(how = How.XPATH,  using = "//input[@type='text']")
	public static WebElement txt_locselet;
	
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	public static WebElement btn_regnw;
	
	
	public void editnaukri() {
		
		boolean status;
		
		status = clickElement(btn_Regnw);
		logEvent(status, "User able to click on Registernow link", "Unable to click on Registernow link");
		
		status = clickElement(btn_Fresher);
		logEvent(status, "User able to click on fresher button", "Unable to click on fresher button");
		
		status = setText(txt_fullname, "Ganji Srikanth");
		logEvent(status, "User able to write  fulname ", "Unable to write  fulname");
		
		
		status = setText(txt_email, "ganjisrikanth0528@gmail.com");
		logEvent(status, "User able to write  email ", "Unable to write  email");
		
		status = setText(txt_password, "shirisha28");
		logEvent(status, "User able to write  pasword ", "Unable to write  password");
		
		
		status = setText(txt_mblenumber, "9959210910");
		logEvent(status, "User able to write  mobilenumber ", "Unable to write  mobilenumber");
		
		
		
		//status = clickElement(txt_Location);
		//logEvent(status, "User able to write  city ", "Unable to write  city");
		
		//status = clickElement(txt_locselet);
		status= selectbyName(txt_locselet, "Chennai");
		logEvent(status, "User able to write  state ", "Unable to write  state");
		
		
		status = clickElement(btn_regnw);
		logEvent(status, "User able to click registernow button ", "Unable to write  registernow button");
		
		
		
	}

}
