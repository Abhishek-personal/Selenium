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

public class ValidateNavigationBar extends Base {
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialisedriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	
	public void basepageNavigation( ) throws IOException
	{
		
		LandingPage L= new LandingPage(driver);
		//compare the text with actual text  and print the error
		AssertJUnit.assertTrue(L.getNavigation().isDisplayed());
		log.info("Navigation bar is displayed");
		
		
		
	}
	
	@AfterTest
	
	public void teardown() 
	{
	driver.close();	
	}
	 
	
	
	}

