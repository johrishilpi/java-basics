package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test_6 extends Launch_Quit
{
	@Test(retryAnalyzer=Airline_Project.AirlineProject2.Retry_Logic.class)
	public void login() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		
		Amz_flight_Login loginpage=new Amz_flight_Login(driver);
		loginpage.login(driver); 
		
		Amz_flight_Homepage homepage=new Amz_flight_Homepage(driver);
		homepage.oneWayFlightSearch(driver);
		homepage.economysearch(driver);
		homepage.economyassert();
		homepage.backpage(driver);
		
		homepage.premiumeconomysearch(driver);
		homepage.backpage(driver);
		homepage.businesssearch(driver);
	
		
		

	
	}

}
