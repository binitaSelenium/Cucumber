package com.TestCases;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonAnnotation extends GenericFunctions{
	
	
	@When("application is launched hover on the resgister link")
	public void hoveronRegisterLink()
	{
		HomePage page=PageFactory.initElements(driver, HomePage.class);
		
		page.hover_RegisterLink();
	}
	
	
}
