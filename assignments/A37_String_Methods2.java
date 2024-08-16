
package assignments;

public class A37_String_Methods2 {

	public static void main(String[] args) {
	   String name="Shilpi Johri";
	   String emp="";
	   String emp1="   ";
	   System.out.println(name.isEmpty());
	   System.out.println(emp.isEmpty());
	   System.out.println(emp1.isEmpty());
	   System.out.println(emp.isBlank());
	   System.out.println(emp1.isBlank());
	   System.out.println(name.indexOf('h'));
	   System.out.println(name.lastIndexOf('h'));
	   System.out.println(name.replace('i', 'e'));
	   System.out.println(name.replaceAll("Shilpi","Vandana"));
	   System.out.println(name.replaceAll(" ", ""));
	   String sch="school123";
	   System.out.println(sch.replaceAll("[a-z]", ""));
	   System.out.println(sch.replaceAll("[0-9]",""));
	   String myschool="St. Mary's Convent";
	   System.out.println(myschool.replaceAll("[A-Z]", ""));
	   System.out.println(name.substring(7,9));
	   
	  
	   
			   
		

	}

}
