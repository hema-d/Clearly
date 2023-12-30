package testngconceptclearly;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class MyListerner_Facebook implements ITestListener{
	
	public ExtentSparkReporter report;
	public ExtentReports myreport;
	public ExtentTest test;
	
	public void OnStart(ITestContext context) {
		
		report=new ExtentSparkReporter(System.getProperty("user.dir"+ "/reports/myreports.html"));
		
		report.config().setDocumentTitle("Automation testing");
		report.config().setReportName("Functional testing");
		report.config().setTheme(Theme.STANDARD);
		
		myreport=new ExtentReports();
		myreport.attachReporter(report);
		
		myreport.setSystemInfo("Environment", "QA");
		myreport.setSystemInfo("Hema", "QA");
		
	}
	
	
   public void OnTestSuccess(ITestResult result) {
	test=   myreport.createTest(result.getName());
	test.log(Status.PASS, "Test case PASSED is:" + result.getName());
		
	}
   
   public void OnTestFailure(ITestResult result) {
	   
	   test = myreport.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is:" + result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: " + result.getThrowable()); 
	}
   
   public void OnTestSkipped(ITestResult result) {
		test=myreport.createTest(result.getName());
		test.log(Status.SKIP, result.getName());
		
	}
   

	public void onFinish(ITestContext context) {
		
		myreport.flush();
	}


}
