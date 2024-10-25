package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Traveller_Details {
	WebDriver driver;
	@FindBy(xpath="//button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0']")
	WebElement gender;
	
	@FindBy(xpath="//h4[.='Gender']")
	WebElement gender1;

	@FindBy(xpath="//div[@id='fl_tr_add']")
	WebElement addAdult;
	
	@FindBy(xpath="//div[@class='_7c598c35 colorLink d7c291ce']")
	WebElement addAdult2;
	
@FindBy(xpath="//li[.='Female']")
WebElement female;

@FindBy(xpath="//li[.='Male']")
WebElement male;

@FindBy(name="first_name")
WebElement firstName;

@FindBy(name="last_name")
WebElement lastName;

@FindBy(xpath="//button[.='Add adult']")
WebElement addAdultbutton;

@FindBy(xpath="//span[@class='f240458b']")
WebElement numpassenger;

@FindBy(xpath="(//div[@class='ecbd2509 colorTertiary _6078df67'])[1]")
WebElement numpassenger1;

@FindBy(xpath="//button[.='Proceed to seat selection']")
WebElement ProceedSeatSelection;

@FindBy(xpath="//div[@id='fl_tr_select']")
List<WebElement> passenger2;

@FindBy(xpath="//span[@class='f240458b']")
WebElement numofpassenger;

@FindBy(xpath="//span[.='Vineet Johri']")
WebElement passengername1;

@FindBy(xpath="//span[.='Vandana Johri']")
WebElement passengername2;

@FindBy(xpath="//div[@id='fl_tr_delete']")
List<WebElement> delete;

@FindBy(xpath="//button[.='Delete']")
WebElement deletebutton;



	public void bookmultiplepassengers(WebDriver driver) throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		addAdult.click();
		gender.click();
		Robot r1=new Robot();
		Thread.sleep(500);	
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Actions a1=new Actions(driver);
		a1.doubleClick(female).perform();
		firstName.click();
		DDT_File.Travellername();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		firstName.sendKeys(DDT_File.un);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_TAB);
		lastName.sendKeys(DDT_File.pw);
		addAdultbutton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(addAdult2));
		addAdult2.click();
		wait.until(ExpectedConditions.elementToBeClickable(gender1));
		a1.doubleClick(gender1).perform();
		  
		Thread.sleep(500);		
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		a1.moveToElement(male).perform();
		male.click();
		//a1.doubleClick(male).perform();
		firstName.click();
		DDT_File.Travellername();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		firstName.sendKeys(DDT_File.un1);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_TAB);
		lastName.sendKeys(DDT_File.pw1);
		addAdultbutton.click();
		Thread.sleep(3000);
		String numofpass=numpassenger.getText();
		System.out.println(numofpass);
		int countpassenger=passenger2.size();
		for(int i=0;i<countpassenger;i++)
		{
		  WebElement w1=passenger2.get(i);
		  String s1=w1.getText();
		  System.out.println(s1);
		}
		
		Assert.assertEquals(numofpass, "(2/2)", "Test Case 9 failed-multiple passengers in single booking unsuccessful");
		//Assert.assertEquals(countpassenger,2,"Test Case 9 failed-multiple passengers in single booking unsuccessful");
		System.out.println("Test Case 9 passed-multiple passengers in single booking successful");
		Reporter.log("Test Case 9 passed-multiple passengers in single booking successful");
		
		/*int countdelete=delete.size();
		System.out.println(countdelete);
		for(int i=0;i<countdelete;i++)
		{
			Thread.sleep(3000);
			WebElement del=delete.get(i);
			Thread.sleep(3000);
			a1.moveToElement(del).perform();
			Thread.sleep(2000);
			del.click();
			Thread.sleep(3000);
			a1.doubleClick(deletebutton).perform();
		}*/
		/*wait.until(ExpectedConditions.elementToBeClickable(ProceedSeatSelection));
		ProceedSeatSelection.click();
		String s1=numpassenger1.getText();
		System.out.println(s1);*/
		
	}
	
	public Amz_Traveller_Details(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}


