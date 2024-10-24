package Amazon_Project.Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_AuthenticationPage 
{
@FindBy(xpath="//h1[@id='aacb-captcha-header']")
WebElement captcha;

@FindBy(xpath="//button[.='Start Puzzle']")
WebElement puzzle;

public void puzzlepage(WebDriver driver) throws InterruptedException
{
	Thread.sleep(10000);
	if(driver.getTitle().equalsIgnoreCase("Authentication required")||driver.getTitle().equalsIgnoreCase("Amazon Phone Verification"))
	{
	Assert.assertTrue(true);
	System.out.println("Test Case 1 Passed-New user registration successful");
	Reporter.log("Test Case 1 Passed-New user registration successful");

	}
	else
	{Assert.fail("RegistrationFailed");
	
	}
		
	
}
public Amz_AuthenticationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
