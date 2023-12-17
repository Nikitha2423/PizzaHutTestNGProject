package Listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.LibDriver;

public class MyListener implements ITestListener{
	
	LibDriver rv = new LibDriver();
	ExtentReports extent;
	ExtentTest test;
	

	
	@Override
	public void onStart(ITestContext context) {
		WebDriver driver;
		String time = rv.GetCurrentTime();
		String testName= "TestExecution";
		String repName = testName+"_"+time+".html";
		
		//report name -> TestExecution_21102023.html
		
		ExtentSparkReporter html = new ExtentSparkReporter(repName);
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+" OnTestStart");
		test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" pass");
		test.pass(result.getName()+" pass");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+" fail");
		test.fail(result.getName()+" fail");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" skip");
		test.skip(result.getName()+" skip");
	}
	
@Override
public void onFinish(ITestContext context) {
	extent.flush();
}
}
