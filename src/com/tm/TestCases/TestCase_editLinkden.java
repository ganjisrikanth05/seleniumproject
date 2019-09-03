package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.Home;
import com.tm.Pages.LinkedIn;
import com.tm.Pages.Login;

public class TestCase_editLinkden extends DriverClass {
	
	@Test
	public void TC0123_Linkdenregister()
	{
		
		
		Home hpg = PageFactory.initElements(driver, Home.class);
		
		LinkedIn ln=PageFactory.initElements(driver, LinkedIn.class);
		
		Login lp = PageFactory.initElements(driver, Login.class);
		
		lp.Linkedinjoin();
		
		
		ln.editLinken();
		
	}
	
	
	

}
