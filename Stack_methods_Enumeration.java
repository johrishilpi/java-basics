package assignments;
import java.util.*;
public class Stack_methods_Enumeration {

	public static void main(String[] args) {
	Stack s1=new Stack();
	s1.add("i");
	s1.addElement("SJ");
	s1.addElement("Hanuman");
	s1.push("Ram");
	s1.push("Sita");
	s1.push("Laxman");
	System.out.println(s1);
	System.out.println(s1.peek());
	System.out.println(s1.pop());
	System.out.println(s1);
	Enumeration e1=s1.elements();
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
	
	

	}

}