package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_India_Enter {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.name("q"));
	w1.sendKeys("India");
	Thread.sleep(2000);
	w1.sendKeys(Keys.ENTER);

	
	
	
	
	

	}

}
