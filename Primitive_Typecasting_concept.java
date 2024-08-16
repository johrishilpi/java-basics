package collection;

public class Primitive_Typecasting_concept {

	public static void main(String[] args) {
		int a=50;
		double wt=a;
		System.out.println(a);
		System.out.println(wt);
		
		double newage=26;// int to double-widening-implicit
		 System.out.println(newage);
		
		double age=(double) 26;// int to double-widening-explicit
		 System.out.println(age);
//Widening can be done implicitly or explicitly
//But Narrowing can be done only explicitly
		 
		 
		
		

	}

}
