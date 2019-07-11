package com.RunnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="Features",
		glue= {"com.TestCases"},
		plugin= {"html:Reports"},
		tags= {"@test"},
		monochrome=true
		
		
		)


public class Runner {
	
	

}
