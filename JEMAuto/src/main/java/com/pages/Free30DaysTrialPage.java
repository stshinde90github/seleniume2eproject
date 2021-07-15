package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import waitUtility.WaitUntil;

/*from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support.ui import WebDriverWait
from webdriver_manager.chrome import ChromeDriverManager
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
import time*/




public class Free30DaysTrialPage {
	
public WebDriver driver;


public Free30DaysTrialPage(WebDriver driver) {
	
	this.driver=driver;
}

//WaitUntil waituntil = new WaitUntil(driver);

By btnFreeDayTrial = By.xpath("//a[@class='btn-orange contact-ohrm ']");

By txtFirstName = By.xpath("//div[@id='Form_submitForm_FirstName_Holder']/label");

//WebElement txtbxPhnNum = driver.findElement(By.name("Contact"));
//WebElement txtbxEmail = driver.findElement(By.name("Email"));
	
	
	
	public WebElement getbtnFreeDayTrial() {
		return driver.findElement(btnFreeDayTrial);
	}
	
	public void waitForElement() {
		WaitUntil.elementPresent(txtFirstName, driver);
	}
	
	public WebElement gettxtFirstName() {
		WaitUntil.elementPresent(txtFirstName, driver);
		return driver.findElement(txtFirstName);
	}
	
	

	
  
	

}
