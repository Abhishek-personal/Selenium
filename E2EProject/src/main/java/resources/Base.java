package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public WebDriver initialisedriver() throws IOException
	{
	 prop = new Properties();
	// System.getProperty("user.dir");
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
    prop.load(fis);
    String BrowserName=prop.getProperty("browser");
    if (BrowserName.equals("chrome"))
    {
    	//execute in chrome browser
    	System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		 driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    else if (BrowserName.equals("firefox"))
    {
    	//firefox code
    }
    else if (BrowserName.equals("ie"))
    {
    	//Ie code
    }
    
    return driver;
    
    
	}
	
	public String getscreenshotpath(String Testcasename,WebDriver driver) throws IOException
	{
		
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"/reports/"+Testcasename+ ".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
}
