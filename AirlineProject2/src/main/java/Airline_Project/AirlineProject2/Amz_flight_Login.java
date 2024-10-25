package Airline_Project.AirlineProject2;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;



public class Amz_flight_Login 
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
	
	@FindBy(xpath="//h4[.='There was a problem']")
	WebElement invalidemailalert;
	
	@FindBy(xpath="//h4[.='There was a problem']")
	WebElement incorrectpassword;
	
	String afterlogintext;
	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
	
		DDT_File.username_password();
        username.sendKeys(DDT_File.un);
		continue_button.click();
		password.sendKeys(DDT_File.pw);
		signin_button.click();
		
	}
	public void loginassert(WebDriver driver)
	{
		Assert.assertEquals(driver.getTitle(),"Flight Bookings on Amazon" ,"Test Case 2 failed-sign in unsuccessful" );
	    System.out.println("Test Case 2 passed-sign in successful");
	    Reporter.log("Test Case 2 passed-sign in successful");
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
	{   DDT_File.incorrectunpw();
		username.sendKeys(DDT_File.un);
		continue_button.click();
	try
	{
		if(invalidemailalert.isDisplayed()==true)
		{
			Assert.assertTrue(true,"TestCase 3-failed");
			Reporter.log("Test Case 3 Passed-Login failed due to incorrect username");
			System.out.println("Test Case 3 Passed-Login failed due to incorrect username");	
			}}
		catch(org.openqa.selenium.NoSuchElementException a)
		{
			DDT_File.incorrectunpw();
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
	
	public Amz_flight_Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
