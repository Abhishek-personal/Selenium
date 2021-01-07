package academy;

import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class ValidateTitle extends Base {
	public WebDriver driver;
	
	private static Logger log=LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialisedriver();
		log.info("driver is initialise");
		driver.get(prop.getProperty("url")); 
		log.info("Navigation to homepage");
	}

	@Test
	
	public void basepageNavigation( ) throws IOException
	{
		
		LandingPage L= new LandingPage(driver);
		//compare the text with actual text  and print the error
		AssertJUnit.assertEquals(L.Title().getText(), "FEATURED COURSES123");
		log.info("Successfully Validate Text message");
		
		
		
		
	}
	@AfterTest
	
	public void teardown() 
	{
	driver.close();	
	}
	 
	
	
	}

