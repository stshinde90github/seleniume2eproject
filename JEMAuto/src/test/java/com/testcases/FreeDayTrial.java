package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.ContactSales;
import com.pages.DemoForDebugging;
import com.pages.Free30DaysTrialPage;


public class FreeDayTrial extends BaseClass{
	
	//public WebDriver driver;
	

	
	@Test
	public void testMethod1() {
		Free30DaysTrialPage dayTrial = new Free30DaysTrialPage(driver);
		dayTrial.getbtnFreeDayTrial().click();
		//dayTrial.waitForElement();
		String txtFirstName = dayTrial.gettxtFirstName().getText();
		System.out.println("The text is "+txtFirstName);
		System.out.println("test for class 2 executed");
	}
		
	      

}
