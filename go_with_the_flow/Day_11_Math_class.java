package go_with_the_flow;

public class Day_11_Math_class// Manish class
{
	public static void main(String[] args) 
	{

		
		
	System.out.println(Math.addExact(9980, 20));//abhi
		Math.addExact(0, 0);//classname.methodname
		System.out.println(Math.addExact(67, 53));//1)addExact(int x,int y)
		long a=299999999;
		long b=189999999;

		
		final double pi=Math.PI;
		int r=10;
		double area=pi*r*r;
		System.out.println(area);
				
				
		System.out.println(Math.addExact(a, b));//2)addExact(long x,long y) In case of
		//long long use variables with long datatypes instead of direct values in brackets
		//otherwise it changes to int int and gives error if the value is too big
		System.out.println(Math.subtractExact(890, 788));//3)subtractExact(int x,int y)
		System.out.println(Math.subtractExact(a, b));//4)subtractExact(long x,long y)
		//changing automatically to int int depending on the value of literals
		System.out.println(Math.multiplyExact(3, 4));//5)multiplyExact(int x,int y)
		System.out.println(Math.multiplyExact(a, 2));//6)multiplyExact(long x,int y)
		System.out.println(Math.multiplyExact(a, b));//7)multiplyExact(long x,long y)
		System.out.println(Math.max(2.3455, 3.8999));//8)max(double x,double y)
		System.out.println(Math.max(3.4f, 4.5f));//9)max(float x,float y)
		//If you really want to use float add an f at the end otherwise it changes to
		//double double. I feel double double is actually better as it has more scope than
		//float
		System.out.println(Math.max(67, 89));//10)max(int x,int y)
		System.out.println(Math.max(a, b));//11)max(long x,long y)
		System.out.println(Math.min(1.23444, 1.233336));//12)min(double a,double b)
		System.out.println(Math.min(2.34f, 3.23f));//13)min(float a,float b)
		System.out.println(Math.min(2333333, 243993993));//14)min(int a,int b)
		System.out.println(Math.min(a, b));//15)min(long a,long b)
		System.out.println(Math.sqrt(625.89));//16)Math.sqrt(double a)
		System.out.println(Math.abs(-34.8989899));//17) Math.abs(double a)-give the 
		//absolute value of a number
		System.out.println(Math.abs(-78888.90f));//18)Math.abs(float a)
		System.out.println(Math.abs(-34000));//19)Math.abs(int a)
		System.out.println(Math.abs(a));//20)Math.abs(long a)
		System.out.println(Math.random());//21) Math.random(double a).My math random
		//is amazingly giving 16 values after decimal while sir's gives 17 after decimal
		
		
		
		
		
	}

}
//Manish class
//Abhi.methodname

//Abhi class
//static method of Abhi