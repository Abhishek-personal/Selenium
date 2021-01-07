import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/home/abhishek/Documents/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://10.0.6.182:8084/login");
		driver.findElement(By.xpath("//input[@placeholder='User Id']")).sendKeys("superadmin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Password@123");
		driver.findElement(By.xpath("//button[@class='btn btn-success btn-block']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/pull-report/non-conversational-report']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Select Account Name')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Select Account Name')]")).sendKeys("oodles");
	}

}
