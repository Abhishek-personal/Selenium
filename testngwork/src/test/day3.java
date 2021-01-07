package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day3 {

	@Test(dataProvider="getdata")
	public void Mobile(String username,String password)
	{
		System.out.println("this is mobile");
		System.out.println(username);
		System.out.println(password);
		
	}
	@Test(groups= {"smoke"})
	public void Tv()
	{
		System.out.println("this tv");
	}
	@BeforeSuite
	public void Bsuit()
	{
		System.out.println("I will execute before suit");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		data[0][0]="firstusername";
		data[0][1]="firstpassword";
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
		return data;
		
		
	}
	
	
}
