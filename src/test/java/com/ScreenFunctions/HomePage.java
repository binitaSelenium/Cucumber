package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class HomePage extends GenericFunctions {
//*************************** WebELements ***************************
	@FindBy(how=How.XPATH,using="//span[@id='lnkRegistration']")
	public WebElement lnk_Register;
	
	@FindBy(how=How.XPATH,using="//span[@id='lblJsRegister']")
	public WebElement lnk_JobSeeker;
	
//******************************************************************
	
//======================  WebMethod ===================================
	
	public boolean hover_RegisterLink()
	{
		boolean status=true;
		try
		{
			status=hover_Click(lnk_Register);
			if(status)
				
			{
				System.out.println("Hovered on the Register Link sucesfully");
				//logEvent("Pass", "Hovered on the Register Link sucesfully");
			}else
			{
				System.out.println("Register Link is not available");
				//logEvent("fail", "Register link is not available");
			}
			
			
		}catch(Exception e)
		{
			status=false;
			logEvent("Fail", "Unable to hover on register link");
		}
		return status;
	}
	
	public boolean click_JobSeeker()
	{boolean status=true;
		try
		{
			status=hover_Click(lnk_JobSeeker);
			if(status)
				
			{
				System.out.println("Clicked on jobseeker Link sucesfully on the homepage");
				logEvent("Pass", "Hovered on the Register Link sucesfully");
			}else
			{
				System.out.println("Clicked on jobseeker Link sucesfully on the homepage");
				logEvent("fail", "Register link is not available");
			}
			
			
		}catch(Exception e)
		{
			status=false;
			logEvent("Fail", "Unable to hover on register link");
		}
		return status;
	}
	
	
}
