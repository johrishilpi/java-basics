package go_with_the_flow;

public class Day9_call_Parametrized_nonstatic_method {

	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	void add(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	void subtract()
	{
		System.out.println("subtracting");
	}
	
	public static void main(String[] args) {
	Day9_call_Parametrized_nonstatic_method d1=new Day9_call_Parametrized_nonstatic_method();
	d1.add(110, 110);
	d1.add(4.32, 100);
	d1.subtract();
}
}
