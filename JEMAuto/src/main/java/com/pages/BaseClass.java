package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public static WebDriver driver;
	public Properties prop;
	String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\data.properties";
	
	public WebDriver initiazeBrowser() throws IOException {
		
	    prop = new Properties();
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		
		if(browserName.equals("chrome")) {
			//SSl certificates

			//Desired capabilities=
			//general chrome profile
			DesiredCapabilities ch=DesiredCapabilities.chrome();
			//ch.acceptInsecureCerts();
			ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			//Belows to your local browser
			ChromeOptions c= new ChromeOptions();
			c.merge(ch);
			WebDriverManager.chromedriver().setup();

			 driver =new ChromeDriver(c);
			 driver.manage().window().maximize();
			 driver.get("https://www.orangehrm.com/");
			 
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static String getScreenShotApp(String methodName, WebDriver driver) throws IOException {
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destFile =  System.getProperty("user.dir")+"\\target\\Screenshots\\"+methodName+".png";
		FileUtils.copyFile(source, new File(destFile));*/
		String destFile = System.getProperty("user.dir")+"\\target\\"+methodName+".png";
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(destFile));
		return destFile;
		
		
	}

}
