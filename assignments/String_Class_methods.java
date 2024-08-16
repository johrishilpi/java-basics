package assignments;

public class String_Class_methods {

	public static void main(String[] args) {
   String name="School name is Vidya";
   int len=name.length();
   System.out.println(len);
   System.out.println(name.toLowerCase());
   System.out.println(name.toUpperCase());
   System.out.println(name.indexOf('n'));
   System.out.println(name.charAt(7));
   String myname="        Shilpi Johri        ";
   String country="India";
   String country1="india";
   System.out.println(myname);
   System.out.println(myname.trim());
   System.out.println(country.equals(country1));
   System.out.println(country.equalsIgnoreCase(country1));
   System.out.println(myname.contains("Shilpi"));
   System.out.println(myname.contains("johri"));
   System.out.println(name.substring(7));
   System.out.println(name.substring(7, 11));
   System.out.println(name.substring(12, 14));
   System.out.println(name.substring(15, 20));
   System.out.println(name.substring(15));
   
	}

}
