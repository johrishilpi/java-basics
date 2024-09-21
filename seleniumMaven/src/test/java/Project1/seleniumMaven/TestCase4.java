package Project1.seleniumMaven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestCase4 extends Launch_Quit
{
	@Test
	public void login_to_amazon_search_wishlist_cart_payment() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Amz_HomePage homepage=new Amz_HomePage(driver);
		homepage.accountandlist(driver);
		homepage.signin();
		
		Amz_LoginPage loginpage=new Amz_LoginPage(driver);
		loginpage.login(driver);
		
		Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
		searchresult.searchtheproduct();
		
		Amz_ProductDescription soap=new Amz_ProductDescription(driver);
		soap.product(driver);
		
		Amz_ShoppingListPage addcart= new Amz_ShoppingListPage(driver);
		addcart.AddToCartButton();
		addcart.viewcartbutton();
		addcart.changequantity();
	
		
	    Amz_CartPage cartpage=new Amz_CartPage(driver);
		cartpage.proceedToCheckoutButton();
	    
	    Amz_CheckoutPage checkout=new Amz_CheckoutPage(driver);
	    /*checkout.EnterCountry();
	    checkout.EnterFullName();
	    checkout.EnterMobile();
	    checkout.EnterPincode();
	    checkout.EnterAddressLine1();
	    checkout.EnterAddressLine2();
	    checkout.EnterLandMark();
	    checkout.EnterCity();
	    checkout.EnterState();
	    checkout.SubmitButton();*/
	   checkout.UseThisAddressButton();
	   checkout.selectpaymenttype();  
	   checkout.EnterCardDetails(driver);
	}
	


}
