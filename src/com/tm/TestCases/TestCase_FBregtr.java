package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.FBreg;
import com.tm.Pages.Login;

public class TestCase_FBregtr extends DriverClass {
	
	
	@Test
	public void TC01_EditFBreg()
	{
	
		
		Login lp = PageFactory.initElements(driver, Login.class);		
	
		
		FBreg fb=PageFactory.initElements(driver, FBreg.class);
	
	
		lp.FBLogin();
		fb.Fbregedit();
		
		
	}
}
