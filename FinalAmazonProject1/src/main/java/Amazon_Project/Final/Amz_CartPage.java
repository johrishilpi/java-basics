package Amazon_Project.Final;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Amz_CartPage
{
	@FindBy(xpath="//a[@id='nav-cart']")
	WebElement cart;
	
	@FindBy(id="nav-cart-count")
	WebElement cartcount;
	
	@FindBy(xpath="(//h4)[1]")
	WebElement productTitleinCart;
	
	@FindBy(css="#quantity")
	WebElement quantity;
	
	@FindBy(xpath="(//div[@name='sc-quantity'])[1]")
	WebElement quantity1;
	
	@FindBy(xpath="(//button[@aria-label='Increase quantity by one'])[1]")
	WebElement addquantity;
	
	@FindBy(xpath="//span[@id='sc-subtotal-label-activecart']")
	WebElement subtotal;
	
	@FindBy(xpath="//input[@value='Delete']")
	List<WebElement> delete;
	
	@FindBy(xpath="//h2[@class='a-size-extra-large a-spacing-mini a-spacing-top-base a-text-normal']")
	WebElement amazonCartEmpty;
	
	@FindBy(xpath="//input[@value='Proceed to checkout']")
	WebElement proceedtocheckoutbutton;
			
	
	String productTitleTextinCart;
	
	
public void cartlinkontop(WebDriver driver)
{
	String countincart=cartcount.getText();
	System.out.println(countincart);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.textToBe(By.id("nav-cart-count"), countincart));
	cart.click();
	driver.navigate().refresh();
	String countincart1=cartcount.getText();
	System.out.println(countincart1);
}

public void producttitleincart(WebDriver driver)
{
	Amz_ProductDescription prodes=new Amz_ProductDescription(driver);
	System.out.println("this is coming from"+prodes.productTitleText);
	productTitleTextinCart=productTitleinCart.getText();
	System.out.println(productTitleTextinCart);
	int titlecount=productTitleTextinCart.length();
	int titlecounthalf=titlecount/2;
	String productTitleTextinCarthalf=productTitleTextinCart.substring(0, titlecounthalf);
	System.out.println(productTitleTextinCarthalf);
	String titlefromproductpage=prodes.productTitleText.substring(0, titlecounthalf);
    System.out.println(titlefromproductpage);
    Assert.assertEquals(productTitleTextinCarthalf,titlefromproductpage,"Test Case 9 Failed-Particular item was not added to cart");
    System.out.println("Test Case 9 Passed- Particular item was successfully added to cart");
	Reporter.log("Test Case 9 Passed- Particular item was successfully added to cart");
}
public void quantityAndDelete(WebDriver driver) throws AWTException, InterruptedException
{
	String qtybefore=subtotal.getText();
	System.out.println("The quantity before was: "+qtybefore);
	int length1=qtybefore.length();
	String quantitynumberbefore="";
	for(int i=0;i<length1;i++)// This logic is extracting the number from subtotal
	{
		char c=qtybefore.charAt(i);
		if(Character.isDigit(c)==true)
		{
			quantitynumberbefore=quantitynumberbefore+c;
		}
	}
	int qtynumbefore=Integer.parseInt(quantitynumberbefore);
	System.out.println("The no. before "+qtynumbefore);
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@aria-label='Increase quantity by one'])[1]")));
	/*quantity.sendKeys(Keys.ENTER);
	Robot r1=new Robot();
	Thread.sleep(500);
	r1.keyPress(KeyEvent.VK_DOWN);
	Thread.sleep(500);
	r1.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(500);
	driver.navigate().refresh();
	Thread.sleep(500);*/
	//Actions a1=new Actions(driver);
	//a1.moveToElement(addquantity).perform();
	addquantity.click();
	Thread.sleep(3000);

    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@id='sc-subtotal-label-activecart']")));
	
	String qtynow=subtotal.getText();
	System.out.println("The quantity now is: "+qtynow);
	int length2=qtynow.length();
	String quantitynumberafter="";
	for(int i=0;i<length2;i++)// This logic is extracting the number from subtotal
	{
		char c=qtynow.charAt(i);
		if(Character.isDigit(c)==true)
		{
			quantitynumberafter=quantitynumberafter+c;
		}
	}
	int qtynumafter=Integer.parseInt(quantitynumberafter);
	System.out.println("The no. after "+qtynumafter);
	if(qtynumafter>qtynumbefore)
	{
		Assert.assertTrue(true,"Test Case 10 Failed-Qty change unsuccessful");
		System.out.println("Test Case 10 Passed-Qty change Successful");
		Reporter.log("Test Case 10 Passed-Qty change Successful");
	}
	else
	{
		System.out.println("Test Case failed");
		
	}
   Thread.sleep(2000);
	int countDelete=delete.size();
   System.out.println(countDelete);
   for(int i=0;i<countDelete;i++)
   {
	   WebElement deleteIt=delete.get(i);
	   Thread.sleep(1000);
	   deleteIt.click();
   }
	   String emptycarttext=amazonCartEmpty.getText();
	   System.out.println(emptycarttext);
	   Assert.assertEquals(emptycarttext,"Your Amazon Cart is empty.","Test Case 10 Failed-Deletion of product from cart was unsuccessful");
	   System.out.println("Test Case 10 Passed-Deletion of product from cart was successful");
	   Reporter.log("Test Case 10 Passed-Deletion of product from cart was successful");
   }
   public void proceedtocheckout()
   {
	   proceedtocheckoutbutton.click();
   }


	public Amz_CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
