package Amazon_Project.Final;

import org.testng.annotations.Test;

public class Test_7 extends Launch_Quit
{
@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
public void productpagedisplay() throws InterruptedException
{
	Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
	searchresult.searchProduct();
	
	Amz_ProductDescription productdes=new Amz_ProductDescription(driver);
	productdes.productpage(driver);
}
}
