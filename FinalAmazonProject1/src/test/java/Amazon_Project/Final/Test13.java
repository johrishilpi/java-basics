package Amazon_Project.Final;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test13 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void selectCoupon() throws InterruptedException, AWTException, EncryptedDocumentException, IOException
	{
		driver.get("https://www.amazon.in/deals?bubble-id=deals-collection-coupons&ref=vp_c_A1MIATEOOKJR8_tcs&discounts-widget=%2522%257B%255C%2522state%255C%2522%253A%257B%255C%2522refinementFilters%255C%2522%253A%257B%257D%257D%252C%255C%2522version%255C%2522%253A1%257D%2522");
	
		Amz_CouponsPage coupon=new Amz_CouponsPage(driver);
		coupon.applycouponcode(driver);
		
	}

}
