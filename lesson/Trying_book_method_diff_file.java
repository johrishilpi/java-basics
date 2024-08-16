package lesson;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trying_book_method_diff_file {

	public static void main(String[] args) throws FileNotFoundException {
    new File("Employee info.txt");
    var s1=new Scanner(new java.io.File("Employee info.txt"));
 
   for(int i=0;i<6;i++)
   {
	   System.out.println(s1.nextLine());  
   }
  

	}

}
