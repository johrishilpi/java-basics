package go_with_the_flow;

public class Fibonacci {

	public static void main(String[] args) 
	{
int firstnumber=0;
int secondnumber=1;

for (int i=1;i<=10;i++)
{
	System.out.print(firstnumber+" , ");
	int nextnumber=firstnumber+secondnumber;
    firstnumber=secondnumber;
    secondnumber=nextnumber;
	
}

	}

}
