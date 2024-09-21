package Project1.seleniumMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import dev.failsafe.internal.util.Assert;



public class Amz_LoginPage 
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
	
	
	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		//username.sendKeys("stbymkt@gmail.com");
		DDT_File d1=new DDT_File();
		d1.username_password();
       //Assert.assertEquals(driver.getTitle(), "Amazon Sign In","Testcase is fail");
		username.sendKeys(d1.un);
		continue_button.click();
		//password.sendKeys("bhy76trfvbn");
		//Assert.assertEquals(forgotpassword.isDisplayed(),true,"Test Case is Failed");
	
		password.sendKeys(d1.pw);
		signin_button.click();
	}
	
	public void registration()
	{
		newcustomer.click();
	}
	
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
