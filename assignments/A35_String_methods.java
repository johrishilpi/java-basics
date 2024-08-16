package assignments;

public class A35_String_methods {

	public static void main(String[] args) 
	{ String name="Shilpi Johri";
	System.out.println(name.length());
	System.out.println(name.toLowerCase());
	System.out.println(name.toUpperCase());
	System.out.println(name.indexOf("J"));
	System.out.println(name.charAt(7));
	String name1="      Vineet Johri      ";
	System.out.println(name1);
	System.out.println(name1.trim());
	String name2="Shilpi johri";
	String name3="Shilpi Johri";
	System.out.println(name2.equals(name3));
	System.out.println(name3.equals(name));
	System.out.println(name2.equalsIgnoreCase(name3));
	System.out.println(name3.equalsIgnoreCase(name1));
	System.out.println(name3.contains("Johri"));
	System.out.println(name2.contains("Johri"));
	System.out.println(name1.contains("Johri"));
	System.out.println(name.substring(7));
	System.out.println(name.substring(5, 9));
	
	
			
	

	}

}
