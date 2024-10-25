package Airline_Project.AirlineProject2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
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

public class Amz_flight_Homepage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[.='New Delhi']")
	WebElement startcity;	
	
	@FindBy(name="searchText")
	WebElement startsearch;
	
	@FindBy(xpath="//input[@placeholder='Select Airport']")
	WebElement destination;
	
	@FindBy(xpath="//div[@class='_4e0ac60f _360de181 ad23ce76']")
	List<WebElement> cityauto;
	
//	@FindBy(xpath="//li[@class=' ca600550     ']")
	@FindBy(xpath="(//div[@class='_79bb5d49'])[1]")
	//@FindBy(xpath="//span[@class='db14b3bc']")
	//List<WebElement> traveldate;
	WebElement traveldate1;
	
	@FindBy(xpath="//li[@class=' ca600550     ']")
	List<WebElement> traveldate;
	
	@FindBy(xpath="(//li[@class=' ca600550     ' and .='1'])[1]")
	WebElement traveldate2;
	
	@FindBy(xpath="//button[@class='_7e149b6e  ']")
	List<WebElement> peoplenum;
	
	//@FindBy(xpath="(//button[@class='_7e149b6e  edfe9d73' and .='1'])[1]")
	@FindBy(xpath="//button[@class='_7e149b6e  ' and .='1']")
	WebElement oneadulttraveller;
	
	@FindBy(xpath="//p[.='Adults']")
	WebElement adult;
	
	@FindBy(xpath="//p[.='Children']")
	WebElement children;
	
	@FindBy(xpath="(//button[.='1'])[1]")
	WebElement oneadult;
	
	@FindBy(xpath="(//button[.='2'])[1]")
	WebElement twoadults;
	
	@FindBy(xpath="//button[@class='_7e149b6e  edfe9d73' and .='0']")
	WebElement nochildrentraveller;

	@FindBy(xpath="//button[@class='_7e149b6e  ' and .='2']")
	WebElement twochildrentraveller;
	
	@FindBy(xpath="(//button[@class='_7e149b6e  edfe9d73'])[3]")
	WebElement noinfanttraveller;
	
	@FindBy(xpath="//button[.='Search']")
	WebElement searchbutton;
	
	@FindBy(xpath="(//button[.='Book'])[1]")
	WebElement bookbutton;
	
	@FindBy(xpath="//button[.='Book']")
	WebElement bookbuttonforround;
	
	@FindBy(xpath="//div[@class='_82328473']")
	WebElement search1;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[1]")
	WebElement onewayradiobutton;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[2]")
	WebElement roundtripradiobutton;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[3]")
	WebElement economy;
	
	@FindBy(xpath="//span[.='Economy']")
	WebElement economy1;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[4]")
	WebElement premiumeconomy;
	
	@FindBy(xpath="//span[.='Premium Economy']")
	WebElement premiumeconomy1;
	
	@FindBy(xpath="(//i[@class='_4b539ab8'])[5]")
	WebElement business;
	
	@FindBy(xpath="//span[.='Business']")
	WebElement business1;
	
	@FindBy(xpath="(//div[@class='_8bbcb8f2'])[2]")
	WebElement roundtripdate;
	
	@FindBy(xpath="//span[@class='_6480025a  _3cfb16b8']")
	WebElement closeroundtripdate;
	
	@FindBy(xpath="//li[@class=' ca600550     ']")
	//@FindBy(xpath="//span[@class='db14b3bc']")
	List<WebElement> datetocomeback;
	
	@FindBy(xpath="//span[.='Add Return']")
	WebElement addreturn;
	
	@FindBy(xpath="//div[@class='sizeMedium a8cdd5cb']")
	WebElement traveller;
	
	//@FindBy(xpath="//div[@id='fl_li_round_trip_cta']")
	@FindBy(xpath="//button[.='Book']")
	WebElement booktrip;
	
	@FindBy(xpath="//button[@class='_4a388932']")
	WebElement forwardarrow;
	
	@FindBy(xpath="//p[@class='fa8943dd _433fc5ff']")
	List<WebElement> months;
	
	@FindBy(css="li[class*=' ca600550     ']")
	List<WebElement> dates;
	
	
	
	
	public void oneWayFlightSearch(WebDriver driver) throws InterruptedException, AWTException
	{
		onewayradiobutton.click();
		search1.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(cityauto));
		
		WebElement w1=cityauto.get(1);
		w1.click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchText")));
	    startsearch.click();
	    WebElement w2=cityauto.get(0);
	    w2.click();
	    
	   // forwardarrow.click();
	
	   /* Thread.sleep(5000);
	    WebElement date=traveldate.get(10);
	    wait.until(ExpectedConditions.visibilityOf(date));
	    String datenum=date.getText();
	    System.out.println(datenum);
	    date.click();
	    
    Date d1=new Date();
    System.out.println(d1);
    String s1=d1.toString();
    String s2=s1.substring(8,10);
    System.out.println(s2);*/
    
    traveldate1.click();
	    
	    //WebElement people=peoplenum.get(0);
	    //people.click();
	    //oneadulttraveller.click();
    traveller.click();
    oneadult.click();
    
	   /* Actions a1=new Actions(driver);
	    a1.doubleClick(adult).perform();
	    Robot r1=new Robot();
	    Thread.sleep(1000);
	    r1.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(1000);
	    r1.keyPress(KeyEvent.VK_ENTER);*/
	    
	   /* a1.doubleClick(children).perform();
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_ENTER);*/
	    
	    
	    Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
	    	    .withTimeout(Duration.ofSeconds(30L))
	    	    .pollingEvery(Duration.ofSeconds(1))
	    	    .ignoring(NoSuchElementException.class);
	  //  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='_7e149b6e  ' and .='0'])[1]")));
	    nochildrentraveller.click();
	   // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='_7e149b6e  edfe9d73'])[3]"))); 
	    noinfanttraveller.click(); 
	}
	    
	    public void searchclick(WebDriver driver)
	    {
	    	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	 	    wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
	 	    searchbutton.click();
	    }
	   
	   public void oneWayFlightSearchassert()
	   {
		   Assert.assertEquals(bookbutton.isDisplayed(), true,"Test Case 4 failed-Search functionality for One Way flight unsuccessful");
		   System.out.println("Test Case 4 Passed-Search functionality for One Way flight successful");
		     Reporter.log("Test Case 4 Passed-Search functionality for One Way flight successful");
	   }

		
	
	public void roundTripFlightSearch(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='_4b539ab8'])[2]")));
		roundtripradiobutton.click();
		
		search1.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(cityauto));
		
		WebElement w1=cityauto.get(2);
		w1.click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchText")));
	    startsearch.click();
	    WebElement w2=cityauto.get(3);
	    w2.click();
	    
	    WebElement date=traveldate.get(5);
	    String datenum=date.getText();
	    System.out.println(datenum);
	    Actions a1=new Actions(driver);
	    a1.doubleClick(date).perform();
	   // date.click();
	    
	    /*roundtripdate.click();
	    roundtripdate.click();
	    //closeroundtripdate.click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='_4e0ac60f  '])[2]")));
	    Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(30L))
	    .pollingEvery(Duration.ofSeconds(1))
	    .ignoring(NoSuchElementException.class);*/
	    Thread.sleep(3000);
	    WebElement date1=datetocomeback.get(40);
	    String datenum1=date1.getText();
	    System.out.println(datenum1);
	    a1.doubleClick(date1).perform();
	    traveller.click();
	    
	   // WebElement people=peoplenum.get(0);
	    //people.click();
	    
	    /*oneadulttraveller.click();
	    nochildrentraveller.click();
	    noinfanttraveller.click();   */
	}
	
	public void roundTripFlightSearchassert(WebDriver driver)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Book']")));
		Assert.assertEquals(booktrip.isDisplayed(), true,"Test Case 5 failed-Search functionality for round trip flight unsuccessful");
		 System.out.println("Test Case 5 Passed-Search functionality for round trip flight successful");
		   Reporter.log("Test Case 5 Passed-Search functionality for round trip flight successful");	
	}
	public void roundTripFlightSearchassert14(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.='Book']")));
		Assert.assertEquals(booktrip.isDisplayed(), true,"Test Case 14 failed-Search functionality for domestic round trip flight unsuccessful");
		 System.out.println("Test Case 14 Passed-Search functionality for domestic round trip flight successful");
		   Reporter.log("Test Case 14 Passed-Search functionality for domestic round trip flight successful");	
	}
	
	public void economysearch(WebDriver driver) throws InterruptedException
	{
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30L))
			    .pollingEvery(Duration.ofSeconds(1))
			    .ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOf(economy));
		economy.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 	    wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
 	    searchbutton.click();
		
	}
	public void economyassert()
	{
		Assert.assertEquals(economy1.isDisplayed(), true,"Test Case 6 failed-Search functionality for economy unsuccessful");
		 System.out.println("Test Case 6 Passed-Search functionality for economy successful");
		   Reporter.log("Test Case 6 Passed-Search functionality for economy successful");	  
	}
	public void backpage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		   driver.navigate().back();
	}
	
	public void premiumeconomysearch(WebDriver driver) throws InterruptedException
	{
		economy1.click();
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30L))
			    .pollingEvery(Duration.ofSeconds(1))
			    .ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOf(premiumeconomy));
		premiumeconomy.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 	    wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
 	    searchbutton.click();
 	    JavascriptExecutor js=(JavascriptExecutor) driver;
 	   js.executeScript("window.scrollBy(0,50)");
		Assert.assertEquals(premiumeconomy1.isDisplayed(), true,"Test Case 6 failed-Search functionality for premium economy unsuccessful");
		 System.out.println("Test Case 6 Passed-Search functionality for premium economy successful");
		   Reporter.log("Test Case 6 Passed-Search functionality for premium economy successful");
		   
		  
	}
	public void businesssearch(WebDriver driver) throws InterruptedException
	{
		premiumeconomy1.click();
		Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30L))
			    .pollingEvery(Duration.ofSeconds(1))
			    .ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.visibilityOf(business));
		business.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
 	    wait.until(ExpectedConditions.elementToBeClickable(searchbutton));
 	    searchbutton.click();
 	    JavascriptExecutor js=(JavascriptExecutor) driver;
 	   js.executeScript("window.scrollBy(0,50)");
		Assert.assertEquals(business1.isDisplayed(), true,"Test Case 6 failed-Search functionality for Business class unsuccessful");
		 System.out.println("Test Case 6 Passed-Search functionality for Business class successful");
		   Reporter.log("Test Case 6 Passed-Search functionality for Business class successful");
		  
	}
	public void multiplePassenger(WebDriver driver) throws AWTException, InterruptedException
	{
		onewayradiobutton.click();
		search1.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElements(cityauto));
		
		WebElement w1=cityauto.get(2);
		w1.click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchText")));
	    startsearch.click();
	    WebElement w2=cityauto.get(3);
	    w2.click();
	    
	   // forwardarrow.click();
	   /* WebElement date=traveldate.get(10);
	    String datenum=date.getText();
	    System.out.println(datenum);
	    date.click();*/
	    
	    //WebElement people=peoplenum.get(0);
	    //people.click();
	    //oneadulttraveller.click();
traveldate1.click();

    traveller.click();
    twoadults.click();
   
	    Actions a1=new Actions(driver);
	    //a1.doubleClick(adult).perform();
	    Robot r1=new Robot();
	    /*Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_ENTER);
	    r1.keyPress(KeyEvent.VK_ENTER);*/
	    Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
	    	    .withTimeout(Duration.ofSeconds(30L))
	    	    .pollingEvery(Duration.ofSeconds(1))
	    	    .ignoring(NoSuchElementException.class);
	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='_7e149b6e  edfe9d73'])[2]")));
	 nochildrentraveller.click();
	  /* a1.doubleClick(children).perform();
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_TAB);
	    Thread.sleep(500);
	    r1.keyPress(KeyEvent.VK_ENTER);*/
	    
	   // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='_7e149b6e  edfe9d73'])[3]"))); 
	    noinfanttraveller.click(); 
		
	}
	public void domesticRoundTrip(WebDriver driver) throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//i[@class='_4b539ab8'])[2]")));
		roundtripradiobutton.click();
		
		search1.click();
		WebElement w1=cityauto.get(0);
		w1.click();
		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchText")));
	    startsearch.click();
	    WebElement w2=cityauto.get(1);
	    w2.click();
	    
	    /*int count=dates.size();
	    for(int i=0;i<100;i++)
	    {
	    	WebElement date=dates.get(i);
	    	String text=date.getText();
	    	System.out.println(text);
	    }*/
	 
	    
	    WebElement date=traveldate.get(5);
	    String datenum=date.getText();
	    System.out.println(datenum);
	    date.click();
	    
	  /*  roundtripdate.click();
	    //roundtripdate.click();
	    //closeroundtripdate.click();
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//div[@class='_4e0ac60f  '])[2]")));
	    Wait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
	    .withTimeout(Duration.ofSeconds(30L))
	    .pollingEvery(Duration.ofSeconds(1))
	    .ignoring(NoSuchElementException.class);*/
			Thread.sleep(5000);
	    WebElement date1=datetocomeback.get(40);
	    String datenum1=date1.getText();
	    System.out.println(datenum1);
	    date1.click();
	    
	   // WebElement people=peoplenum.get(0);
	    //people.click();
	   /* oneadulttraveller.click();
	    nochildrentraveller.click();
	    noinfanttraveller.click();   */
	}
	
	public Amz_flight_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	

}
