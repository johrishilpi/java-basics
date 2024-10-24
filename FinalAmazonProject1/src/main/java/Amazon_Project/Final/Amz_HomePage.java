package Amazon_Project.Final;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Amz_HomePage
{
	WebDriver driver;
	//1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountsandlist;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement signin_button;
	
	@FindBy(xpath="//button[@data-testid='manage-profiles-button']")
	WebElement manageprofile;

	@FindBy(id="nav-link-accountList")
	WebElement textlist;
	
	@FindBy(linkText="Your Account")
	WebElement youraccount;

	@FindBy(id="twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath="//a[@data-testid='profile-view-button']")
	WebElement viewbutton;
	
	String beforelogintext;
	String productsearch;
	
	
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
	public void searchProduct()
	{
		productsearch="shoe";
		search.sendKeys(productsearch); 
		search.sendKeys(Keys.ENTER);
		
	}
	public void manageprofile()
	{
		manageprofile.click();
	}
	
	public void viewbutton(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(viewbutton));
		viewbutton.click();
	}
	public void beforelogin(String beforelogintext )
	{
		beforelogintext=textlist.getText();
		this.beforelogintext=beforelogintext;
		System.out.println(beforelogintext);
	}
	
	public void youraccountlink()
	{
		youraccount.click();
	}
	
	public Amz_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
