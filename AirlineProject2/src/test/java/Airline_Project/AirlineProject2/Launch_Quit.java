package Airline_Project.AirlineProject2;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

@Listeners(Airline_Project.AirlineProject2.Listener_Logic.class)
public class Launch_Quit extends Listener_Logic
{

	@BeforeMethod
	@Parameters("browser")
	public void launch_browser_login(String nameofbrowser) throws EncryptedDocumentException, IOException, InterruptedException
	{
		if(nameofbrowser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		if(nameofbrowser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in/flights?ref_=nav_em_sbc_desktop_flights_0_1_1_33");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		}
		
		
		
	}

	@AfterMethod
	public void logout() throws InterruptedException
	{
	   Thread.sleep(5000);
		driver.quit();

	}

}
