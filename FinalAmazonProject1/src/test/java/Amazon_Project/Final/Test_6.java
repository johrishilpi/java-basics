package Amazon_Project.Final;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class Test_6 extends Launch_Quit
{
	@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
	public void categoryPriceRange() throws InterruptedException, AWTException
	{
		Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
		searchresult.searchProduct();
		searchresult.usingCategoryFilter(driver);
		searchresult.pricerangefilter(driver,"price");
		searchresult.pricefilterresult();
	}

}
