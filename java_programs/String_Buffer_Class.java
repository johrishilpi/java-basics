package java_programs;
public class String_Buffer_Class {

	public static void main(String[] args) 
	{
		String s6=new String("Ashwini");
		s6.concat(" kale");
		System.out.println(s6);
		System.out.println(s6.indexOf("c"));
		
		
		
		StringBuffer s1=new StringBuffer("Ashwini  Sharma");
		s1.append(" Kale");
System.out.println(s1);

		System.out.println(s1.length());
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(2, 5));
		System.out.println("AMSWER");
		System.out.println(s1.indexOf("Sharma"));
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace(0, 7, "Mahesh"));
		StringBuffer s2=new StringBuffer("monika nath");

		System.out.println(s2.delete(0, 7));

		StringBuffer s3=new StringBuffer("gobind");
		System.out.println(s3.reverse());
		System.out.println(s3.charAt(0));



	}

}
