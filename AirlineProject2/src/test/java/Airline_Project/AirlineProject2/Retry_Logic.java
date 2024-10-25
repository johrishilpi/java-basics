package Airline_Project.AirlineProject2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer
{
	int count=0;
	int retry=2;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retry)
		{
			count++;
			return true;
		}
		
		return false;
	}

	}


