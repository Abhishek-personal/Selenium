package ExtendReports;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;




public class ExtendReportDemo {
	
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"/reports/index.html";
		ExtentSparkReporter report =new ExtentSparkReporter(path);
		report.config().setReportName("web automation");
		report.config().setDocumentTitle("test result");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("tester", "abhishek");
		
	}
	
	
	
	@Test
	public void InitialDemo()
	{
		extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		extent.flush();
		
	}

}
