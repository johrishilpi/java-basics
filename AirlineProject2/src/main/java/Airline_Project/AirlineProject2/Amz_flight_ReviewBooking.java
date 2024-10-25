package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_flight_ReviewBooking 
{
	WebDriver driver;
@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
WebElement checkbox;

@FindBy(xpath="//button[.='Proceed to Payment']")
WebElement proceedToPaymentbutton;

@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
WebElement creditcardradio;

@FindBy(xpath="//input[@name='ppw-accountHolderName']")
WebElement nameAccHolder;

@FindBy(xpath="//input[@name='addCreditCardNumber']")
WebElement creditcardnumber;

@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
WebElement expmonth;

@FindBy(xpath="//select[@name='ppw-expirationDate_year']")
WebElement expyear;

@FindBy(xpath="//span[@id='pp-K5FGPc-149']")
WebElement enterCardDetails;

@FindBy(xpath="//span[.='Order Summary']")
WebElement ordersummary;

@FindBy(css="input[name*='addCreditCardVerificationNumber']")
WebElement cvv;

@FindBy(xpath="//span[@class='pmts-cc-number']")
WebElement cardselected;

public void proceedToPayment(WebDriver driver) throws EncryptedDocumentException, IOException, AWTException, InterruptedException
{
	checkbox.click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(proceedToPaymentbutton));
	proceedToPaymentbutton.click();
	wait.until(ExpectedConditions.visibilityOf(ordersummary));
	creditcardradio.click();
	nameAccHolder.clear();
	DDT_File.creditcarddetails();
	nameAccHolder.sendKeys(DDT_File.name);
	creditcardnumber.sendKeys(DDT_File.cardnum);
	Select s1=new Select(expmonth);
	s1.selectByVisibleText(DDT_File.expmon);
	Select s2=new Select(expyear);
	s2.selectByVisibleText(DDT_File.expyear);
	Robot r1=new Robot();
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(1000);
	r1.keyPress(KeyEvent.VK_ENTER);
	Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(30L))
		    .pollingEvery(Duration.ofSeconds(1))
		    .ignoring(TimeoutException.class);
	wait1.until(ExpectedConditions.visibilityOf(cvv));
	Actions a1=new Actions(driver);
	a1.moveToElement(cvv).perform();
	cvv.click();
	cvv.sendKeys(DDT_File.cvvnum);
	Assert.assertEquals(cardselected.getText(),"ending in 5770","Test Case 15 Failed-selection of credit card unsuccessful");
	System.out.println("Test Case 15 Passed-selection of credit card successful");
	Reporter.log("Test Case 15 Passed-selection of credit card successful");
	
}
public Amz_flight_ReviewBooking(WebDriver driver)
{
	PageFactory.initElements(driver, this);	
}
}
