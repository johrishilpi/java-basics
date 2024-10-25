package Airline_Project.AirlineProject2;

import java.io.IOException;

import org.testng.annotations.Test;

public class Test_3 extends Launch_Quit
{
	@Test(retryAnalyzer=Airline_Project.AirlineProject2.Retry_Logic.class)
	public void incorrectlogin() throws InterruptedException,IOException 
	{
	
		Amz_flight_Login loginpage=new Amz_flight_Login(driver);
		loginpage.incorrectCredentials();
		
}
}
