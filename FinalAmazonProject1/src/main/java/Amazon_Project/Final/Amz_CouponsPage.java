package Amazon_Project.Final;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_CouponsPage extends DDT_File
{
@FindBy(xpath="//a/p")
List<WebElement> couponproduct;

@FindBy(xpath="//span[@id='dealsx_atc_btn']")
WebElement addtocartbutton;

@FindBy(xpath="//a[@title='Go to Cart']")
WebElement gotocartbutton;

@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
WebElement proceed;

@FindBy(xpath="//span[.=' Lightning Deal ']")
WebElement lightenDeal;

@FindBy(css="input[id^='checkbox']")
WebElement coupon;

public void applycouponcode(WebDriver driver) throws EncryptedDocumentException, IOException, InterruptedException, AWTException
{
	WebElement product=couponproduct.get(0);
	product.click();
	Set<String> s1= driver.getWindowHandles();
	System.out.println(s1);
	Actions a1=new Actions(driver);
	a1.moveToElement(coupon).perform();
	a1.click().perform();
	Assert.assertEquals(driver.getTitle(),"Amazon Sign In","Test Case 13 Failed-Coupon click unsuccessful");
	System.out.println("Test Case 13 passed-Coupon click successful");
	Reporter.log("Test Case 13 passed-Coupon click successful");
	
	
	/* for(int i=0;i<coupon.size();i++) 
	 {
		 WebElement procoupon=coupon.get(i);
		  String couponatt=procoupon.getAttribute("id");
		  System.out.println(couponatt);
	 }*/
	//Thread.sleep(2000);
	/*Point p1=coupon.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	Robot r1=new Robot();
	r1.mouseMove(x, y);*/
	
	//addtocartbutton.click();
	//wait.until(ExpectedConditions.elementToBeClickable(gotocartbutton));
	//gotocartbutton.click();
	//wait.until(ExpectedConditions.elementToBeClickable(proceed));
	//proceed.click();
	/*if(lightenDeal.isDisplayed()==true)
	{
		
	}*/
}


public Amz_CouponsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
