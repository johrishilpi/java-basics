package Amazon_Project.Final;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_OrdersPage 
{
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(id="ap_password")
	WebElement  password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	@FindBy(xpath="//span[.='Your Orders']")
	WebElement yourorder;
	
	@FindBy(partialLinkText="Leave seller feedback")
	WebElement feedback;
	
	@FindBy(xpath="//label[@name='star5']")
	WebElement fivestar;
	
	@FindBy(xpath="//span[@id='text5' and @class='a-text-bold']")
	WebElement fivestarrating;
	
	public void login(WebDriver driver) throws EncryptedDocumentException, IOException
		{
		
			DDT_File.login2();
			username.sendKeys(DDT_File.un);
			continue_button.click();
			password.sendKeys(DDT_File.pw);
			signin_button.click();
		}
	
	public void revieworder()
	{
		yourorder.click();
		feedback.click();
		fivestar.click();
		String excel=fivestarrating.getText();
		System.out.println(excel);
		Assert.assertEquals(excel,"Excellent","Test Case 14 failed-5 star rating on product ordered failed");
		System.out.println("Test Case 14 passed-5 star rating on product ordered successful");
		Reporter.log("Test Case 14 passed-5 star rating on product ordered successful");
	}
	public Amz_OrdersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

}
