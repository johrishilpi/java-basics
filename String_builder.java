package collection;

public class String_builder {

	public static void main(String[] args) {
	StringBuilder s1=new StringBuilder("Shilpi");
	s1.append("shi");
	System.out.println(s1);
	int a=s1.indexOf("p");
	System.out.println(a);
	
	s1.delete(0, 2);
	System.out.println(s1);
	s1.ensureCapacity(8);
	
	System.out.println(s1);
	String s2="Shilpi";
	s2.contains("Shilpi");
	System.out.println(s2.contains("Shilpi"));
	s2.substring(2);
	System.out.println(s2.substring(2));
	System.out.println(s2.trim());
	System.out.println(s2.matches("(.*)i"));
	
	
	
	}

}
