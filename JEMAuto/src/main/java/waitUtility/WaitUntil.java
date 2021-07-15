package waitUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.BaseClass;

public class WaitUntil extends BaseClass {
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	public WebDriver driver;
	
	/*public WaitUntil(WebDriver driver) {
		
		this.driver=driver;
	}*/
	
	

	public static void elementClickable(By locator, WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public static void elementVisible(WebElement element, WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void elementPresent(By locator, WebDriver driver)
	{
		System.out.println("element Present method starting");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		System.out.println("element Present method ending");
	}

}
