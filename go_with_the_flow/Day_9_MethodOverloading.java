package go_with_the_flow;

public class Day_9_MethodOverloading {

	static void add()
	{
		System.out.println("1");
	}
	static void add(int a,boolean b)
	{
		System.out.println("2");
	}
	static void add(int c,double a)
	{
		System.out.println("3");
	}
	static void add(double a, int b)
	{
		System.out.println("4");
	}
	static void add(int a,double b,String name)
	{
		System.out.println("5");
	}
	
	static void add(int a, int b)
	{
		System.out.println("6");
	
	}
	
	static void add(boolean a, int b)
	{
		System.out.println("6");
	
	}
	static void add(char a)
	{
		System.out.println("71");
	
	}
	static void add(char a,char b)
	{
		System.out.println("90");
	
	}
	static void add(char a,int b,int c,int d,int e)
	{
		System.out.println("9");
	}
	void add(int a,int b,int c)
	{
		a=7;//updating the value of a variable
	    b=2;
	    c=1;
				
		int sum=a+b+c;
		System.out.println(sum);
				
	}
	
	
	public static void main(String[] args) {
	add('A','M');
	add('j');
	add();
	add(11,9.8999);
	
	Day_9_MethodOverloading d1=new Day_9_MethodOverloading();
	d1.add(55, 98, 87);
	add(9,8.9,"SJ");
}
}
