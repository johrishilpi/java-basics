package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mkt_registration {

	public static void main(String[] args) {
	ChromeDriver c1=new ChromeDriver();
	c1.get("file:///C:/Users/mailt/OneDrive/Documents/learningHTML1.html");
    c1.manage().window().maximize();
    WebElement un=c1.findElement(By.xpath("(//input)[1]"));
    un.sendKeys("SJohri");
    WebElement hint=c1.findElement(By.xpath("(//input)[2]"));
    hint.sendKeys("Allahabad");
    WebElement pw=c1.findElement(By.xpath("(//input)[3]"));
    pw.sendKeys("hsAKJSHj124");
    WebElement fn=c1.findElement(By.xpath("(//input)[4]"));
    fn.sendKeys("Shilpi");
    WebElement boy=c1.findElement(By.xpath("(//input)[7]"));
    boy.click();
    WebElement gender=c1.findElement(By.xpath("(//input)[12]"));
    gender.click();
    WebElement relocate=c1.findElement(By.xpath("(//input)[13]"));
    relocate.click();
    WebElement know=c1.findElement(By.partialLinkText("Click to know"));
    know.click();
	}

}
