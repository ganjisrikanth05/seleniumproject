package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.NaukriRegister;

public class TestCase_NaukriReg extends DriverClass {
	
	@Test
	public void TC0012_naukriregister()
	{
		Login lp = PageFactory.initElements(driver, Login.class);	
		
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		NaukriRegister ng= PageFactory.initElements(driver, NaukriRegister.class);	
		
		lp.NaukriLogin();
		hpg.Naukrireg();
		ng.editnaukri();
			
		
		
		
	}

}
