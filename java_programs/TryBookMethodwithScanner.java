package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class TryBookMethodwithScanner {

	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter 3 Numbers");
	int [] a= {s1.nextInt(),s1.nextInt(),s1.nextInt()};
	System.out.println(Arrays.toString(a));
	

	}

}
