package java_programs;

import java.util.Scanner;

public class Mathtables {

	public static void main(String[] args) {
   Scanner s1=new Scanner(System.in);
   System.out.println("Enter the number for which you want to generate the table:");
   int number=s1.nextInt();
   System.out.println("How many multiples you want to generate:");
   int mul=s1.nextInt();
   for(int i=0,j=0;j<=mul;i+=number,j++)
   {
	   System.out.println(number+"*"+ j +"="+ i);
   }
   

	}

}
