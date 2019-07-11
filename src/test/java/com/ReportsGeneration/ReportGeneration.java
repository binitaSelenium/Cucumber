package com.ReportsGeneration;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.GenericFunctions.GenericFunctions;
import com.readexcel.ReadExcel;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGeneration extends ReadExcel {
	
public static ExtentReports extent;
	
	
	public static ExtentTest test;
	
	public static String resultfile;
	
	
	public static void intializeReports(String filename)
	{
		
		extent=new ExtentReports(createResultFolder()+filename+".html");
		resultfile=createResultFolder()+filename+".html";		
		
	}
	
	public static void startTest(String testname)
	{
		
		test=extent.startTest(testname);
	}
	
	
	public static void closeTest()
	{
		extent.endTest(test);
		extent.flush();
		
	}
	
	public static void logEvent(String status,String Description)
	{
		
		switch (status.toLowerCase()) {
		case "pass":
			
			test.log(LogStatus.PASS, Description+test.addScreenCapture(getScreenShot()));
			
			break;
			
		case "fail":
			
			test.log(LogStatus.FAIL, Description+test.addScreenCapture(getScreenShot()));
			
			break;
			
		case "warning":
			
			test.log(LogStatus.WARNING, Description);
			
			break;
		case "info":
			
			test.log(LogStatus.INFO, Description);
			
			break;	

		default:
			break;
		}
		
	}
	
	
	public static String getScreenShot()
	{
		TakesScreenshot sht=(TakesScreenshot) GenericFunctions.driver;
		
		String screenshot=sht.getScreenshotAs(OutputType.BASE64);
		
		return "data:image/png;base64,"+screenshot;
		
	}
	
	
	
	
	
	
	
	public static String createResultFolder()	{
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YY");
		
		String path="";
		
		File f=new File(System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "")+"\\");
		
		
		if(!f.exists())
		{
			
			f.mkdirs();
			path=System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "")+"\\";
		}
		else
		{
			path=System.getProperty("user.dir")+"\\Results\\"+sdf.format(new Date()).replace("/", "")+"\\";
		}
		
		return path;
	}

}
