package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Home extends Weblibrary {	
		
	//Logout link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Logout']")
	public static WebElement link_Logout;

	// Welcome button link Webelement
	@FindBy(how = How.ID, using = "welcome")
	public static WebElement link_Welcome;

	// Leave tab Webelement
	@FindBy(how = How.XPATH, using = "//b[text()='Leave']")
	public static WebElement link_Leave;

	// Apply link Webelement
	@FindBy(how = How.XPATH, using = "//a[text()='Apply']")
	public static WebElement link_Apply;
	
	// MyLeave link Webelement
	@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_viewMyLeaveList']")
	public static WebElement link_MyLeave;
	
	// MyInfo link Webelement
	@FindBy(how = How.XPATH, using = "//a[@id='menu_pim_viewMyDetails']")
	public static WebElement link_MyInfo;
	
	//Emergency contant
	@FindBy(how = How.XPATH, using = "//a[text()='Emergency Contacts']")
	public static WebElement link_EmergencyContact;
	
	//editing contact details
	@FindBy(how = How.XPATH, using = "//a[text()='Contact Details']")
	public static WebElement link_Contactdetails;
	
	//Naukri Link Element
	
	@FindBy(how = How.XPATH, using = "//a[(text()='Register Now']")
	public static WebElement btn_Regnw;
	
	//login LinkdenIn
		@FindBy(how = How.XPATH, using = "//a[@class='nav__button-tertiary']")
		public static WebElement move_joinnow;
		
		//yahoo create
		//yahoo login page
		@FindBy(how = How.XPATH, using="//a[@id='createacc']")
		public static WebElement btn_createnow;
		
	
	// MyLeave link Webelement
		@FindBy(how = How.XPATH, using = "//a[@id='menu_leave_viewMyLeaveList']")
		public static WebElement link_Myleave;
	
		@FindBy(how = How.XPATH, using = "//a[@id='menu_time_viewTimeModule']")
		public static WebElement link_Time;
	
		@FindBy(how = How.XPATH, using = "//a[@id='menu_time_Timesheets']")
		public static WebElement link_TimeSheets;
	
		@FindBy(how = How.XPATH, using = "//a[@id='menu_time_viewMyTimesheet']")
		public static WebElement link_MyTimeSheets;
	
		@FindBy(how = How.XPATH, using = "//input[@id='btnEdit']")
		public static WebElement Edit_btnEdit;
		
		@FindBy(how = How.XPATH, using = "//input[@id='btnAddRow']")
		public static WebElement Add_btnAddRow;
		
		@FindBy(how = How.XPATH, using = "//input[@id='btnBack']")
		public static WebElement Cancel_btnBack;
		
		@FindBy(how = How.XPATH, using = "//input[@id='calFromDate']")
		public static WebElement date_FromDate;
		
		@FindBy(how = How.XPATH, using = "//input[@id='calToDate']")
		public static WebElement date_toDate;
		
		@FindBy(how = How.XPATH, using = "//input[@id='btnSearch']")
		public static WebElement btn_Search;
		
		//FBhomepage navtomyaccount
		
		@FindBy(how = How.XPATH, using = "//div[@class='_2aUbKa']")
		public static WebElement move_Myaccount;
		

		@FindBy(how = How.XPATH, using = "//span[text()='Men']")
		public static WebElement move_Men;
					
		
//=======================================================================
	public void Exist() {
		boolean status;
		status = isExist(link_Welcome);
		logEvent(status, "user able to Login Sucessfully", "Unable to login ");
	}
	
 //-----------------------------------------------
	public void navYahoo() {
		
		
		boolean status;
		status = moveToElement(btn_createnow);
		logEvent(status, "User able to moveto the create tab", "User unable to moveto the create");
	
		wait(1);
		status = clickElement(btn_createnow);
		logEvent(status, "User able to click on createaccount", "Unable to click on createaccount");

	}
	
	
	
//------------------------------------------------	
	public void NavMyInfo() {
		boolean status;
		
		status = clickElement(link_MyInfo);
		logEvent(status, "User able to click on Myinfo link", "Unable to click on Myinfo link");
	}
	//----------------------------------------------------------
	
	public void EmergencyContact() {
		boolean status;
		
		status = clickElement(link_EmergencyContact);
		logEvent(status, "User able to click on EmergencyContant link", "Unable to click on EmergencyContant link");
	}
	//---------------------------------------------------------
	public void ContactDetails() {
		boolean status;
		
		status = clickElement(link_Contactdetails);
		logEvent(status, "User able to click on Contactdetails link", "Unable to click on Contactdetails link");
	}
	//------------------------------------------
	
	public void NavFKMyAccount() {
		boolean status;
		status = moveToElement(move_Myaccount);
		logEvent(status, "User able to moveto the MyAccount tab", "User unable to moveto the MyAccount tab");
	
		wait(1);
		status = moveToElement(move_Men);
		logEvent(status, "User able to click on men link", "Unable to click on men link");
	
		
			
	}
	//------------------------------------------------------------
	
	public void NavLinkjoin() {
	boolean status;
	status = clickElement(move_joinnow);
	logEvent(status, "User able to moveto the Joinin tab", "User unable to moveto the Joinin tab");


	}
 //-----------------------------------------------
	public void NavApplyLeave() {
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "User able to moveto the leave tab", "User unable to moveto the leave tab");
	
		wait(1);
		status = clickElement(link_Apply);
		logEvent(status, "User able to click on Apply link", "Unable to click on Apply link");
	}
	//-------------------------------------------------------------------
	public void Time() {
		boolean status;
		status = moveToElement(link_Time);
		logEvent(status, "User able to moveto the Time tab", "User unable to moveto the Time tab");
	
		wait(1);
		status = clickElement(link_TimeSheets);
		logEvent(status, "User able to click on TimeSheets link", "Unable to click on TimeSheets link");
		
	}
	//----------------------------------------------------------
	
	
	public void MyTimesheet() {
		boolean status;
		status = moveToElement(link_TimeSheets);
		logEvent(status, "User able to moveto the Time tab", "User unable to moveto the Time tab");
	
		wait(1);
		status = clickElement(link_MyTimeSheets);
		logEvent(status, "User able to click on MyTimeSheets link", "Unable to click on MyTimeSheets link");
	
		
	}
	
	//-----------------------------------------------------------------------
	public void NavMyLeave() {
		boolean status;
		status = moveToElement(link_Leave);
		logEvent(status, "User able to moveto the leave tab", "User unable to moveto the leave tab");
	
		wait(1);
		status = clickElement(link_Myleave);
		logEvent(status, "User able to click on My Leave link", "Unable to click on My Leave link");
		
	}
	//---------------------------------------------
	public void Naukrireg() {
		
		boolean status;
		
		status = moveToElement(btn_Regnw);
		logEvent(status, "User able to click on Registernow link", "Unable to click on Registernow link");
		wait(1);
		status = clickElement(btn_Regnw);
		logEvent(status, "User able to click on Registernow link", "Unable to click on Registernow link");
	}
	
	
 //-----------------------------------------------	
	public void logOut()
	{
		boolean status;
		
		status=clickElement(link_Welcome);
		logEvent(status, "user able to click the Welcome user link", "user unable to click the Welcome user link");
			
		status=clickElement(link_Logout);
		logEvent(status, "User able to sucessfully logout", "Unable to logout ");			
	}

	//==========================================================================
}
