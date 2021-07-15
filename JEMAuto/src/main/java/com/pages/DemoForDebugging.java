package com.pages;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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




public class DemoForDebugging {
	public WebDriver driver;
	
	public DemoForDebugging(WebDriver driver2) {
		
		this.driver=driver2;
	}

	By btnContactSale = By.xpath("//a[contains(text(), 'Contact Sales')]");
	By txtbxFirstName = By.name("FirstName");
	By txtbxLastName = By.name("LastName");

	
	
	public WebElement getbtnContactSale() {
		return driver.findElement(btnContactSale);
	}
	
	public WebElement gettxtbxFirstName() {
		return driver.findElement(txtbxFirstName);
	}
	
	public WebElement gettxtbxLastName() {
		return driver.findElement(txtbxLastName);
	}
	
	
   

}
