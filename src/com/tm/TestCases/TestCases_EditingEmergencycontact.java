package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.EmergencyContact;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.MyInfo;

import junit.framework.Assert;

public class TestCases_EditingEmergencycontact extends DriverClass{
	
	
	@Test
	public void TC0010_EditEmgContact()
	{
	
	String[] data = ReadRowData(CurrentTestCaseName);
	
	// Create the page pattern to Login Page
	Login lp = PageFactory.initElements(driver, Login.class);		
	// Create the page pattern to Home Page
	Home hpg = PageFactory.initElements(driver, Home.class);
	
	MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
	EmergencyContact emg= PageFactory.initElements(driver, EmergencyContact.class);
		
	lp.LoginHRM("user02","TM1234");
	//Assert.assertTrue("Login successfully", condition);
	hpg.NavMyInfo();
	hpg.EmergencyContact();
	hpg.Exist();
	//emg.EditEmergencycontact(data[2],data[3],data[5]);
	emg.EditEmergencycontact();
	hpg.logOut();
		
		
		
	}	
	
}


