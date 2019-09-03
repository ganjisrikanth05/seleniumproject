package com.tm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Login extends Weblibrary {
	
	//Username Field Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='txtUsername']")
	public static WebElement Edit_UserName;		
		
	//Password field Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='txtPassword']")
	public static WebElement Edit_Password;

	//Login button Webelement
	@FindBy(how = How.XPATH, using = "//input[@id='btnLogin']")
	public static WebElement Btn_Login;	
	
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='login_Layer']")
	public static WebElement Btn_NaukriLogin;	
	
	//login for FLIPKART
	//@FindBy(how = How.XPATH, using = "//a[@text()='Login & Signup']")
	//public static WebElement Btn_FlipkartLogin;	
	
	@FindBy(how = How.XPATH, using = "//input[@class='_2zrpKA _1dBPDZ']")
	public static WebElement txt_FKuser;	
	

	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	public static WebElement txt_pw;

	@FindBy(how = How.XPATH, using = "//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	public static WebElement btn_login;
	
	
	
	//linkedinjoin
	@FindBy(how = How.XPATH, using = "//a[@class='nav__button-tertiary']")
	public static WebElement btn_joinnow;
	
	public void LoginHRM(String uid, String pwd) {
		boolean status;		
		
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");
		
		status = setText(Edit_UserName, uid);
		logEvent(status, "Username enter Sucessfully", " unable to enter Username ");
	
		status = setText(Edit_Password, pwd);
		logEvent(status, "Password enter Sucessfully", " unable to enter Password ");
		
		status = clickElement(Btn_Login);
		logEvent(status, "Able to click the Login button", "unable to Click the Login button");
	}
	
	public void yahoojoin() {
		boolean status;
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");
		
		
		
	}
	
	public void FBLogin() {
		boolean status;
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");
			
	}
	public void Linkedinjoin() {
		boolean status;
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");

		status = clickElement(btn_joinnow);
		logEvent(status, "Able to click the Login button", "unable to Click the Login button");
		
			
	}
	

	public void FlipkartLogin(String uid, String pwd) {
		boolean status;
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");
		
		//status = clickElement(Btn_FlipkartLogin);
		//logEvent(status, "Able to click the Login button", "unable to Click the Login button");
	
		
		status = setText(txt_FKuser, uid);
		logEvent(status, "Username enter Sucessfully", " unable to enter Username ");
	
		status = setText(txt_pw, pwd);
		logEvent(status, "Password enter Sucessfully", " unable to enter Password ");
		
		status = clickElement(btn_login);
		logEvent(status, "Able to click the Login button", "unable to Click the Login button");
		
		
		
		
		
			
	}

	public void NaukriLogin() {
		boolean status;
		status=launchApplication(appURL);
		logEvent(status, "Application launching Sucessfully", "Unable to launch the Application");
		
		status = clickElement(Btn_NaukriLogin);
		logEvent(status, "Able to click the Login button", "unable to Click the Login button");
	}
		
}
