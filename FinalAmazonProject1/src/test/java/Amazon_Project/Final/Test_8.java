package Amazon_Project.Final;

import java.awt.AWTException;

import org.testng.annotations.Test;

public class Test_8 extends Launch_Quit
{
@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
public void productpagedisplay() throws InterruptedException, AWTException
{
	Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
	searchresult.searchProduct();
	searchresult.sortLowtoHigh(driver);
	searchresult.sortHightolLow(driver);

}
}
