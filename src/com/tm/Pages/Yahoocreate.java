package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Yahoocreate extends Weblibrary {
	
	
	
	//@FindBy(how = How.XPATH, using="//a[@href='/account/create?specId=yidReg']")
	//public static WebElement btn_createnow;
	
	@FindBy(how = How.ID, using = "usernamereg-firstName")
	public static WebElement txt_firstname;
	
	@FindBy(how = How.ID, using = "usernamereg-lastName")
	public static WebElement txt_lastname;
	
	@FindBy(how = How.ID, using = "usernamereg-yid")
	public static WebElement txt_email;
	
	@FindBy(how = How.ID, using = "usernamereg-password")
	public static WebElement txt_password;
	
	
	@FindBy(how = How.XPATH,  using = "//input[@type='tel']")
	public static WebElement txt_phone;
	
	@FindBy(how = How.XPATH, using = "//select[@id='usernamereg-month']/option[@value='4']")
	public static WebElement txt_month;
	
	@FindBy(how = How.XPATH, using = "//input[@id='usernamereg-day']")
	public static WebElement txt_day;
	

	@FindBy(how = How.XPATH, using = "//input[@id='usernamereg-year']")
	public static WebElement txt_year;
	
	@FindBy(how = How.XPATH,  using = "//button[@type='submit']")
	public static WebElement btn_continue;
	
	
	
	public void edityahoo() {
		
		boolean status;
		
		//status = clickElement(btn_createnow);
		//logEvent(status, "User able to click on createnow", "Unable to click on createnow");
		
		status = setText(txt_firstname, "srikanth");
		logEvent(status, "User able to write  Firstname ", "Unable to write  Firstname");
		
		status = setText(txt_lastname, "Ganji");
		logEvent(status, "User able to write  lastname ", "Unable to write  lastname");
		
		status = setText(txt_email, "srikanthganji");
		logEvent(status, "User able to write  email ", "Unable to write  email");
		
		status = setText(txt_password, "shirisha28@");
		logEvent(status, "User able to write  password ", "Unable to write  password");
		
		status = setText(txt_phone, "9959210910");
		logEvent(status, "User able to write  ph number ", "Unable to write  ph number ");
		
		
		status = clickElement(txt_month);
		logEvent(status, "User able to click month", "Unable to click month");
		status = setText(txt_day,"5");
		logEvent(status, "User able to write day", "Unable to write day");
		status = setText(txt_year,"1985");
		logEvent(status, "User able to write year", "Unable to write year");
		status = clickElement(btn_continue);
		logEvent(status, "User able to click continue", "Unable to click continue");
			
		
	}
	
	

}
