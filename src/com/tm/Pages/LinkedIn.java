package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class LinkedIn extends Weblibrary {
	
	@FindBy(how = How.XPATH, using = "//input[@id='first-name']")
	public static WebElement txt_firstname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='last-name']")
	public static WebElement txt_Lastname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='join-email']")
	public static WebElement txt_Email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='join-password']")
	public static WebElement txt_password;
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
	public static WebElement btn_agreejoin;
	
	
	public void editLinken() {
		
boolean status;
		
status = setText(txt_firstname, "Srikat");
logEvent(status, "User able to write  firstname ", "Unable to write  firstname");


status = setText(txt_Lastname, "ganji");
logEvent(status, "User able to write  lastname ", "Unable to write  lastname");

status = setText(txt_Email, "shirisha2805@gmail.com");
logEvent(status, "User able to write  email ", "Unable to write  email");


status = setText(txt_password, "linkden");
logEvent(status, "User able to write  password ", "Unable to write  password");

status = clickElement(btn_agreejoin);
logEvent(status, "User able to click on agree&join button", "Unable to click on agree&join button");


		
	}
	
	
	
}
