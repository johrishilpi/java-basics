package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_queue {

	public static void main(String[] args) {
	PriorityQueue p1=new PriorityQueue();
	p1.add("shilpi");
	p1.add("sanjivani");
	p1.add("ashwini");
	p1.add("rama");
	p1.add("laxman");
	System.out.println(p1);
	PriorityQueue p2=new PriorityQueue();
	p2.addAll(p1);
	p2.add("Daivik");
	p2.add("Devanshi");
	System.out.println(p2);
	System.out.println(p2.containsAll(p1));
	System.out.println(p1.containsAll(p2));
	p1.clear();
	System.out.println(p1);
	Iterator i1=p2.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
		
		
	}
	i1.remove();
System.out.println(p2);

	}

}
