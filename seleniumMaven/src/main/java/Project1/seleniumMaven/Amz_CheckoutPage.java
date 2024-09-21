package Project1.seleniumMaven;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_CheckoutPage 
{WebDriver driver;
//1
@FindBy(name="address-ui-widgets-countryCode")
WebElement country;

@FindBy(id="address-ui-widgets-enterAddressFullName")
WebElement fullname;

@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
WebElement mobile;

@FindBy(id="address-ui-widgets-enterAddressPostalCode")
WebElement pincode;

@FindBy(id="address-ui-widgets-enterAddressLine1")
WebElement addressline1;

@FindBy(id="address-ui-widgets-enterAddressLine2")
WebElement addressline2;

@FindBy(id="address-ui-widgets-landmark")
WebElement landmark;

@FindBy(id="address-ui-widgets-enterAddressCity")
WebElement city;

@FindBy(id="address-ui-widgets-enterAddressStateOrRegion")
WebElement state;

@FindBy(id="address-ui-widgets-form-submit-button")
WebElement submitbutton;


@FindBy(xpath="//span[@id='orderSummaryPrimaryActionBtn']")
WebElement useaddress;

@FindBy(xpath="//input[@value='SelectableAddCreditCard']")
WebElement creditdebit;

@FindBy(partialLinkText="Enter card details")
WebElement carddetails;

@FindBy(name="ApxSecureIframe")
WebElement paymentframe;

@FindBy(name="addCreditCardNumber")
WebElement cardnumber;

@FindBy(name="ppw-accountHolderName")
WebElement accountholdername;

//@FindBy(name="ppw-expirationDate_month")
//WebElement expirationMonth1;

//@FindBy(name="ppw-expirationDate_year")
//WebElement expirationYear;

//@FindBy(xpath="(//div[@class='a-popover-inner a-lgtbox-vertical-scroll'])/ul/li")
//List<WebElement> expirationMonth;

//@FindBy(xpath="(//div[@class='a-popover-inner a-lgtbox-vertical-scroll'])/ul/li")

@FindBy(xpath="//span[@class='a-dropdown-prompt' and .='01']")
 WebElement expirationMonth;

@FindBy(xpath="//a[@id='pp-Ir2pGb-19_2']")
WebElement month3;
//@FindBy(xpath="//option[@value='3']")
//WebElement month;

@FindBy(xpath="(//span[.='2024'])[1]")
WebElement expirationYear;

@FindBy(xpath="//a[.='2025']")
WebElement year;

@FindBy(name="ppw-widgetEvent:AddCreditCardEvent")
WebElement enterdetailsbutton;

//2
public void EnterCountry()
{
	Select s1= new Select(country);
	s1.selectByVisibleText("India");
	
}
public void EnterFullName()
{
	fullname.sendKeys("Sanjana Srivastava");
	
}

public void EnterMobile()
{
	mobile.sendKeys("9870007896");
	
}
public void EnterPincode()
{
	pincode.sendKeys("211001");
	
}
public void EnterAddressLine1()
{
	addressline1.sendKeys("28 Kutchery Road");
	
}

public void EnterAddressLine2()
{
	addressline2.sendKeys("Mahatma Gandhi Marg");
	
}
public void EnterLandMark()
{
	landmark.sendKeys("Near Laxmi Talkies");
	
}
public void EnterCity()
{
	city.sendKeys("Allhabad");
}
public void EnterState()
{
  Select s2=new Select(state);
  s2.selectByVisibleText("UTTAR PRADESH");
}

public void SubmitButton()
{
	submitbutton.click();
}
public void UseThisAddressButton()
{
	useaddress.click();
}

public void selectpaymenttype() throws InterruptedException
{
	Thread.sleep(5000);
	creditdebit.click();
}
public void EnterCardDetails(WebDriver driver) throws InterruptedException
{
	Thread.sleep(3000);
	carddetails.click();
	Thread.sleep(10);
	driver.switchTo().frame(paymentframe);
	Thread.sleep(3000);
	cardnumber.sendKeys("1234567890");
	accountholdername.clear();
	accountholdername.sendKeys("Sanjana");
	/*Thread.sleep(2000);
	accountholdername.sendKeys(Keys.TAB);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(expirationMonth));
	expirationMonth.click();
	Thread.sleep(3000);
    month3.click();   */ 
    
	/*int countmonth=expirationMonth.size();
	System.out.println(countmonth);
	expirationMonth.get(3).click();*/
	/*expirationMonth.click();
	month.click();
	expirationYear.click();
	year.click();*/
		
	Thread.sleep(3000);
	enterdetailsbutton.click();
	Thread.sleep(5000);
	driver.switchTo().defaultContent();

	
}

public Amz_CheckoutPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



}
