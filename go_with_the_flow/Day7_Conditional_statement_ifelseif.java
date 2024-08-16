package go_with_the_flow;

public class Day7_Conditional_statement_ifelseif {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		if(a==b)//false
		{
			System.out.println("if will execute");
		}
		else if(a==19)//false
		{
			System.out.println("else if 1 will execute");
		}
		else if(a==20)
		{
			System.out.println("else if 2 will execute");
		}
		else
		{
			System.out.println("else will execute");	
		}
	}

}
