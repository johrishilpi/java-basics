package collection;
import java.util.*;
public class Upcasting_Hashset_linkedHashset {

	public static void main(String[] args) {
	List a1= new ArrayList();
	a1.add(12);
	a1.add('c');
	a1.add("flower");
	a1.add("aster");
	a1.add("mint");
	a1.add(null);
	a1.add("daffodils");
	a1.add(null);
	a1.add("mint");
	a1.add(null);
	System.out.println(a1);
	Iterator i1=a1.iterator();
	System.out.println("using Iterator for list");
	while(i1.hasNext())
			{
		System.out.println(i1.next());
			}
	ListIterator l1=a1.listIterator();
	System.out.println("using ListIterator hasnext for list forward iteration");
	while (l1.hasNext())
	{
		System.out.println(l1.next());
	}
	System.out.println("using ListIterator hasprevious for list backward iteration");
	while(l1.hasPrevious())
	{
		System.out.println(l1.previous());
	}
	Set h1=new LinkedHashSet();
	h1.add(12);
	h1.add('c');
	h1.add("flower");
	h1.add("aster");
	h1.add("mint");
	h1.add(null);
	h1.add("daffodils");
	h1.add(null);
	h1.add("mint");
	h1.add(null);
	System.out.println(h1);
	
	Set h2=new HashSet();
	h2.add(12);
	h2.add('c');
	h2.add("flower");
	h2.add("aster");
	h2.add("mint");
	h2.add(null);
	h2.add("daffodils");
	h2.add(null);
	h2.add("mint");
	h2.add(null);
	System.out.println(h2);
	Iterator i2=h2.iterator();
	System.out.println("using iteration for set");
	while (i2.hasNext())
	{
		System.out.println(i2.next());
	}
	}

}
