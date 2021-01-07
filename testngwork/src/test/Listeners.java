package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
@Override
public  void onTestFailure(ITestResult result) {
	
	
}
@Override
public  void onTestSuccess(ITestResult result) {
	
	System.out.println("hello abhishek this is listner test");
}

}
