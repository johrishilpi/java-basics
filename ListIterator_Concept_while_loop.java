package collection;
import java.util.*;
public class ListIterator_Concept_while_loop {

public static void main(String[] args)
{
	ArrayList a1= new 	ArrayList();
	a1.add("Ram");
	a1.add("Sita");
	a1.add("Laxman");
	a1.add("Shilpi");
	a1.add(28);
	a1.add(23);
	a1.add(21);
	a1.add(24);
	a1.add("Manish");
	a1.add(3);
	a1.add("Ashwini");
	a1.add("Rama");
	a1.add("Sanjivani");
	
	ListIterator i2=a1.listIterator();
	int f=0;
	int g=0;
	while(i2.hasNext())
	{
			
	String d=i2.next().toString();
	char [] c=d.toCharArray();
	boolean b=Character.isDigit(c[0]);
	
	if(b==true)
	{
		System.out.println(d);
		g=g+(int)a1.get(f);
		
	}
	f++;

	}
	System.out.println("The sum of the numbers is :"+g);
	ArrayList a2= new ArrayList();
	while(i2.hasPrevious())
	{
			
	String d=i2.previous().toString();
	char [] c=d.toCharArray();
	boolean b=Character.isAlphabetic(c[0]);
	
	if(b==true)
	{
		a2.add(d);

	}

	}
	Collections.sort(a2);
	System.out.println(a2);
	}

}
