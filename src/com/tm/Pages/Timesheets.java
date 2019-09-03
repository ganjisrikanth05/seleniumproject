package com.tm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.tm.Libraries.Weblibrary;

public class Timesheets extends Weblibrary {

	@FindBy(how = How.ID, using = "btnEdit")
	public static WebElement Edit_btnEdit;
	
	@FindBy(how = How.ID, using = "btnAddRow")
	public static WebElement Add_btnAddRow;
	
	@FindBy(how = How.ID, using = "btnBack")
	public static WebElement Cancel_btnBack;


	public void MyTimeSheets() {
		boolean status;
		
		wait(1);
		status = clickElement(Edit_btnEdit);
		logEvent(status, "User able to click on Edit link", "Unable to click on Edit link");
		wait(1);
		status = clickElement(Add_btnAddRow);
		logEvent(status, "User able to click on Addrow link", "Unable to click on Addrow link");
		wait(1);
		
		
		/*status = clickElement(Cancel_btnBack);
		logEvent(status, "User able to click on Cancel link", "Unable to click on cancel link");

		wait(1);
		status = selectByText(Edit_btnEdit, "btnEditt");
		logEvent(status, "User able to Select the Edit", "User unable to Select the Edit");

		wait(1);
		status = setTextandEscape(Add_btnAddRow, "btnAddRow");
		logEvent(status, "User able to select the Addrow", "User unable to select the Addrow");
		
		wait(1);
		status = setTextandEscape(Cancel_btnBack, "btnBack");
		logEvent(status, "User able to select the Cancel", "User unable to select the Cancel");*/
}
}
