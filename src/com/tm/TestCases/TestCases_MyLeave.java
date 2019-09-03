package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.MyLeave;

public class TestCases_MyLeave extends DriverClass  {
	
	
	@Test
	public void TC001_Myleave() {
		
		Login lp = PageFactory.initElements(driver, Login.class);		
		// Create the page pattern to Home Page
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		MyLeave ml= PageFactory.initElements(driver, MyLeave.class);
		
		lp.LoginHRM("user02", "TM1234");
		hpg.Exist();
		hpg.NavMyLeave();
		ml.myLeave("2019-08-12", "2019-09-21");
		
		
		hpg.logOut();
		
	}
	
	

}
