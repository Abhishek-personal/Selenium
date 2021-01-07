package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day1 {

	
		// TODO Auto-generated method stub
	@Test
		public void Demo()
		{
		System.out.println("hello");
		}
	@Test(groups= {"smoke"})
		public void SecondTest()
		{
		System.out.println("abhishek");
		}
	@AfterTest
		public void Lastexecution()
		{
		System.out.println("I will execute last");
		}
	@BeforeMethod
	public void Bmethod()
	{
	System.out.println("I will execute before every method in day 1");
	}

}
