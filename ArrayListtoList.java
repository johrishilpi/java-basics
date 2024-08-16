package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListtoList 
{
	public static void main(String[] args) 
	{
		System.out.println("Understanding List");
				List l1		=new ArrayList();
				//upcasting 
				l1.add("12");
				l1.add("flower");
				l1.add('I');
	/*			l1.add("Need");
				l1.add(9.097);
				l1.add("flower");
				l1.add(null);
				l1.add(null);*/
			//	System.out.println(l1);
				Iterator i1=			l1.iterator();
				while(i1.hasNext())
				{
					System.out.println(i1.next());
				}
				ListIterator i3=			l1.listIterator();
				while(i3.hasNext())
				{
					System.out.println(i3.next());
				}
				while(i3.hasPrevious())
				{
					System.out.println(i3.previous());
				}
		
			System.out.println("Understanding Set");
			Set s1=			new HashSet();
			s1.add("12");
			s1.add("flower");
			s1.add('I');
	/*		s1.add("Need");
			s1.add(9.097);
			s1.add("flower");
			s1.add(null);
			s1.add(null);*/
			System.out.println(s1);	
			Iterator i2=			s1.iterator();
			while(i2.hasNext())
			{
				System.out.println(i2.next());
			}
		
			
	}

}
