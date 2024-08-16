package go_with_the_flow;//NOTE: for now do not use these three data types-byte,short and long

public class Day_6_Math_Operation {
static void add()
{
int no1=30;
double no2=40.90;
double sum=no1+no2;
System.out.println(sum);

}
static void subtract()
{
	int no1=40;
    int no2=20;
    int sub=no1-no2;
    		System.out.println(sub);
}
static void mul()
{
	int no1=3;
    int no2=9;
    int multiply=no1*no2;
    System.out.println(multiply);
			
}
static void div()
{
	int no1=17;
	int no2=2;
	int division=no1/no2;//this will give just the quotient
	System.out.println(division);
}
static void modulus()
{
	int no1=21;
	int no2=20;
	int rem=no1%no2;
	System.out.println(rem);
			
}
static void dec()
{
	double no1=29;
	double no2=2;
	double div=no1/no2;
	System.out.println(div);
			
}
	public static void main(String[] args) {
		add();
		subtract();
		mul();
		div();
		System.out.print("The remainder is ");modulus();
		dec();
	}

}
