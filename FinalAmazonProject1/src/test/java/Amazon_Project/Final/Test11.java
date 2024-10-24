package Amazon_Project.Final;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Test11 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void checkoutProcess() throws InterruptedException, EncryptedDocumentException, IOException, AWTException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.beforelogin("acc");
		homepage.signin();
		
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.login(driver); 
		
		homepage.searchProduct();
		
		Amz_ProductDescription productdes=new Amz_ProductDescription(driver);
		productdes.ProductPage(driver, "product title");
		productdes.cartbuttonclick(driver, "title");
		
		Amz_CartPage cart= new Amz_CartPage(driver);
		cart.cartlinkontop(driver);	
		cart.proceedtocheckout();
		
		Amz_CheckoutPage checkout=new Amz_CheckoutPage(driver);
		checkout.UseThisAddressButton();
		checkout.selectpaymenttype();  
		checkout.EnterCardDetails(driver);
	}
}
