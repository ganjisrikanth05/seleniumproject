package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.ContactDetails;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.MyInfo;

public class TestCase_editcontactdetails extends DriverClass{
	
	
	@Test
	public void TC0010_EditEmgContact()
	{
String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		MyInfo myinfo = PageFactory.initElements(driver, MyInfo.class);
		
		ContactDetails cd=PageFactory.initElements(driver, ContactDetails.class);
		
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		hpg.NavMyInfo();
		hpg.ContactDetails();
		cd.editcontactdetails();
		hpg.logOut();
		
	}
	
	
	
	
	
	
	

}
