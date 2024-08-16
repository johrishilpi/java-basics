package go_with_the_flow;

public class Day10_GlobalVariableNonStatic {

	int no_of_days=365;//non static global variable
	int days=31;//declare and initialize in a single line
	static String name;
	static double s1;
	public static void main(String[] args) {
		Day10_GlobalVariableNonStatic d1=new Day10_GlobalVariableNonStatic();
		
		System.out.println(d1.no_of_days);
d1.no_of_days=366;
System.out.println(d1.no_of_days);
int c;
c=100;// local variable can be declared and initialized in 2 lines 
//but global variable cannot be written like that

System.out.println(name);	
System.out.println(s1);	
	
	}

}
