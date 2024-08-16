package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Userdefined_Array {

	public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	System.out.println("Enter the number of students in the class:");
	int n=s1.nextInt();
	String [] name= new String[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Name of Student "+(i+1));
		name[i]=s1.next();
	}
System.out.println(Arrays.toString(name));
	}

}
