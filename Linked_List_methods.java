package collection;

import java.util.LinkedList;

public class Linked_List_methods {

	public static void main(String[] args) {
	LinkedList <Integer> l1=new LinkedList();
	l1.add(12);
	l1.add(21);
	l1.add(321);
	l1.add(22);
	System.out.println(l1.getFirst());//getting first object
	System.out.println(l1.getLast());//getting last object
	System.out.println(l1.peekFirst());//same as getfirst
	System.out.println(l1.peekLast());//same as getlast
	System.out.println(l1);
	l1.addFirst(67);//add these elements on top of the list or as the first item
	System.out.println(l1);
	l1.addLast(222);//add this object on the last of the array
	System.out.println(l1);
	l1.offerFirst(111);//same as add first
	System.out.println(l1);
	l1.offerLast(1111);//same as addlast
	System.out.println(l1);
   System.out.println("Poll First "+ l1.pollFirst());//same as removeFirst
   System.out.println(l1);
   System.out.println("Poll Last "+ l1.pollLast());//same as removeLast
   System.out.println(l1);
   System.out.println(l1.removeFirst());
   System.out.println(l1);
   System.out.println(l1.removeLast());
   System.out.println(l1);
	}

}
