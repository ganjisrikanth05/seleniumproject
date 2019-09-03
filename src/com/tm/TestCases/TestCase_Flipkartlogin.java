package com.tm.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.tm.BaseClass.DriverClass;
import com.tm.Pages.Home;
import com.tm.Pages.Login;

public class  TestCase_Flipkartlogin extends DriverClass{

	@Test
	public void TC123_flipKartLogin() {
	
		Login lp = PageFactory.initElements(driver, Login.class);	
		
		Home hpg = PageFactory.initElements(driver, Home.class);
	
		
		lp.FlipkartLogin("ganjisrikanth@gmail.com", "shirisha28");
		hpg.NavFKMyAccount();
		
}
}