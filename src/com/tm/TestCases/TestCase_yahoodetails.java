package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.Home;
import com.tm.Pages.Login;
import com.tm.Pages.Yahoocreate;

public class TestCase_yahoodetails extends DriverClass  {
	
	
	@Test
	public void TC0123_yahoopage() {
	
	Login lp = PageFactory.initElements(driver, Login.class);	
	
	Home hpg = PageFactory.initElements(driver, Home.class);
	
	Yahoocreate yah= PageFactory.initElements(driver, Yahoocreate.class);
	
	
	
	lp.yahoojoin();
	hpg.navYahoo();
	
	yah.edityahoo();
	
	
	
	
	}
	
	

}
