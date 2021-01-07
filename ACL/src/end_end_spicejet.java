import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class end_end_spicejet {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://www.spicejet.com/");
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * ); driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
		 * Thread.sleep(2000); driver.findElement(By.
		 * xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Chennai (MAA)'][contains(text(),'Chennai (MAA)')]"
		 * )).click(); driver.findElement(By.cssSelector(
		 * ".ui-state-default.ui-state-highlight.ui-state-active")).click();
		 * if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
		 * System.out.println("is disable"); Assert.assertTrue(true); } else {
		 * Assert.assertFalse(false); }
		 * driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); Select s=
		 * new Select(driver.findElement(By.xpath(
		 * "//select[@id='ctl00_mainContent_ddl_Adult']"))); s.selectByValue("2");
		 * Thread.sleep(2000); driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		 * driver.findElement(By.xpath(
		 * "//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		 */

		// cleartrip
		/*
		 * driver.get("https://www.cleartrip.com/");
		 * driver.findElement(By.id("DepartDate")).click(); driver.findElement(By.
		 * xpath("//a[contains(@class,'ui-state-default ui-state-highlight ui-state-active')]"
		 * )).click(); Select a=new Select(driver.findElement(By.id("Adults")));
		 * a.selectByValue("2"); Select c= new
		 * Select(driver.findElement(By.id("Childrens"))); c.selectByValue("2"); Select
		 * i= new Select(driver.findElement(By.id("Infants"))); i.selectByValue("1");
		 * driver.findElement(By.id("MoreOptionsLink")).click(); Thread.sleep(2000);
		 * Select t= new Select(driver.findElement(By.id("Class")));
		 * t.selectByValue("First");
		 * driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		 * driver.findElement(By.id("AirlineAutocomplete")).click();
		 * driver.findElement(By.id("SearchBtn")).click();
		 * System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		 */

	}

}
