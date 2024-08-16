package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch 
{ public static void main(String[] args) throws InterruptedException {
 ChromeDriver driver=new ChromeDriver();
 driver.get("https://www.target.com");
 Thread.sleep(2000);
// driver.close();// will only close the parent window
 //driver.quit();//will close the parent and all the child windows
	System.out.println(driver.getWindowHandle());
	System.out.println(driver.getWindowHandles());
	System.out.println(driver.getTitle());
	driver.quit();
}

}
