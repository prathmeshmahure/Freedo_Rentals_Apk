
package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extent_reports_generator extends base_class{
	public static ExtentSparkReporter report;
	public static ExtentReports extent;
	
	
	public static ExtentReports getreports(){
		
		
		String path=System.getProperty("user.dir")+"/Report/index.html";
		report=new ExtentSparkReporter(path);
		
		report.config().setDocumentTitle("Freedo Rentals-Automation Test Report");
		report.config().setReportName("Freedo Rentals");
		report.config().setTheme(Theme.DARK);
		
		
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("	Project Name", " Freedo Rentals ");
		extent.setSystemInfo("	Laptop", "	Dell");
		extent.setSystemInfo("	QA", "	Prathmesh Mahure");
		extent.setSystemInfo("	Operating system", "	Windows 10 pro");
		extent.setSystemInfo("	BrowserName", "	Android Studio");
		extent.setSystemInfo("	Device Name", "	Pixel 6");
		
		return extent;
	}

}
