package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch_india2 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	WebElement search= driver.findElement(By.name("q"));
	Thread.sleep(2000);
	search.sendKeys("India Cricket");
	Thread.sleep(2000);
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ARROW_DOWN);
	search.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	search.sendKeys(Keys.ENTER);
	
	
	
	
		

	}

}
