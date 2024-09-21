package Project1.seleniumMaven;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ProductDescription
{
	WebDriver driver;
	//1
	@FindBy(xpath="(//div[@class='a-section a-spacing-base'])[1]")
	WebElement soapselect;

	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;

	@FindBy(xpath="//a[.='View Your List']")
	WebElement viewyourlist;




	//2
	public void product(WebDriver driver) throws InterruptedException
	{
		soapselect.click();
		Thread.sleep(3000);
		Set<String> w1=driver.getWindowHandles();
		System.out.println(w1);
		Iterator<String> i1=w1.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
		wishlist.click();
		Thread.sleep(3000);
		viewyourlist.click();
	   }



	//3
	public Amz_ProductDescription(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}



}
