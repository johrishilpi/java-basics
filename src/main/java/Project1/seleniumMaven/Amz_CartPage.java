package Project1.seleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_CartPage {
	WebDriver driver;
	//1
	@FindBy(name="proceedToRetailCheckout")
	WebElement proceedtocheckout;

			
	//2

	public void proceedToCheckoutButton() throws InterruptedException
	{
		Thread.sleep(3000);
		proceedtocheckout.click();
	}
	

	
	
	public Amz_CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
}
