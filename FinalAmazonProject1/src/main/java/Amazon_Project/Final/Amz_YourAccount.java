package Amazon_Project.Final;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_YourAccount 
{
	@FindBy(linkText="Profile")
	WebElement profile;
	
public void editProfileInfo(WebDriver driver) throws InterruptedException
{
	Point p1=profile.getLocation();
	int x=p1.getX();
	int y=p1.getY();
	System.out.println(x);
	System.out.println(y);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,"+y+")");
	profile.click();
	
}
public Amz_YourAccount(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
}
