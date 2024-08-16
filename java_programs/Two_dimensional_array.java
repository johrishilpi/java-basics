package java_programs;

import java.util.Arrays;

public class Two_dimensional_array {

	public static void main(String[] args) {
   int [][] a1=new int[3][2];//3  rows 2 columns
   a1[0][0]=5;
   a1[0][1]=25;
   a1[1][0]=6;
   a1[1][1]=36;
   a1[2][0]=7;
   a1[2][1]=49;
   
  
   for(int i=0;i<3;i++)
   { for(int j=0;j<2;j++)
   {
  System.out.print(a1[i][j]+" ");
   }
   System.out.println();
	}

}
}
