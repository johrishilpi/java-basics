package Project1.seleniumMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amz_RegistrationPage
{
	WebDriver driver;

	//1
	@FindBy(id="ap_customer_name")
	WebElement customername;

	@FindBy(id="ap_phone_number")
	WebElement phonenumber;

	@FindBy(id="ap_password")
	WebElement registrationpassword;

	@FindBy(xpath="//input[@id='continue']")
	WebElement verifymobile;

	//2
	public void firstLastName()
	{
		customername.sendKeys("Durga Ashtmi");
	}

	public void MobileNumber()
	{
		phonenumber.sendKeys("1234567890");
	}

	public void passwordforregisteration()
	{
		registrationpassword.sendKeys("chinnamastika");
	}
	public void verifymobilenumberbutton()
	{
		verifymobile.click();
	}

	//3
	public Amz_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
}
