package Amazon_Project.Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;



public class Test_1 extends Launch_Quit
{
@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
public void newUserRegistration() throws InterruptedException, EncryptedDocumentException, IOException
{
	Amz_HomePage homepage=new Amz_HomePage(driver);
	homepage.accountandlist(driver);
	homepage.signin();
	
	Amz_LoginPage newcustomerregister= new Amz_LoginPage(driver);
	newcustomerregister.registration();
	
	Amz_RegistrationPage register=new Amz_RegistrationPage(driver);
	DDT_File.registration1();
	register.firstLastName();
	register.MobileNumber();
	register.passwordforregisteration();
	register.verifymobilenumberbutton();
	
	Amz_AuthenticationPage authentication=new Amz_AuthenticationPage(driver);
	authentication.puzzlepage(driver);
	
}


}
