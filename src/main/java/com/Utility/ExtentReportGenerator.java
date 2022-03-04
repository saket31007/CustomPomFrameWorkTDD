package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
public static ExtentReports extent;
	    // agar hume iss class ke refrence ka use krna hai dusri class me jese ki listners to isse publically define krna pdega//public static
	                                        // banana pdega nhi to error dega kyyki iss class me jo method bnaya hai vo bhi static hai 
	
	//We will use two classes here
	// Extent Spark Reporter
	//ExtentReports
	
	// first we will define the path of the report 
	// We can return the class as weel in the method we are returning extent report class here 
	public static ExtentReports getReports() {                                                                                                    //ExtentReport ka return hum get report me chahiye
	String path = "C:\\Users\\saket\\eclipse-workspace\\CustomFrameWork\\Reports\\index.html";       //this will  return extent
	
	 // it is basically to set reports title ,theme, title //argument will be path //decorative work
	ExtentSparkReporter repo = new  ExtentSparkReporter(path);
	
	repo.config().setDocumentTitle("Test Report");
	repo.config().setReportName("Custom Report Name");
	repo.config().setTheme(Theme.DARK);
	
	
	extent = new ExtentReports();   // From This class we can set system info // environment setup from this class
	extent.attachReporter(repo);
	extent.setSystemInfo("Project Name", "Investment Banking");
	extent.setSystemInfo("Browser", "Chrome");
	extent.setSystemInfo("Build", "3.134");
	extent.setSystemInfo("Build", "3.134");
	extent.setSystemInfo("QA", "Saket Barmate");
	return extent;
	
	
	
	
	
	
	

	}
	
	

}
