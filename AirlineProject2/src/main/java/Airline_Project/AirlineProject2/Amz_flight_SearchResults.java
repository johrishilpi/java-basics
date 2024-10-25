package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_flight_SearchResults 
{
	WebDriver driver;
@FindBy(xpath="//div[.='Preferred Layovers']")
WebElement layover;

@FindBy(xpath="//div[@id='fli_li_layover']/ul/li")
List<WebElement> layoverlist;

@FindBy(xpath="//i[@class='d726bd8f _4d2636f0']")
List<WebElement> checkbox;

@FindBy(xpath="//p[@class='colorTertiary']")
List <WebElement> layovercity; 

@FindBy(xpath="(//button[.='Book'])[1]")
WebElement bookbutton;

@FindBy(xpath="//button[.='Proceed to traveller details']")
WebElement travellerDetailsbutton;

@FindBy(xpath="//button[.='Proceed to seat selection']")
WebElement ProceedSeatSelection;

@FindBy(xpath="//h3[.='Total Amount']")
WebElement amt;

@FindBy(xpath="//button[@class=' _526485ba _7e41f983   cdf8d022 _50baedd0']")
WebElement gender;

@FindBy(xpath="//div[@id='fl_tr_add']")
//@FindBy(xpath="//div[@class='_7c598c35 colorLink d7c291ce']")
WebElement addAdult;

@FindBy(xpath="//button[@class='_7e149b6e  ' and .='0']")
WebElement nochildrentraveller;

@FindBy(xpath="//button[@class='_7e149b6e  ' and .='2']")
WebElement twochildrentraveller;

@FindBy(xpath="(//div[@id='fl_tr_add'])[2]")
WebElement addchild;

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

@FindBy(xpath="(//div[@class='_0d462540  _1b6b90e5  '])[1]")
WebElement seatselect;

@FindBy(xpath="//div[@class='tabListInner']")
List<WebElement> flight;

@FindBy(xpath="//button[.='Next']")
WebElement nextbutton;

@FindBy(xpath="//h3[.='Final payable amount']")
WebElement amount;

@FindBy(xpath="//h2[.='Review Booking ']")
WebElement reviewbooking;

@FindBy(xpath="//div[@class='_7c598c35 a69d62e8']")
WebElement viewfaredetails;

@FindBy(xpath="//div[@class='_7c598c35 ']")
WebElement viewBaggageAndCancellationPolicy;

@FindBy(xpath="//div[@class='_35bc1e58']")
WebElement flightinfo;

@FindBy(xpath="//h3[.='Fare Details']")
WebElement faredetails;

@FindBy(xpath="//p[.='Baggage details are indicative; Exact baggage requirements will be available on the e-ticket after booking.']")
WebElement baggagedetail;

@FindBy(xpath="//div[.='Cancellation']")
WebElement cancellationtab;

@FindBy(xpath="//p[.='Airline cancellation charges per traveller; Exact cancellation charges will be available on the e-ticket after booking.']")
WebElement cancellationdetail;

@FindBy(xpath="//input[@id='input-mobile']")
WebElement mobile;

@FindBy(xpath="//input[@id='input-email']")
WebElement email;

@FindBy(xpath="//span[.='Vandana Johri']")
WebElement passengername;

@FindBy(id="nav-link-accountList")
WebElement accountAndList;

@FindBy(xpath="//span[.='Sign Out']")
WebElement signOut;

@FindBy(xpath="//div[@id='fl_tr_delete']")
WebElement delete;
		
	public void scrollpage(WebDriver driver)
	{
 	    JavascriptExecutor js=(JavascriptExecutor) driver;
 	   js.executeScript("window.scrollBy(0,500)");
	}
	
	public void multicity(WebDriver driver) throws AWTException, InterruptedException
	{
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='fli_li_layover']/ul/li")));
		int count=layoverlist.size();
		for(int i=0;i<count;i++)
		{
			WebElement w1=layoverlist.get(i);
			String text=w1.getText();
			System.out.println(text);
		}
		WebElement w2=layoverlist.get(count-1);
		String textlayover=w2.getText();
		w2.click();
		System.out.println(textlayover);
		bookbutton.click();
	    int count1=layovercity.size();
	    for(int i=0;i<count1;i++)
	    {
	    	WebElement w3=layovercity.get(i);
	    	String s1=w3.getText();
	    	
	    }
	    WebElement w4=layovercity.get(2);
	    String layoverAirport=w4.getText();
	    System.out.println(layoverAirport);
	    String [] a5=layoverAirport.split(" ");
	    System.out.println(Arrays.toString(a5));
	    int c1=a5.length;
	    System.out.println(c1);
	    String a6=a5[c1-1];
	    System.out.println(a6);
		//Assert.assertEquals(checkboxlast.isSelected(),true,"Test Case 7 Failed-Layover selection unsuccessful");
		//System.out.println("Test Case 7 Successful-Layover selection successful");
		//Reporter.log("Test Case 7 Successful-Layover selection successful");
				
	}
	public void seatSelection(WebDriver driver) throws AWTException, InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
 	    wait.until(ExpectedConditions.elementToBeClickable(bookbutton));
		bookbutton.click();
		
 	    wait.until(ExpectedConditions.elementToBeClickable(travellerDetailsbutton));
		travellerDetailsbutton.click();
		addAdult.click();
		//wait.until(ExpectedConditions.elementToBeClickable(gender));
		//Select s1=new Select(gender);
		//s1.selectByVisibleText("Female");
		  gender.click();
		//Actions a1=new Actions(driver);
		//a1.doubleClick(gender);
		Robot r1=new Robot();
		Thread.sleep(1000);	
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
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		lastName.sendKeys(DDT_File.pw);
		addAdultbutton.click();
		 Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
				    .withTimeout(Duration.ofSeconds(30L))
				    .pollingEvery(Duration.ofSeconds(1))
				    .ignoring(TimeoutException.class);
		wait1.until(ExpectedConditions.visibilityOf(ProceedSeatSelection));
		a1.doubleClick(amt).perform();
		r1.keyPress(KeyEvent.VK_TAB);
	
		//ProceedSeatSelection.click();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_ENTER);
		
		
		//r1.keyPress(KeyEvent.VK_ENTER);
		
		/*amt.click();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyPress(KeyEvent.VK_ENTER);*/
		/*boolean a=seatselect.isEnabled();
		System.out.println("before "+ a);
		seatselect.click();
		boolean b=seatselect.isEnabled();
		System.out.println("after "+ b);*/
		for(int i=0;i<flight.size();i++)
		{
		  WebElement flight1=flight.get(i);
		  flight1.click();
		  Thread.sleep(1000);
		  seatselect.click();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(nextbutton));
		nextbutton.click();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);	
		
		
	}
	public void seatselectionassert()
	{
		boolean b1=reviewbooking.isDisplayed();
		System.out.println(b1);
		Assert.assertEquals(b1, true,"Test 8 Failed-Seat selection unsuccessful");
		System.out.println("Test 8 Passed-Seat selection successful");
		Reporter.log("Test 8 Passed-Seat selection successful");
	}
	public void clickbook(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
 	    wait.until(ExpectedConditions.elementToBeClickable(bookbutton));
		bookbutton.click();
	}
	public void travellerDetails(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(travellerDetailsbutton));
		travellerDetailsbutton.click();
	}
	
	
	public void bookmultiplepassengers(WebDriver driver) throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		
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
		
		addAdult.click();
		  gender.click();
		  
		Thread.sleep(500);		
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		a1.doubleClick(male).perform();
		firstName.click();
		DDT_File.Travellername();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		firstName.sendKeys(DDT_File.un1);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_TAB);
		lastName.sendKeys(DDT_File.pw1);
		addAdultbutton.click();
		/*addchild.click();
		gender.click();
		Thread.sleep(500);	
		r1.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		a1.doubleClick(female).perform();
		firstName.click();
		DDT_File.Travellername();
		Thread.sleep(1000);
		r1.keyPress(KeyEvent.VK_TAB);
		firstName.sendKeys(DDT_File.un1);
		Thread.sleep(500);
		r1.keyPress(KeyEvent.VK_TAB);
		lastName.sendKeys(DDT_File.pw1);*/
		
	}
	public void viewdetails(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(viewfaredetails));
		viewfaredetails.click();
		wait.until(ExpectedConditions.elementToBeClickable(viewBaggageAndCancellationPolicy));
		viewBaggageAndCancellationPolicy.click();
		
		Assert.assertEquals(flightinfo.isDisplayed(), true,"Test Case 10 failed-flight information details not available");
		System.out.println("Test Case 10 passed-flight information details available");
		Reporter.log("Test Case 10 passed-flight information details available");
		
		Assert.assertEquals(faredetails.isDisplayed(), true,"Test Case 10 failed-fare details not available");
		System.out.println("Test Case 10 passed-fare details available");
		Reporter.log("Test Case 10 passed-fare details available");
		
		Assert.assertEquals(baggagedetail.isDisplayed(), true,"Test Case 10 failed-baggage details not available");
		System.out.println("Test Case 10 passed-baggage details available");
		Reporter.log("Test Case 10 passed-baggage details available");
		
		cancellationtab.click();
		
		Assert.assertEquals(cancellationdetail.isDisplayed(), true,"Test Case 10 failed-cancellation details not available");
		System.out.println("Test Case 10 passed-cancellation details available");
		Reporter.log("Test Case 10 passed-cancellation details available");
		
	}
	public void userEntry(WebDriver driver) throws InterruptedException, EncryptedDocumentException, IOException, AWTException
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
		
		mobile.clear();
		DDT_File.mobile();
		mobile.sendKeys(DDT_File.un);
		
		email.clear();
		email.sendKeys(DDT_File.pw);
		
		Assert.assertEquals(passengername.getText(),"Vandana Johri","Test Case 11 failed-User Entry of passenger name unsuccessful");
		System.out.println("Test Case 11 passed-User Entry of passenger name successful");
		Reporter.log("Test Case 11 passed-User Entry of passenger name successful");
		
		Assert.assertEquals(mobile.getAttribute("value"),"7555689709","Test Case 11 failed-User Entry of mobile number unsuccessful");
		System.out.println("Test Case 11 passed-User Entry of mobile number successful");
		Reporter.log("Test Case 11 passed-User Entry of mobile number successful");
		
		Assert.assertEquals(email.getAttribute("value"),"johrishilpi@yahoo.com","Test Case 11 failed-User Entry of email unsuccessful");
		System.out.println("Test Case 11 passed-User Entry of email successful");
		Reporter.log("Test Case 11 passed-User Entry of email successful");
		
	}
	
	public void logout(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndList).perform();
		a1.moveToElement(signOut).perform();
		signOut.click();
		
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In","Test Case 12 failed-Login,search and logout failed");
		System.out.println("Test Case 12 passed-Login,search and logout passed");
		Reporter.log("Test Case 12 passed-Login,search and logout passed");
	}
	
	
	
	public Amz_flight_SearchResults	(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
