package Amazon_Project.Final;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_LoginPage extends DDT_File
{

	WebDriver driver;
	//1
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement  password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	@FindBy(id="createAccountSubmit")
	WebElement newcustomer;
	
	@FindBy(partialLinkText="Forgot password?")
	WebElement forgotpassword;
	
	@FindBy(id="nav-link-accountList")
	WebElement textaccandlist;
	
	@FindBy(xpath="//div[@id='auth-email-invalid-claim-alert']")
	WebElement invalidemailalert;
	
	@FindBy(xpath="(//div[@class='a-box-inner a-alert-container'])[1]")
	WebElement incorrectpassword;
	
	String afterlogintext;
	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
	
		DDT_File.username_password();
       Assert.assertEquals(driver.getTitle(), "Amazon Sign In","Testcase is fail");
		username.sendKeys(DDT_File.un);
		continue_button.click();
		Assert.assertEquals(forgotpassword.isDisplayed(),true,"Test Case is Failed");
		password.sendKeys(DDT_File.pw);
		signin_button.click();
	}
	
	public void registration()
	{
		newcustomer.click();
	}
	public void afterloginpage(String afterlogintext)
	{
		afterlogintext=textaccandlist.getText();
		this.afterlogintext=afterlogintext;
		System.out.println(afterlogintext);	
	}

	public void incorrectCredentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		DDT_File.incorrectunpw();
		username.sendKeys(DDT_File.un);
		continue_button.click();
		
		try
		{
		if(invalidemailalert.isDisplayed()==true)
		{
			Assert.assertTrue(true,"TestCase failed");
			Reporter.log("Test Case Passed-Login failed due to incorrect username");
			System.out.println("Test Case Passed-Login failed due to incorrect username");	
			}}
		catch(NoSuchElementException a)
		{
			password.sendKeys(DDT_File.pw);
			signin_button.click();
			if(incorrectpassword.isDisplayed()==true)
			{
				Assert.assertTrue(true,"Test Case 3 failed");
				Reporter.log("Test Case 3 Passed-Login failed due to incorrect password");
				System.out.println("Test Case 3 Passed-Login failed due to incorrect password");		
			}
		}
			
		}
	
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
