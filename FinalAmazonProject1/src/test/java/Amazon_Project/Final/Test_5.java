package Amazon_Project.Final;
import org.testng.annotations.Test;


public class Test_5 extends Launch_Quit
{
@Test(retryAnalyzer=Amazon_Project.Final.Retry_Logic.class)
public void searchshoe() throws InterruptedException
{
	Amz_SearchResultPage searchresult=new Amz_SearchResultPage(driver);
	searchresult.searchProduct();
	searchresult.searchtheproduct();
	
}
}
