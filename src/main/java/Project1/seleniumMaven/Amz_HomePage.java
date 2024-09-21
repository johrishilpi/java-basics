package Project1.seleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_HomePage
{
	WebDriver driver;
	//1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlist;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement signin_button;
	
	public void accountandlist(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountsandlist).perform();	
	}
	
	public void signin() throws InterruptedException
	{
		Thread.sleep(1000);
		signin_button.click();	
	}
	
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
