package Amazon_Project.Final;

import org.testng.annotations.Test;

public class Test15 extends Launch_Quit 
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void cartWithoutlogging() throws InterruptedException
	{
		Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
		searchresult.searchProduct();
		searchresult.searchtheproduct();
		searchresult.addtocartNoLogin(driver);
		
		
		
		
	}
}
