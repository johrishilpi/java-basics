package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_try {

	public static void main(String[] args) {
		Set a1= new HashSet();
		a1.add("hello");
		a1.add('c');
		a1.add(3.4f);
		a1.add(true);
		a1.add(null);
		a1.add(3.55);
		a1.add("Hiii");
		System.out.println(a1);
		System.out.println(a1.toString());
		Object a2[]=a1.toArray();
		//Object a2[]= a1.toArray();
		System.out.println("The list of array elements are:");
		for(int i=0;i<=a2.length-1;i++)
		{
			System.out.println(a2[i]);
		}
		}
	

	}


