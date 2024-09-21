package Project1.seleniumMaven;

import org.testng.annotations.Test;

public class TestCase5 extends Launch_Quit
{
	@Test
	public void registration() throws InterruptedException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage newcustomerregister= new Amz_LoginPage(driver);
		newcustomerregister.registration();
		
		Amz_RegistrationPage register=new Amz_RegistrationPage(driver);
		register.firstLastName();
		register.MobileNumber();
		register.passwordforregisteration();
		register.verifymobilenumberbutton();
		
	}
}
