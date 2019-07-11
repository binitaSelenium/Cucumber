package com.TestCases;

import com.GenericFunctions.GenericFunctions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends GenericFunctions{
	
	@Before
	public void launchBrowser(Scenario scenario)
	{	loadExcelFile();
		intializeReports(scenario.getName());
		startTest(scenario.getName());
			String url="https://www.talentzing.com/";
			launchApplication("chrome",url);
			
			
			
			
	}
	@After
	public void teardown()
	{
		//closeBrowser();
		//closeTest();
	}
	
	
}
