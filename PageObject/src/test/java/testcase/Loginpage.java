package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

import org.testng.annotations.Test;

public class Loginpage {
	
	@Test
	public void Login()
	{
		//login page implemented through page object model style
		// home page implemented through page object factory method
		System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd= new RediffLoginPage(driver);
		rd.Emailid().sendKeys("abhishekrathore");
		rd.Password().sendKeys("rathore");
		//rd.Signin().click();
		rd.Home().click();
		RediffHomePage hd= new RediffHomePage(driver);
		hd.Textbox().sendKeys("hello");
		hd.Submit().click();
		
	}

}
