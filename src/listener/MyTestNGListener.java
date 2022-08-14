package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyTestNGListener implements ITestListener{

	@Test
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
		System.out.println(result.getName());
		//System.out.println(result.getTestContext().getAttribute(name));
		System.out.println(result.getStatus());
		System.out.println("Checking the github updates");
		System.out.println(result.getThrowable().getMessage());
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed "+result.getName());
	}
}
