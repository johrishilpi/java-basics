package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_registration {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement login=driver.findElement(By.partialLinkText("CONTINUE"));
		login.click();
		Thread.sleep(2000);
		WebElement un=driver.findElement(By.id("username"));
		un.sendKeys("Shilpi");
		WebElement pw=driver.findElement(By.id("label2"));
		pw.sendKeys("vbsnkhd123");
	}

}
