package practice.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_iterator {

	public static void main(String[] args) {
	ArrayList a1= new ArrayList();
	a1.add("shilpi");
	a1.add("sj");
	a1.add("sanjivani");
	a1.add("ashwini");
	a1.add("rama");
	Iterator i1=a1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	

	}

}
