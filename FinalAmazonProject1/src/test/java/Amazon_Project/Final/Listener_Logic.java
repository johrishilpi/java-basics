package Amazon_Project.Final;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Logic implements ITestListener
{static WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date d1=new Date();
	    System.out.println(d1);
	    String d2=d1.toString();
	    String d3=d2.replace(":","_");
	    String d4=d3.replace(" ", "_");
	    System.out.println(d4);
	    String classname=result.getInstanceName();
	    TakesScreenshot t1=  (TakesScreenshot) driver;
	    File source=t1.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\mailt\\eclipse-workspace\\Amazon_Project\\Pass_Screenshots\\PassTest"+classname+" "+d4+".png");
	    try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date d1=new Date();
	    System.out.println(d1);
	    String d2=d1.toString();
	    String d3=d2.replace(":","_");
	    String d4=d3.replace(" ", "_");
	    System.out.println(d4);
	    String classname=result.getInstanceName();
	    TakesScreenshot t1=  (TakesScreenshot) driver;
	    File source=t1.getScreenshotAs(OutputType.FILE);
	    File destination=new File("C:\\Users\\mailt\\eclipse-workspace\\Amazon_Project\\Fail_Screenshots\\FailTest"+classname+" "+d4+".png");
	    try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
