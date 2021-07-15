package com.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.BaseClass;
import com.pages.ContactSales;
import com.pages.DemoForDebugging;


public class Login extends BaseClass{
	
	public WebDriver driver;
	
	
	@BeforeSuite
	public void launchBrowser() throws IOException {
		
		driver= initiazeBrowser();
		System.out.println("Before Suite Executed");
	}
	
	@BeforeClass
	public void navigateURL() {
		DemoForDebugging demo = new DemoForDebugging(driver);
		demo.getbtnContactSale().click();
		demo.gettxtbxFirstName().sendKeys("First Name");
		demo.gettxtbxLastName().sendKeys("Last Name");
		System.out.println("Login class Before Class");
	}
	
	@Test
	public void fillContactData() {
		ContactSales contactSale = new ContactSales(driver);
		contactSale.getTitlePhoneNumber().sendKeys("85214741");
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(contactSale.getEmailID()));
		contactSale.getEmailID().sendKeys("abc@gmail.com");
		 System.out.println("Login class Test Method");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.close();
		System.out.println("After Suite Executed");
	}
	
	      

}
