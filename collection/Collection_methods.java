package collection;

import java.util.ArrayList;

public class Collection_methods {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Shilpi");
		a1.add("Ashwini");
		a1.add("Rama");
		a1.add("Sanjivani");
		System.out.println(a1);
	    ArrayList a2=new ArrayList();
		a2.addAll(a1);
		a2.add("Vandana");
		a2.add("Vineet");
	System.out.println(a2);
		a2.add(2, "Bindu");
		System.out.println(a2);
		a2.addAll(1, a1);

		System.out.println(a2);
		/*a1.clear();*/
		System.out.println(a1.get(3));
		a1.set(3,"SV");
		
		System.out.println(a1); 
		

	}

}
