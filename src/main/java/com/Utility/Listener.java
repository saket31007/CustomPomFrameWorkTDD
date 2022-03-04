package com.Utility;
// Suit name ke niche we will call this class in runner file by adding <Listeners> <Listener class name = "com.Utility.Listeners"> </Listener> </Listeners>
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener implements ITestListener {
	
	ExtentReports extent =  ExtentReportGenerator.getReports(); // Extent report mathod ko hmne listner ke ander call kr liye return kr rha tha extent
	
	ThreadLocal<ExtentTest> extenttest = new  ThreadLocal<ExtentTest>();// mutiple test cases ek hi report me acctach ho jaye isliye hum thread local class ka uuse kr rhe hai, yha pe jo class hum likh rhe hai extent test class

	public void onTestStart(ITestResult result) {
		
		 Library.test= extent.createTest(result.getTestClass().getName() + "=="+result.getMethod());
		 extenttest.set(Library.test);                // extent test multiple test cases ko report me attach krte jyega	
	}

	public void onTestSuccess(ITestResult result) {
		
		extenttest.get().log(Status.PASS, "Test Case Pass");
	}

	public void onTestFailure(ITestResult result) {
		
		extenttest.get().log(Status.FAIL, "Test Case Fail");
	}

	public void onTestSkipped(ITestResult result) {
		
		extenttest.get().log(Status.SKIP, "Test Case Skip");
	}

	public void onFinish(ITestContext context) {
		
		extent.flush();
	}
	


}
