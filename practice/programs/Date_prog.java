package practice.programs;
import java.util.Date;
public class Date_prog {

	public static void main(String[] args) {
    Date d1=new Date();
    System.out.println(d1);
    System.out.println(d1.getTime());
   
    long l1=d1.getTime()+(1000*60*60*24*2);
    Date d2=new Date(l1);
     System.out.println("Future date is : "+d2);
     long l2=d1.getTime()-(1000*60*60*24*2);
     Date d3=new Date(l2);
     System.out.println("The past date is : "+ d3 );
    

	}

}
