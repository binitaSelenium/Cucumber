package com.TestCases;

import cucumber.api.java.en.Given;

public class Tc_03_ScenarioOutLine {

	
	
	@Given("^login into the system using (.*) and (.*)$")
	public void testScenarioOutLine(String username,String password)
	{
		System.out.println("User Name : "+username+" Password : "+password);
	}
}
