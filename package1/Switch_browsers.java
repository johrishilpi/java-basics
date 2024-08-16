package package1;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Switch_browsers {

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter 1 to launch google in Chrome");
		System.out.println("Enter 2 to launch facebook in Edge");
		System.out.println("Enter 3 to launch target in Chrome");
		System.out.println("Enter 4 to launch grotechminds in Edge");
		int a=s1.nextInt();
		
	switch(a)
	{case 1:
	    ChromeDriver c1= new ChromeDriver();
		c1.get("https://www.google.com");
		c1.manage().window().maximize();
		break;
	case 2:	
		EdgeDriver e1=new EdgeDriver();
		e1.get("https://www.facebook.com");
	    e1.manage().window().maximize();
	    break;
	case 3:    
		ChromeDriver c2= new ChromeDriver();
		c2.get("https://www.target.com");
		c2.manage().window().maximize();
		break; 
	case 4:
		EdgeDriver e2=new EdgeDriver();
		e2.get("https://grotechminds.com");
	    e2.manage().window().maximize();
	    break;
	 default: 
		 System.out.println("Please enter 1-4");   
	   
	    	
	    }
	   
	    
	}

}

