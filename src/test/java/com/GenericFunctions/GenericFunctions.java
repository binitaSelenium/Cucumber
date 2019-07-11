package com.GenericFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ReportsGeneration.ReportGeneration;

public class GenericFunctions extends ReportGeneration{
	
	
	
	public static WebDriver driver;
	
	/* Method Name:launchApplication
	 * 
	 * Purpose:This method is used launch the application in the user given browser
	 * 
	 * input parameters:User must send url and browser
	 * 
	 * Output parameter: Boolean 
	 * 
	 * Designer:
	 */
	
	
	public static boolean launchApplication(String browser,String url)
	{
		boolean status=true;
		try
		{
			switch (browser.toLowerCase()) {
			case "firefox":
				try
				{
					driver=new FirefoxDriver();
					
					driver.get(url);
					
					driver.manage().window().maximize();
					System.out.println("Application is launced sucessfully");
					logEvent("pass", "Fire Fox browser is launched");
				}catch(Exception e)
				{
					System.out.println("Application is not launced sucessfully");
					logEvent("fail", "Fire Fox browser is not launched");
				}
				
				break;
				
			case "chrome":
				
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver=new ChromeDriver();
				driver.get(url);
				logEvent("pass", "Chrome browser is launched");
				logEvent("fail", "Just for fail purpose");
				logEvent("warning", "Just for warning");
				break;


			default:
				break;
				
				
			}
			
			driver.manage().window().maximize();
				
		}catch(Exception e)
		{
			status=false;
			
			System.out.println("Unable to launch the browser because of "+e.getMessage());
			logEvent("fail", "Browser is not launched");
		}
		
		return status;
		
	}
	
	/* Method Name:hover_Click
	 * 
	 * Purpose:This method is used click the element by hovering on it
	 * 
	 * input parameters:User must send the element
	 * 
	 * Output parameter: Boolean 
	 * 
	 * Designer:
	 */
	public static boolean hover_Click(WebElement element)
	{
		boolean status=true;
		try
		{
			Actions acc=new Actions(driver);
			acc.moveToElement(element).click(element).build().perform();
			
		}catch(Exception e)
		{
			System.out.println("unable to click on the element "+element+" because of "+e.getMessage());
		}
		return status;
		
	}
	
	
	/* Method Name:click_SendData
	 * 
	 * Purpose:This method is used click the element by hovering on it
	 * 
	 * input parameters:User must send the element
	 * 
	 * Output parameter: Boolean 
	 * 
	 * Designer:
	 */
	public static boolean click_SendData(WebElement element,String data)
	{
		boolean status=true;
		try
		{
			element.click();
			element.clear();
			element.sendKeys(data);
			
			
		}catch(Exception e)
		{
			System.out.println("unable to send the data to the element "+element+" because of "+e.getMessage());
		}
		return status;
		
	}
	
	/* Method Name:waitForElement
	 * 
	 * Purpose:This method is used click the element by hovering on it
	 * 
	 * input parameters:User must send the element
	 * 
	 * Output parameter: Boolean 
	 * 
	 * Designer:
	 */
	public static boolean waitForElement(WebElement element)
	{
		boolean status=true;
		try
		{
			String actualxpath=element.toString();
			
			String modifiedxpath=actualxpath.substring(actualxpath.indexOf("/"),actualxpath.lastIndexOf("]"));
			
			System.out.println(modifiedxpath);
			
			
	new WebDriverWait(driver, 35).withMessage("Waited 35 seconds long for the element").until(ExpectedConditions.presenceOfElementLocated(By.xpath(modifiedxpath)));		
	
		}catch(Exception e)
		{
			System.out.println("unable to click on the element "+element+" because of "+e.getMessage());
		}
		return status;
		
	}
	
	
public void closeBrowser()
{	driver.close();
	driver.quit();
	
}
	
	
	
	
	
	
	
	
	
	

}
