package Amazon_Project.Final;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Amz_ProfilePage 
{
	@FindBy(linkText="Edit your profile")
	WebElement editprofile;
	
	@FindBy(id="customer-profile-name-header")
	WebElement oldName;
	
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement editname;
	
	
	
	public void editProfileClick()
	{
		String originalProfile1=oldName.getText();
		System.out.println("The original profile name is "+originalProfile1);
		Reporter.log("The original profile name is "+originalProfile1);
		//this.originalProfile=originalProfile;*/
		
		editprofile.click();
	}
	public void editname()
	{
		editname.click();
	}
	
	public Amz_ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
