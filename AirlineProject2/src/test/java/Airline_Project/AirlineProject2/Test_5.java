package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test_5 extends Launch_Quit
{
	@Test(retryAnalyzer=Airline_Project.AirlineProject2.Retry_Logic.class)
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		Amz_flight_Login loginpage=new Amz_flight_Login(driver);
		loginpage.login(driver); 
		
		Amz_flight_Homepage homepage=new Amz_flight_Homepage(driver);
		homepage.roundTripFlightSearch(driver);
		homepage.searchclick(driver);
		homepage.roundTripFlightSearchassert(driver);
	
	
	}
	
}
