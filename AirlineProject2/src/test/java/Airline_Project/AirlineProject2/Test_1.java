package Airline_Project.AirlineProject2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test_1 extends Launch_Quit
{@Test(retryAnalyzer=Airline_Project.AirlineProject2.Retry_Logic.class)
public void newUserRegistration() throws InterruptedException, EncryptedDocumentException, IOException
{
	
	Amz_flight_Login newcustomerregister= new Amz_flight_Login(driver);
	newcustomerregister.registration();
	
	Amz_flight_Registration register=new Amz_flight_Registration(driver);
	DDT_File.registration1();
	register.firstLastName();
	register.MobileNumber();
	register.passwordforregisteration();
	register.verifymobilenumberbutton();
	
	Amz_flight_Authentication authentication=new Amz_flight_Authentication(driver);
	authentication.puzzlepage(driver);
	
}

}
