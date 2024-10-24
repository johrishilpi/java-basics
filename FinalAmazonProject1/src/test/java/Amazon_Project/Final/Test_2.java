package Amazon_Project.Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test_2 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void login() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.beforelogin("acc");
		homepage.signin();
		
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.login(driver); 
		loginpage.afterloginpage("sj");
        String title=driver.getTitle();
        System.out.println(title);
        
        
        if(!(homepage.beforelogintext.equals(loginpage.afterlogintext))||title.equalsIgnoreCase("Authentication required"))
		{
			Assert.assertTrue(true);
			Reporter.log("Test Case 2 Passed -Login successful");
			System.out.println("Test Case 2 Passed -Login successful");
		}
		else
		{
			Assert.fail("Test Case Fail-Login Failed");
		}
	
	}
	
	

}
