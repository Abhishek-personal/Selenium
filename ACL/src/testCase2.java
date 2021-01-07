

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class testCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.facebook.com/");
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.findElement(By.id("email")).sendKeys("abhishekrathore547@gmail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Anurag@97");
		 * driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
		 */

		// dropdown
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/"); Select
		 * s=new
		 * Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']"))
		 * ); s.selectByValue("option2");
		 */

		// multiclick
		/*
		 * driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		 * System.out.println(driver.findElement(By.
		 * xpath("//div[@class='brand greenLogo']")).getText());
		 * 
		 * int i; for(i=1;i<7;i++) {
		 * driver.findElement(By.xpath("//div[2]//div[2]//a[2]")).click(); }
		 * driver.findElement(By.xpath("//div[@id='root']//div[2]//div[3]//button[1]")).
		 * click();
		 */

		// auto suggestive drop down
		/*
		 * driver.get("https://www.makemytrip.com/"); WebElement destination =
		 * driver.findElement(By.id("fromCity")); destination.click(); WebElement desti
		 * = driver.findElement(By.xpath("//input[@placeholder='From']"));
		 * desti.sendKeys("MUMBAI"); Thread.sleep(2000);
		 * desti.sendKeys(Keys.ARROW_DOWN); desti.sendKeys(Keys.ENTER);
		 * 
		 * 
		 * WebElement source =
		 * driver.findElement(By.xpath("//input[@placeholder='To']"));
		 * source.sendKeys("del"); Thread.sleep(2000); int i; for(i=1;i<4;i++) {
		 * source.sendKeys(Keys.ARROW_DOWN); } source.sendKeys(Keys.ENTER);
		 */

		// checkboxes
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']"
		 * )).getSize());
		 */

		// Assingment checkbox
		/*
		 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		 * driver.findElement(By.id("checkBoxOption1")).click();
		 * Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected())
		 * ;
		 * System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']"
		 * )).getSize());
		 */

		// java alert

		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys("abhishek");
		driver.findElement(By.id("alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.id("name")).sendKeys("rathore");
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();*/
		
		// shooping site
		/*driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver,5);
		String[] itemsneeded= {"Cucumber","Brocolli"};
		additems(driver,itemsneeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
		driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());*/
		
		//example of explicit example
		/*driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());*/
		
		//Action
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("button#mousehover"))).build().perform();*/
		
		//handling multiple window
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//a[@id='opentab']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String pid=it.next();
		String cid=it.next();
		driver.switchTo().window(cid);
		System.out.println(driver.getTitle());
		
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String pid=it.next();
		String cid=it.next();
		driver.switchTo().window(cid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(pid);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());*/
		
		
		//frame with drag and drop
		/*driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.id("draggable")).click();
		Actions a= new Actions(driver);
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();*/
		
		//count total link in webpage and limiting webdriver scope
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerelement= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerelement.findElements(By.tagName("a")).size());
		
		WebElement columnelement= driver.findElement(By.xpath("//td[1]//ul[1]"));
		System.out.println(columnelement.findElements(By.tagName("a")).size());
		
		click on all link and check all page should be open
		int i;
		for(i=1;i<columnelement.findElements(By.tagName("a")).size();i++)
		{
			String clickontab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnelement.findElements(By.tagName("a")).get(i).sendKeys(clickontab);
			Thread.sleep(2000);
			
		}
			Set<String> ids= driver.getWindowHandles();
			Iterator<String> it=ids.iterator();
			while(it.hasNext())
			{
			
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			
			}*/
		
		//assignment section 12
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String value= driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
		Select s= new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		s.selectByValue(value);
		driver.findElement(By.id("name")).sendKeys(value);
		driver.findElement(By.id("alertbtn")).click();
		if(driver.switchTo().alert().getText().contains(value))
		{
		
			System.out.println("this text contain:-"+value);
		}
		driver.switchTo().alert().accept();*/

		
		//CALENDER UI
		/*driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("September"))
			
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.cssSelector(".day"));
		
		for(int i=0;i<dates.size();i++)
		{
			
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
			
		}*/
		
		
		//table format
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table= driver.findElement(By.cssSelector(".table-display"));
		int count=table.findElements(By.xpath("//tr/td[3]")).size();
		
		int sum=0;
		for(int i=0;i<count-1;i++)
		{
			System.out.println(table.findElements(By.xpath("//tr/td[3]")).get(i).getText());
			String value=table.findElements(By.xpath("//tr/td[3]")).get(i).getText();
			int valueint=Integer.parseInt(value);
			sum =sum + valueint;
			
		}
		
		System.out.println("total is:- " + sum);*/
		
		
		//assignment7 section13
		/*driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement table= driver.findElement(By.cssSelector(".table-display"));
		int count=table.findElements(By.xpath("//tr/td[3]")).size();
		System.out.println("total rows:- " + count);
		WebElement tablevalue=table.findElement(By.xpath("//table[@id='product']/tbody/tr[1]"));
		System.out.println("total columns:-" + tablevalue.findElements(By.tagName("th")).size());
		System.out.println("second row price:- "+ table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]/td[3]")).getText());*/
		
		
		//Auto suggestive drop down with javascript executer
		/*driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";		
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i=0;
		while(!text.equalsIgnoreCase("BENGALURU INTER AIRPORT"))
		{
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>2)
			{
				break;
			}
			
		}
		if (i<10)
		{
			System.out.println("destination is not present");
		}*/
		
		
		
		//SSl certificates
		/*DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver(c);*/
		
		
		//sorting
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		List<WebElement> firstlist= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		
		ArrayList<String> originallist= new ArrayList<String>();
		
		for (int i=0;i<firstlist.size();i++)
		{
			originallist.add(firstlist.get(i).getText());
		}
		
		ArrayList<String> copiedlist= new ArrayList<String>();
		for(int i=0;i<originallist.size();i++)
		{
			copiedlist.add(originallist.get(i));
		}
		Collections.sort(copiedlist);
		
		Assert.assertTrue(copiedlist.equals(originallist));
		
		
		
		}

	
	/*public static void additems(WebDriver driver,String[] itemsneeded)
	{
		int j=0;
	List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name=products.get(i).getText().split("-");
			String formattedname= name[0].trim();
			
			List itemsneededlist=Arrays.asList(itemsneeded);
			
		if(itemsneededlist.contains(formattedname))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			
				
			
		}
		}
	}*/

}
