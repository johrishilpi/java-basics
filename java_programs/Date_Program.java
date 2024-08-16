package java_programs;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Date_Program 
{
	public static void main(String[] args) {
	Date d1=new Date();
	System.out.println(d1);
	System.out.println(d1.getTime());//epoch time
	String d2=d1.toString();
	String date= d2.substring(8, 10);
	System.out.println("The date is: "+date);
	String month= d2.substring(4, 7);
	System.out.println("The month is: "+month);
	String year=d2.substring(24);
	System.out.println("The year is: "+ year);
	
	System.out.println(date.concat("/").concat(month).concat("/").concat(year));
	System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	long ft=d1.getTime()+(1000*60*60*24*10);
	System.out.println(ft);
	long g=1000*60*60*24*56;
			System.out.println(g);
	Date d3=new Date(ft);
	System.out.println("The future date is: "+d3);
	Date d4=new Date(d1.getTime()-(1000*60*60*24*5));
	System.out.println("The past date is : " + d4);
	LocalDate futureDate=LocalDate.now().plusMonths(2);
	DateTimeFormatter f=DateTimeFormatter.ofPattern(month);
	String d=futureDate.format(f);
	System.out.println(d);
	

	
			

	}

}
