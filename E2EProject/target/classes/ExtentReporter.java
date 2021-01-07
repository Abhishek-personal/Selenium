package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	static ExtentReports extent;
	public static ExtentReports getreport()
	{
		String path=System.getProperty("user.dir")+"/extent/index.html";
		ExtentSparkReporter report =new ExtentSparkReporter(path);
		report.config().setReportName("web automation");
		report.config().setDocumentTitle("test result");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("tester", "abhishek");
		return extent;
	}
	
}
