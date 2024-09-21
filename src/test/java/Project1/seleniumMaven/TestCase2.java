package Project1.seleniumMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase2 extends Launch_Quit
{
	@Test
	public void login_to_amazon_search() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.login(driver);
		
		Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
		searchresult.searchtheproduct();
		
	}
	

	
}


