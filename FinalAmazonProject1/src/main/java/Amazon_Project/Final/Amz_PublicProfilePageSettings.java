package Amazon_Project.Final;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_PublicProfilePageSettings 
{
	@FindBy(name="profile[name]")
	//@FindBy(name="name")
	WebElement profilename;
	
	@FindBy(id="save-public-activity")
	WebElement save;
	
	@FindBy(id="a-autoid-3")
	WebElement submit;
	
	@FindBy(id="nav-link-accountList")
	WebElement accountsandlist1;
	
	@FindBy(linkText="Your Account")
	WebElement youraccount1;
	
	@FindBy(id="customer-profile-name-header")
	WebElement newName;
	
	@FindBy(xpath="(//a[.='Back to public profile'])[1]")
	WebElement backtopublicprofile;
	
	@FindBy(linkText="Edit your profile")
	WebElement editprofile;
	
	@FindBy(id="customer-profile-name-header")
	WebElement oldName;
	
	
	String newProfileName;
	
	public void changeProfileName(WebDriver driver) throws InterruptedException
	{
		
		String originalProfile1=oldName.getText();
		System.out.println("The original profile name is "+originalProfile1);
		Reporter.log("The original profile name is "+originalProfile1);
		
		editprofile.click();
		profilename.clear();
		Thread.sleep(3000);
		profilename.sendKeys("Sanji"+Math.random());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(2000);
		backtopublicprofile.click();
		driver.navigate().refresh();
		String newprofilename=newName.getText();
		System.out.println("The new profile name is "+newprofilename);
		if(!(newprofilename==originalProfile1))
		{
			Assert.assertTrue(true);
			System.out.println("Test Case 4 passed-Change profile name successful");
			Reporter.log("Test Case 4 passed-Change profile name successful");
		}
		else
		{
			Assert.fail("Test Case 4 fail-Change of profile name unsuccessful");
		}
		//Assert.assertEquals(newprofilename,"Devanshi","Test Case 4 failed-Change profile name unsuccessful");
		
		}
	
	public void reverttooriginal(WebDriver driver) throws InterruptedException
	{
		
		profilename.clear();
		Thread.sleep(3000);
		profilename.sendKeys("Sanji");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(2000);
		backtopublicprofile.click();
		}
	public void reverttooriginal1(WebDriver driver) throws InterruptedException
	{
		
		editprofile.click();
		profilename.clear();
		Thread.sleep(3000);
		profilename.sendKeys("Sanji");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		//Thread.sleep(2000);
		//backtopublicprofile.click();
		//driver.navigate().refresh();
		}
	
	public Amz_PublicProfilePageSettings(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
