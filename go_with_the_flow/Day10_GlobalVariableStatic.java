package go_with_the_flow;

public class Day10_GlobalVariableStatic {

	static double pi=3.14;//global
	static int no_of_days;//default value
	
	public static void main(String[] args) {
		no_of_days=365;
		System.out.println(no_of_days);
int r=7;//local
double area=pi*r*r;
System.out.println(area);
	}

}
