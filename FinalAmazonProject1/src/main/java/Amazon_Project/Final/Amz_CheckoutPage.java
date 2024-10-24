package Amazon_Project.Final;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_CheckoutPage 
{
	WebDriver driver;
	
@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
WebElement useaddress;

@FindBy(name="submissionURL")
WebElement addressradiobutton;

@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
WebElement creditdebit;

@FindBy(xpath="//span[.='Credit or debit card']")
WebElement creditdebitselect;

@FindBy(xpath="//input[@value='instrumentId=NetBanking&isExpired=false&paymentMethod=NB&tfxEligible=false']")
WebElement NetBanking;

@FindBy(xpath="//span[.='Other UPI Apps']")
WebElement upi;
@FindBy(xpath="//input[@placeholder='Enter UPI ID']")
WebElement upiID;


@FindBy(partialLinkText="Enter card details")
WebElement carddetails;

@FindBy(name="ApxSecureIframe")
WebElement paymentframe;

@FindBy(name="addCreditCardNumber")//credit card number inside i frame
WebElement cardnumber;

@FindBy(name="ppw-accountHolderName")
WebElement accountholdername;

@FindBy(xpath="//select[@name='ppw-expirationDate_month']")
WebElement expirationMonth1;

@FindBy(name="ppw-expirationDate_year")
WebElement expirationYear;

@FindBy(xpath="//span[@class='a-dropdown-prompt' and .='01']")
 WebElement expirationMonth;

@FindBy(xpath="//a[@id='pp-Ir2pGb-19_2']")
WebElement month3;
//@FindBy(xpath="//option[@value='3']")
//WebElement month;

//@FindBy(xpath="(//span[.='2024'])[1]")
//WebElement expirationYear;

@FindBy(xpath="//a[.='2025']")
WebElement year;

@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
WebElement enterdetailsbutton;

@FindBy(name="ppw-expirationDate_month")
WebElement monthselect;

@FindBy(name="apx-secure-field-addCreditCardVerificationNumber")
WebElement cvviframe;

@FindBy(xpath="//input[@class='card-cvv']")
WebElement cvv;

@FindBy(name="ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")
WebElement usethispayementtypebutton;

@FindBy(css="[aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
WebElement usethispayementtypebutton1;

@FindBy(xpath="//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
WebElement frameentercardbutton;

@FindBy(xpath="//span[@class='order-summary']")
WebElement orderdetails;

@FindBy(xpath="//span[@class='a-button a-spacing-top-medium a-button-primary']")
WebElement saveandcontinuebutton;

@FindBy(id="apx-secure-handle")
WebElement savebuttoniframe;

@FindBy(xpath="(//span[@class='a-text-bold'])[1]")
WebElement productnamecheckout;

@FindBy(xpath="//input[@value='instrumentId=APB&isExpired=false&paymentMethod=APB&tfxEligible=false']")
WebElement amazonPay;

@FindBy(xpath="//input[@name='ppw-claimCode']")
WebElement claimcode;

//2


public void UseThisAddressButton()
{
	useaddress.click();
	Assert.assertEquals(addressradiobutton.isSelected(), true,"Test case 11 failed-Address not selected");
	System.out.println("Test Case 11 passed-Address selected successfully");
	Reporter.log("Test Case 11 passed-Address selected successfully");
}

public void selectpaymenttype() throws InterruptedException
{
	Thread.sleep(5000);
	creditdebit.click();
	Assert.assertEquals(creditdebit.isSelected(), true,"Test Case 11 failed-Payment type not selected");
	System.out.println("Test Case 11 passed-Payment type selected successfully");
	Reporter.log("Test Case 11 passed-Payment type selected successfully");
}
public void selectVariousPaymentType(WebDriver driver) throws InterruptedException
{   WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
    wait.until(ExpectedConditions.elementToBeClickable(useaddress));
	useaddress.click();
	
	wait.until(ExpectedConditions.elementToBeClickable(creditdebitselect));
	creditdebitselect.click();
	//wait.until(ExpectedConditions.visibilityOf(amazonPay));
	
	//amazonPay.click();
	//Assert.assertEquals(amazonPay.isSelected(),true,"TestCase 12 failed-Selection of AmazonPay unsuccessful");
	//System.out.println("TestCase 12 Passed-Selection of AmazonPay successful");
	//Reporter.log("TestCase 12 Passed-Selection of AmazonPay successful");

	Assert.assertEquals(creditdebit.isSelected(),true,"TestCase 12 failed-Selection of credit or debit card unsuccessful");
	System.out.println("TestCase 12 Passed-Selection of credit or debit card successful");
	Reporter.log("TestCase 12 Passed-Selection of credit or debit card successful");
	//wait.until(ExpectedConditions.visibilityOf(NetBanking));
	wait.until(ExpectedConditions.elementToBeClickable(NetBanking));
	NetBanking.click();
	Assert.assertEquals(NetBanking.isSelected(),true,"TestCase 12 failed-Selection of NetBanking unsuccessful");
	System.out.println("TestCase 12 Passed-Selection of NetBanking successful");
	Reporter.log("TestCase 12 Passed-Selection of NetBanking successful");
	wait.until(ExpectedConditions.elementToBeClickable(upi));
	upi.click();
	Assert.assertEquals(upiID.isDisplayed(),true,"TestCase 12 failed-Selection of upi unsuccessful");
	System.out.println("TestCase 12 Passed-Selection of upi successful");
	Reporter.log("TestCase 12 Passed-Selection of upi successful");
		
}
public void EnterCardDetails(WebDriver driver) throws InterruptedException, AWTException, EncryptedDocumentException, IOException
{
	Thread.sleep(3000);
	Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_TAB);
	carddetails.click(); //enter the 
	driver.switchTo().frame(paymentframe);
	DDT_File.creditcarddetails();
	Thread.sleep(2000);
	cardnumber.sendKeys(DDT_File.cardnum);
	Thread.sleep(2000);
	accountholdername.clear();
	accountholdername.sendKeys(DDT_File.name);
	Select s1=new Select(expirationMonth1);
	s1.selectByVisibleText(DDT_File.expmon);
	Select s2=new Select(expirationYear);
	s2.selectByVisibleText(DDT_File.expyear);
	//enterdetailsbutton.click();
	

	/*Robot r1=new Robot();
	r1.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_ENTER);
    for(int i=0;i<4;i++)
    {Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_DOWN);}
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(2000);
    r1.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(2000);
    r1.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(1000);
    for(int i=0;i<4;i++)
    {Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_DOWN);
    }
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_TAB);
    Thread.sleep(500);*/
    frameentercardbutton.click();
    
    driver.switchTo().defaultContent();
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    driver.switchTo().frame(cvviframe);
   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class='card-cvv']")));
    cvv.sendKeys(DDT_File.cvvnum);
    driver.switchTo().defaultContent();
   wait.until(ExpectedConditions.presenceOfElementLocated(By.name("ppw-widgetEvent:SetPaymentPlanSelectContinueEvent")));
   usethispayementtypebutton1.click();
   driver.switchTo().frame(savebuttoniframe);
   r1.keyPress(KeyEvent.VK_TAB);
   Thread.sleep(500);
   r1.keyPress(KeyEvent.VK_TAB);
   Thread.sleep(1000);
   r1.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(500);
   r1.keyPress(KeyEvent.VK_ENTER);
   Thread.sleep(500);
   driver.switchTo().defaultContent();
   
   
   //saveandcontinuebutton.click();
   //usethispayementtypebutton1.click();
   //Thread.sleep(500);
   wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-label='Delivery address']")));
    Point p1=orderdetails.getLocation();
    int x=p1.getX();
    int y=p1.getY();
    System.out.println(x);
    System.out.println(y);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,"+600+")");
    for(int i=0;i<10;i++)
    {Thread.sleep(500);
    r1.keyPress(KeyEvent.VK_DOWN);}
    String after=productnamecheckout.getText();
    System.out.println(after);
    Assert.assertEquals(productnamecheckout.isDisplayed(), true,"Test Case 11 failed-Order review unsuccessful");
    System.out.println("Test Case 11 Passed-Order review successful- "+after+" displayed on the checkout page");
    Reporter.log("Test Case 11 Passed-Order review successful- "+after+" displayed on the checkout page");

	
}

public Amz_CheckoutPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



}
