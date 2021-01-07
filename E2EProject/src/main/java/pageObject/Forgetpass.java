package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Forgetpass {

	public WebDriver driver;
	
	
	
	private By email= By.xpath("//input[@id='user_email']");
	private By commit= By.xpath("//input[@name='commit']");
	


	public Forgetpass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}

	public WebElement email()
	{
		return driver.findElement(email);
		
	}
	public WebElement commit()
	{
		return driver.findElement(commit);
		
	}
	
}
