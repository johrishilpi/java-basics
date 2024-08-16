package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Question {

	public static void main(String[] args) {
		
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
        int a=s1.nextInt();
        System.out.println("Enter width of the rectangle");
		int b=s1.nextInt();
		int [] d=new int[4];
		d[0]=a;
		d[1]=b;
		d[2]=a;
		d[3]=b;
		System.out.println(Arrays.toString(d));
		int j=a*b;
		System.out.println("The area of the rectangle is: "+j);
		
		
	

	}

}
