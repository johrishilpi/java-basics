package Project1.seleniumMaven;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_SearchResultPage 
{
	WebDriver driver;
	//1
	@FindBy(id="twotabsearchtextbox")
	WebElement search;

	public void searchtheproduct() throws InterruptedException
	{

		search.sendKeys("soap");
		search.sendKeys(Keys.ENTER);
	}
	public Amz_SearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
