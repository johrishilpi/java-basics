package collection;
import java.util.*;
public class Arraylist_constructors {

	public static void main(String[] args) {
    ArrayList a1=new ArrayList();//Constructor 1-initial capacity 10 by default
    a1.add("Ram");//but growable and resizable.Does not give any error if we 
    a1.add("Sita");//increase the number of items
    a1.add("Laxman");
    System.out.println(a1);
    ArrayList a2=new ArrayList(4);//Constructor 2-initial capacity is specified as 4
    a2.add("Reeta");//but growable and resizable.Does not give any error if we 
    a2.add("Mita");//increase the number of items
    a2.add("Lovely");
    a2.add("Mita");
    a2.add("Lovely");
    a2.add("Ram");
    a2.add("Sita");
    a2.add("Laxman");
    System.out.println(a2);
    ArrayList a3=new ArrayList(a2);//Constructor 3 with collection as the parameter
    System.out.println(a3);//This constructor has all the items from a2
    a3.add("Sanjana");//you can add more items
    System.out.println(a3);
	}

}
