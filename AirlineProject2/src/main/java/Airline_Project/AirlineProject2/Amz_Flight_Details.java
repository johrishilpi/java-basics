package Airline_Project.AirlineProject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_Flight_Details 
{
	WebDriver driver;
@FindBy(xpath="//h3[.='Apply Offer']")
WebElement applycoupontitle;

@FindBy(xpath="(//button[.='Apply'])[1]")
WebElement coupon;

@FindBy(xpath="(//div[.='Discount Applied'])[1]")
WebElement discountApplied;

public void couponclick(WebDriver driver)
{
	coupon.click();
	boolean b=discountApplied.isDisplayed();
	System.out.println(b);
	
	Assert.assertEquals(discountApplied.isDisplayed(), true, "Test Case 13 failed-Apply Coupon unsuccessful");
	System.out.println("Test Case 13 passed-Apply Coupon successful");
	Reporter.log("Test Case 13 passed-Apply Coupon successful");
}

public Amz_Flight_Details(WebDriver driver)
{
PageFactory.initElements(driver, this);	
}
}
