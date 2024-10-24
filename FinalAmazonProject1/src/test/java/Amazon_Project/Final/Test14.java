package Amazon_Project.Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test14 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void orderRating() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_OrdersPage order=new Amz_OrdersPage(driver);
		order.login(driver);
		homepage.accountandlist(driver);
		order.revieworder();
	}
	

}
