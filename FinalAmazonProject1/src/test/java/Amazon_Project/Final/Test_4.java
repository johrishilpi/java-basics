package Amazon_Project.Final;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test_4 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void editprofileinfo() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.login(driver); 
		
		homepage.accountandlist(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(homepage.youraccount));
		homepage.youraccountlink();
		
		Amz_YourAccount account=new Amz_YourAccount(driver);
		account.editProfileInfo(driver);
		
		//Amz_ProfilePage profile=new Amz_ProfilePage(driver);
		//profile.editProfileClick();
		
		Amz_PublicProfilePageSettings changeprofile=new Amz_PublicProfilePageSettings(driver);
	
		changeprofile.changeProfileName(driver);
		//changeprofile.reverttooriginal1(driver);
		
	}

}
