package com.TestCases;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.HomePage;
import com.ScreenFunctions.JobSeekerPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tc_01_JobSeeker_Registration extends GenericFunctions{

	
	//When part is defined in common annotaion
	@Then("verify jobseeker hyperlink is displayed,click on it")
	public void clickonJobseeker()
	{
		HomePage page=PageFactory.initElements(driver, HomePage.class);
		
		page.click_JobSeeker();
	}
	
	@Then("verify the user is navigated to jobseeker page")
	
	public void verifyJobHeader()
	{
		JobSeekerPage page=PageFactory.initElements(driver, JobSeekerPage.class);
		
		page.verifyHeader();
	}
	
	@And("enter all the fields data")
	public void fillDetails(DataTable data)
	{
		//getData("Testcase", "columnname", "sheetname");
		List<List<String>> table=data.raw();
		
		System.out.println(table.size());
		
		for(int i=0;i<=table.size()-1;i++)
		{
			System.out.println(table.get(i).get(0));
			System.out.println(table.get(i).get(1));
			System.out.println(table.get(i).get(2));
			System.out.println(table.get(i).get(3));
			System.out.println(table.get(i).get(4));
			System.out.println(table.get(i).get(5));
			System.out.println(table.get(i).get(6));
			System.out.println(table.get(i).get(7));
			System.out.println(table.get(i).get(8));
			System.out.println(table.get(i).get(9));
//			String str[] = null;
//			str[0]= table.get(i).get(0);
		}
	}
	
	

}
