package go_with_the_flow;

public class Day_8_Logical_operator_And_Or_Not {

	public static void main(String[] args) {
		
		int age=19;
		char gender='M';
		
		if(age>=18 && gender=='M')
		{
		System.out.println("Full Ticket");	
		}
		if(age>=18 || gender=='F')
		{
			System.out.println("Statement 2");
		}
		if(!(age>=18 || gender=='F'))
		{
			System.out.println("Statement 3");
		}
		if(!(age>=18 && gender=='M'))
		{
		System.out.println("Full Ticket");	
		}
	}
}
