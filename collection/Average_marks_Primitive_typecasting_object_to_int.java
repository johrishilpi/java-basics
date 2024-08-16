package collection;

import java.util.ArrayList;

public class Average_marks_Primitive_typecasting_object_to_int {

	public static void main(String[] args) {
    ArrayList a1= new ArrayList();
    a1.add(99.9);
    a1.add(90.0);
    a1.add(78.9);
    a1.add(86.0);
    a1.add(82.8);
    a1.add(86.0);
    a1.add(98.0);
 //System.out.println(a1.get(0)+a1.get(1));// object cannot be added with object
   double y=0.0;
   for(int i=0;i<a1.size();i++)
    {
    	y=y+(double) a1.get(i);
   }
   System.out.println("The sum of the numbers in the list is: "+ y);
   double d= (double)y;
   double n=(double)a1.size();
   double avg=d/n;
   double avg1=avg*100;
   double avg2=Math.round(avg1);
   double avg3=avg2/100;
		   
   System.out.println("The average of the numbers in the list is: "+ avg3);

	}

}
