package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.Vector;

public class Check_collection {

	public static void main(String[] args) {
	
ArrayList a1=new ArrayList();
a1.add("ram");
a1.add("tom");
a1.add("tina");
a1.add("ram");

System.out.println(a1);
Collections.sort(a1);
System.out.println(a1);
Collections.reverse(a1);
System.out.println(a1);

LinkedList l1=new LinkedList();
l1.add("ram");
l1.add("tom");
l1.add("asha");
l1.add("bina");


System.out.println(l1);
Collections.sort(l1);
System.out.println(l1);
Vector v1=new Vector();
v1.add("amit");
v1.add("sumit");
v1.add("asha");
v1.add("bina");
v1.add("cathy");
v1.add("disha");
v1.add("eena");


/*System.out.println(v1);
Collections.sort(v1);
System.out.println(v1); 
PriorityQueue p1=new PriorityQueue();
p1.add(67);
p1.add(78);
p1.add(5);
p1.add(5);
p1.add(8);
p1.add(78);
p1.add(2);
p1.add(3);
p1.add(67);

p1.add("Shilpi");
p1.add(90);


System.out.println(p1);


System.out.println(p1);

HashSet h1=new HashSet();
h1.add(0);
h1.add(null);
h1.add(6);
h1.add(89);
h1.add(null);
h1.add(9);
h1.add("Shilpi");
h1.add(0);

System.out.println(h1);*/
/*TreeSet t1=new TreeSet();
t1.add("shilpi");
t1.add("ms");
t1.add("n");
t1.add("a");*/

//System.out.println(t1);//
LinkedHashSet ls1=new LinkedHashSet();

ls1.add("shilpi");
ls1.add("ms");
ls1.add("n");
ls1.add("lom");
ls1.add("shi");
ls1.add("ms");
ls1.add("n");
ls1.add("l");
ls1.add("ms");
ls1.add(89);
ls1.add('d');
ls1.add(true);
ls1.add(1.22);

System.out.println(ls1);

	}

}
