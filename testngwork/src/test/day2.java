package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups= {"smoke"})
	public void Demo2()
	{
		System.out.println("abhishekrathore");
	}
	
	@BeforeTest
	public void Demo3()
	{
		System.out.println("i will execute first");
	}
	
	@AfterSuite
	public void Bsuit()
	{
		System.out.println("I will execute after the suit");
	}
	
	
	

}
