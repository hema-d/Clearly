package testngconceptclearly;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistners implements ITestListener{
	

	public void onTestStart(ITestResult result) {
		System.out.println("Started");
	}
	
public void onTestFailure(ITestResult result) {
	System.out.println("Failed");
	}

public void onTestSuccess(ITestResult result) {
	System.out.println("sucess");
}

public void onTestSkipped(ITestResult result) {
	System.out.println("skipped");
}

public void m1() {
	System.out.println("Hema");
}


}
