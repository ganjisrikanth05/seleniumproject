package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class MyLeave extends Weblibrary {
	
			//Leave Fromdate Webelement
			@FindBy(how = How.ID, using = "calFromDate")
			public static WebElement date_FromDate;

			// Leave toDate Webelement
			@FindBy(how = How.ID, using = "calToDate")
			public static WebElement date_toDate;
			
			//Search button Webelement
			@FindBy(how = How.ID, using = "btnSearch")
			public static WebElement btn_Search;
			
			public void myLeave(String frmdate,String thrudate) {
				boolean status;

				
				wait(1);
				status = setTextandEscape(date_FromDate, frmdate);
				logEvent(status, "User able to select the Fromdate", "User unable to select the Fromdate");

				wait(1);
				status = setTextandEscape(date_toDate, thrudate);
				logEvent(status, "User able to Select the to date", "User unable to Select the to date");

				
				wait(1);
				status = clickElement(btn_Search);
				logEvent(status, "User able to click on Save button", "Unable to click on save button");
			
			}
			

}
