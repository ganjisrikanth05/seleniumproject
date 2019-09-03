package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.ApplyLeave;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.Timesheets;

public class TestCases_MyTimeSheets extends DriverClass {
	
	@Test
	public void TC1001_EditingMyTimeSheet() {
		
		String[] data = ReadRowData(CurrentTestCaseName);
		
		// Create the page pattern to Login Page
		
		
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		Timesheets tms = PageFactory.initElements(driver, Timesheets.class);
		
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		hpg.Time();
		
		hpg.MyTimesheet();
		tms.MyTimeSheets();
		hpg.logOut();
		

}
}