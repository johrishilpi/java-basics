package Airline_Project.AirlineProject2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test_2 extends Launch_Quit
{
	@Test(retryAnalyzer=Airline_Project.AirlineProject2.Retry_Logic.class)
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Amz_flight_Login loginpage=new Amz_flight_Login(driver);
		loginpage.login(driver); 
		loginpage.loginassert(driver);
	
	}
}
