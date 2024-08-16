package fibonacci.inheritance;
import java.util.Scanner;
public class Super_Fibonacci {

	static void fib()
	{
		System.out.println("How many numbers in the Fibonacci series you want to generate?");
		Scanner n1= new Scanner(System.in);
		int usernum=n1.nextInt();
		long firstnum=0;
		long secondnum=1;
		
		for(int i=1;i<=usernum;i++)
		{
			System.out.print(firstnum+" , ");
			long nextnum=firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;
			}
		
		
		
		
	}
	
	
	
}
