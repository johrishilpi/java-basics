package learnjava;

public class Mathclassprog {

	public static void main(String[] args) {

		addition();
		subtraction();
		multiply();
		divide();
		mod();
		
	

	}
	static void addition()
	{
		int a=200;
		int b=600;
		int sum=a+b;
		System.out.println(sum);	
	}
	static void subtraction()
	{
		int a=200;
		int b=500;
		int subtraction=b-a;
		System.out.println(subtraction);	
	}
	static void multiply()
	{
		int a=200;
		int b=500;
		int mul=a*b;
		System.out.println(mul);	
	}
	static void divide()
	{
		float a=3f;
		float b=100f;
		float div=b/a;
		System.out.println(div);	
	}
	static void mod()
	{
		int a=200;
		int b=609;
		int mod=b%a;
		System.out.println(mod);	
	}	
	
	
	
}
