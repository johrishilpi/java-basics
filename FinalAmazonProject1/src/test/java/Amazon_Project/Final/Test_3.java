package Amazon_Project.Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test_3 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void incorrectlogin() throws InterruptedException,IOException 
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
	
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.incorrectCredentials();
		
}
}
