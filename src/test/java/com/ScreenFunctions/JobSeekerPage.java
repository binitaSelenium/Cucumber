package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class JobSeekerPage extends GenericFunctions{
	
	@FindBy(how=How.XPATH,using="//h2[normalize-space(text())='Job Seeker - Registration Form']")
	public WebElement txt_jobseeker;
	

	public boolean verifyHeader()
	{
		boolean status=true;
		
		try
		{
			status=waitForElement(txt_jobseeker);
			
			if(status)
			{
				System.out.println("Job Seeker Header is displayed");
			}else
			{
				System.out.println("Job Seeker Header is not displayed");
			}
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return status;
		
	}
	
	
	
}
