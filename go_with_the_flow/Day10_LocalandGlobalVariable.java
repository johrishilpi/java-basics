package go_with_the_flow;

public class Day10_LocalandGlobalVariable //banglore
{

	static void add()//area 1
{
	int a=100;// local variable
}
void subtract()//area 2
{
	int b=200;// local variable
}
void multiple(int no1,int no2)//no1 and no2 are local variables
{
	
}

	
	public static void main(String[] args)//area 3
	{
	
		int c=100;// local variable
		System.out.println(c);
}
}
