package academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.Forgetpass;
import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.Base;

public class HomePage extends Base {
	public WebDriver driver;
	private static Logger log=LogManager.getLogger(Base.class.getName());

	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialisedriver();

	}

	@Test(dataProvider="getdata")
	
	public void basepageNavigation(String username, String password) throws IOException
	{
		driver.get(prop.getProperty("url"));
		LandingPage L= new LandingPage(driver);
		LoginPage lo=L.getLogin();
		lo.getemail().sendKeys(username);
		lo.getpass().sendKeys(password);
		lo.login().click();
		log.info("successfully login");
		Forgetpass fp=lo.forgot();
		fp.email().sendKeys("abhishek@gmail.com");
		fp.commit().click();

		
	}
	//parameterised data and data driven with @dataprovider annotation for email and password
	@DataProvider
	public Object[][] getdata()
	{
		//row stands for how many different data types test should run
		// column stands for how many value per each test
		Object[][] data=new Object[2][2];
		data[0][0]="nonregisteduser@gmail.com";
		data[0][1]="123456";
		
		data[1][0]="registeduser@gmail.com";
		data[1][1]="147258";
		
		return data;
		
		
	}
	
	@AfterTest
	
	public void teardown() 
	{
	driver.close();	
	}
}
