package collection;

import java.util.ArrayList;

public class Arraylist_Add_methods {

	public static void main(String[] args) {
    ArrayList a1=new ArrayList();
    a1.add("Ram");
    a1.add("Sita");
    a1.add("Laxman");
    System.out.println(a1);
    a1.add(1, "Hanuman");
    System.out.println(a1);
    ArrayList a2=new ArrayList();
    a2.addAll(a1);
    a2.add("Bharat");
    a2.add("Shatrughan");
    System.out.println(a2);
    ArrayList a3=new ArrayList();
    a3.add("Shilpi");
    a3.add("Vineet");
    a3.add("Vandana");
    a3.addAll(1, a2);
    System.out.println(a3);
	}

}
