package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login_abs_xpath {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("http://www.facebook.com");
	    WebElement w1=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input"));
	    w1.sendKeys("shilpi@yahoo.com");
	    WebElement w2=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/div)[2]/div/input"));
	    w2.sendKeys("aallljdkjksd");
	    /*WebElement w3=driver.findElement(By.partialLinkText("Log"));
	    Thread.sleep(2000);
	    w3.click();*/

	}

}
