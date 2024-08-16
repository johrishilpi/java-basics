package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice_22_july_scanner {

	public static void main(String[] args) {
    int [] roll=new int[3];
    Scanner s1= new Scanner(System.in);
    for(int i=0;i<3;i++)
    {
    	System.out.println("Enter the value of index -> "+i); 
    	roll[i]=s1.nextInt();
    
    }
    System.out.println(Arrays.toString(roll));
    Arrays.sort(roll);
    System.out.println(Arrays.toString(roll));

	}

}
