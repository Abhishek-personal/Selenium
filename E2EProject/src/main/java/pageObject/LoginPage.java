package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	private By email=By.cssSelector("[id='user_email']");
	private By pass=By.cssSelector("[type='password']");
	private By login=By.xpath("//input[@name='commit']");
	private By forgot= By.xpath("//a[@class='link-below-button']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}


	public WebElement getemail()
	{
		return driver.findElement(email);
		
	}
	public WebElement getpass()
	{
		return driver.findElement(pass);
	}
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public Forgetpass forgot()
	{
		 driver.findElement(forgot).click();
		 Forgetpass fp= new Forgetpass(driver);
		 return fp;
	}
}
