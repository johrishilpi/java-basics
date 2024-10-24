package Amazon_Project.Final;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
@Listeners(Amazon_Project.Final.Listener_Logic.class)
public class Launch_Quit extends Listener_Logic
{
	
	@BeforeMethod
	@Parameters("browser")
	public void launch_browser_login(String browser) throws EncryptedDocumentException, IOException, InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();	
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}	
	
	}
	

	@AfterMethod
	public void logout() throws InterruptedException
	{

	 Thread.sleep(5000);
     driver.quit();

	}

}
