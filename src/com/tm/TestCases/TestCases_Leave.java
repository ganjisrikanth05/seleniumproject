package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.ApplyLeave;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.MyLeave;

public class TestCases_Leave extends DriverClass {

	@Test
	public void TC101_verifyLoginFunctionality() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		
		
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);		

		lp.LoginHRM(data[0], data[1]);
		hpg.Exist();
		hpg.logOut();
	}
	
	//==============================================================================

	@Test
	public void TC102_ApplyLeave() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the pagepattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		// Create the pagepattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		// Create the pagepattern to Apply Leave Page
		ApplyLeave alp = PageFactory.initElements(driver, ApplyLeave.class);
		
		lp.LoginHRM(data[0], data[1]);
		hpg.Exist();
		hpg.NavApplyLeave();
		alp.applyLeave();
		//alp.applyLeav1("Personal Leave", "", "", "hello");
		hpg.logOut();			
	}
	
	//==============================================================================
	
	/*@Test
	public void TC103MyLeave() {
	String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the pagepattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);
		// Create the pagepattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		// Create the pagepattern to Apply Leave Page
		ApplyLeave alp = PageFactory.initElements(driver, ApplyLeave.class);
		// Create the pagepattern to My Leave Page
		MyLeave mylve = PageFactory.initElements(driver, MyLeave.class);
		
		lp.LoginHRM(data[0], data[1]);
		hpg.Exist();
		hpg.NavMyLeave();
		mylve.myLeave("2019-8-12", "2019-12-31");
		hpg.logOut();
		*/
		
	}


