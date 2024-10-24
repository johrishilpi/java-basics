package Amazon_Project.Final;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_ProductDescription
{
	WebDriver driver;
	//1

	@FindBy(xpath="//h2/a")
	List<WebElement> productsearch;
	
	@FindBy(xpath="(//span[@class='a-price-whole'])[1]")
	WebElement pricedisplay;
	
	@FindBy(xpath="//h3[.=' Product details ']")
	WebElement productdetailsdisplay;
	
	@FindBy(xpath="//h3[.=' About this item ']")
	WebElement aboutthisitem;
	
	@FindBy(xpath="(//a[@id='acrCustomerReviewLink'])[1]")
	WebElement ratingdisplay;
	
	@FindBy(xpath="//span[.='No customer reviews']")
	WebElement noreview;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement wishlist;

	@FindBy(xpath="//a[.='View Your List']")
	WebElement viewyourlist;
	@FindBy(xpath="//h2/a")
	List<WebElement> productsearch1;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//span[@class='a-button a-spacing-mini a-button-span12 a-button-base']")
	WebElement gotocart;
	
	@FindBy(xpath="//span[@id='productTitle']")
	WebElement productTitle;
	
	static String productTitleText;
	
	
	public void ProductPage(WebDriver driver,String productTitleText)
	{
		WebElement w1=productsearch1.get(4);
		w1.click();
		Set<String> s3=driver.getWindowHandles();
		Iterator<String> i1=s3.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		productTitleText=productTitle.getText();
		this.productTitleText=productTitleText;
		System.out.println(productTitleText);
		
	}
	public void cartbuttonclick(WebDriver driver,String productTitleText) throws InterruptedException
	{
		/*String addtocartlink=addtocartbutton.getAttribute("href");
		System.out.println(addtocartlink);
		WebElement addtocartbutton1=driver.findElement(By.cssSelector("[href='"+addtocartlink+"'"));*/
		productTitleText=productTitle.getText();
		this.productTitleText=productTitleText;
		System.out.println(productTitleText);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(addtocartbutton));
		addtocartbutton.click();
		//wait.until(ExpectedConditions.elementToBeClickable(gotocart));
		//gotocart.click();
	    
	}
	

	public void productpage(WebDriver driver) throws InterruptedException
	{
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//h2/a")));
		int countproduct=productsearch.size();
		System.out.println(countproduct);
		WebElement product1=productsearch.get(0);
		product1.click();
		
	    Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> i1=s1.iterator();
		String parentid=i1.next();
		String childid=i1.next();
		driver.switchTo().window(childid);
		
		Assert.assertEquals(pricedisplay.isDisplayed(),true,"Test Case 7 for price display failed");
		Reporter.log("Test Case 7 for price display passed");
		System.out.println("Test Case 7 for price display passed");
		
		Assert.assertEquals(productdetailsdisplay.isDisplayed()||aboutthisitem.isDisplayed(),true,"Test Case 7 for product details display failed");
		Reporter.log("Test Case 7 for product details display or about this item passed");
		System.out.println("Test Case 7 for product details display or about this item passed");

		try
		{
			Assert.assertEquals(ratingdisplay.isDisplayed(),true,"Test Case 7 for customer product rating display failed");
			Reporter.log("Test Case 7 for customer product rating display passed");
			System.out.println("Test Case 7 for customer product rating display passed");
		}
		catch(NoSuchElementException a) 
		{
		Assert.assertEquals(noreview.isDisplayed(), true,"Test Case 7 for customer product rating display failed");
		Reporter.log("Test Case 7 passed- The product does not have customer reviews");
		System.out.println("Test Case 7 passed- The product does not have customer reviews");
		}
		
	   }
	public void wishlist() throws InterruptedException
	{
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
