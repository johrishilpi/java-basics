package Project1.seleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_ShoppingListPage 
{
	//1
	@FindBy(xpath="//a[@class='a-button-text a-text-center']")
	WebElement addtocart;
	
	@FindBy(xpath="//a[.='View Cart']")
	WebElement viewcart;
	
	@FindBy(xpath="//span[.='Qty:']")
	WebElement quantity;
	
	@FindBy(xpath="//a[@id='quantity_1']")
	WebElement quantity1;
	
	//2
	
	public void AddToCartButton()
	{
		addtocart.click();
	}
	public void viewcartbutton()
	{
		viewcart.click();
	}
	public void changequantity() throws InterruptedException
	{
		quantity.click();
		Thread.sleep(3000);
		quantity1.click();
		}
	

	
	
	//3
	public Amz_ShoppingListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
