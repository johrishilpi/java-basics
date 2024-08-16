package java_programs;

public class String_Buffer {

	public static void main(String[] args) {
	String a="Shilpi";
	String b=a.concat(" Johri");
	System.out.println(a);
	System.out.println(b);
	StringBuffer s1=new StringBuffer("Shilpi");
	StringBuffer s2=s1.append(" Johri");
	System.out.println(s1);
	System.out.println(s2);
	StringBuffer s3=s1.reverse();
	System.out.println(s3);
	StringBuffer s4= s1.deleteCharAt(3);
	System.out.println(s4);
	
	

	}

}
