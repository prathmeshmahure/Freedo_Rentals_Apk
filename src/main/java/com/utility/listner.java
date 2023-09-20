package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listner extends base_class implements ITestListener {
	
	
	ExtentReports extent=extent_reports_generator.getreports();
	ThreadLocal<ExtentTest> extent_test=new ThreadLocal<ExtentTest>();

		
		public void onTestStart(ITestResult result) {
			library.test=extent.createTest(result.getTestClass().getName()+ " == " +result.getMethod().getMethodName());
			library.test.addScreenCaptureFromBase64String(getscreenshot());
			extent_test.set(library.test);
		}
	
		public void onTestSuccess(ITestResult result) {
			library.test.log(Status.PASS, "Test Case Pass" );
		//	library.test.addScreenCaptureFromBase64String(getscreenshot());
		}
	
		public void onTestFailure(ITestResult result) {
			library.test.log(Status.FAIL, "Test Case Fail");
			library.test.addScreenCaptureFromBase64String(getscreenshot());	
		
		//	Basecapture(result.getMethod().getMethodName()+".jpg");
		}
	
		public void onTestSkipped(ITestResult result) {
			library.test.log(Status.SKIP, "Test Case Skip");
			}
	
	
		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
		
		public String getscreenshot() {
			TakesScreenshot ts=(TakesScreenshot)driver1 ;
			return ts.getScreenshotAs(OutputType.BASE64);
			 
			
			
		}
		public String getscreenshot1() {
			TakesScreenshot ts1=(TakesScreenshot)driver ;
			return ts1.getScreenshotAs(OutputType.BASE64);
		}
		

}
