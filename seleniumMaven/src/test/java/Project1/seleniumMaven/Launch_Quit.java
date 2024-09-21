package Project1.seleniumMaven;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{WebDriver driver;
@BeforeMethod
public void launch_browser_login() throws EncryptedDocumentException, IOException, InterruptedException
{
	driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

@AfterMethod
public void logout() throws InterruptedException
{

//Thread.sleep(10000);
//driver.quit();

}

}
