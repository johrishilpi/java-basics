package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_India_ClickSearch {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.name("q"));
	w1.sendKeys("India");
	WebElement w2=driver.findElement(By.name("btnK"));
	Thread.sleep(2000);
	w2.click();
	
	
	

	}

}
