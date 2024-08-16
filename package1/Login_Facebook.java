package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Facebook {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.facebook.com");
    WebElement w1=driver.findElement(By.name("email"));
    w1.sendKeys("shilpi@yahoo.com");
    WebElement w2=driver.findElement(By.name("pass"));
    w2.sendKeys("aallljdkjksd");
    WebElement w3=driver.findElement(By.name("login"));
    Thread.sleep(2000);
    w3.click();

	}

}
