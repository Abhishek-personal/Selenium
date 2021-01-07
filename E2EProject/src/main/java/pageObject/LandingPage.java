package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	private By signin=By.cssSelector("a[href*='sign_in']");
	private By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	private By Navbar=By.xpath("//ul[@class='nav navbar-nav navbar-right']");

	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}


	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lo= new LoginPage(driver);
		 return lo;
	}
	
	public WebElement Title()
	{
		return driver.findElement(title);
	}
	
	public WebElement getNavigation()
	{
		return driver.findElement(Navbar);
	}
}
