package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.webdriver.support.ui import WebDriverWait
from webdriver_manager.chrome import ChromeDriverManager
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
import time*/




public class ContactSales {
	
public WebDriver driver;
//WaitUntil waituntil = new WaitUntil(driver);

By txtbxPhnNum = By.name("Contact");

By txtbxEmail = By.name("Email");

//WebElement txtbxPhnNum = driver.findElement(By.name("Contact"));
//WebElement txtbxEmail = driver.findElement(By.name("Email"));
	
	public ContactSales(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public WebElement getTitlePhoneNumber() {
		return driver.findElement(txtbxPhnNum);
	}
	
	public WebElement getEmailID() {
		
		return driver.findElement(txtbxEmail);
	}
	
	

	
  
	

}
