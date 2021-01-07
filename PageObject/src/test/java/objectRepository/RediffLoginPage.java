package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	//page object model
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username= By.xpath("//input[@id='login1']");
	By password= By.name("passwd");
	By login= By.name("proceed");
    By home = By.linkText("rediff.com");
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}

	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Signin()
	{
		return driver.findElement(login);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
