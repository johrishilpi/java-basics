package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_registration {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement w1=driver.findElement(By.partialLinkText("Create"));
	w1.click();
	Thread.sleep(2000);
	WebElement w2=driver.findElement(By.name("firstname"));
	w2.sendKeys("Sanjana");
	WebElement w3=driver.findElement(By.name("lastname"));
	w3.sendKeys("Srivastava");
	WebElement w4=driver.findElement(By.name("reg_email__"));
	w4.sendKeys("Sanjana@gmail.com");
	WebElement w5=driver.findElement(By.name("reg_passwd__"));
	w5.sendKeys("Sanjana123");
	}

}
