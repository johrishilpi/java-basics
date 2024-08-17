package java_programs;

public class String_buffer_methods_constructors {

	public static void main(String[] args) {
	StringBuffer s1=new StringBuffer();//non parameterized constructor-initial capacity 16
	StringBuffer s2=new StringBuffer(10);//Parameterized constructor-initial capacity 10
	StringBuffer s3=new StringBuffer("Shilpi");//Parameterized constructor-String
	System.out.println(s1.capacity());
	System.out.println(s2.capacity());
	System.out.println(s3.capacity());
	s3.ensureCapacity(50);
	System.out.println(s3.capacity());
	s3.append(" Johri");
	System.out.println(s3);
	System.out.println(s3.indexOf("J"));
	System.out.println(s3.length());
	System.out.println(s3.substring(3));
	s2.append("Sanjivani");
	System.out.println(s2);
	System.out.println(s2.substring(3, 8));
	s2.replace(3, 5, "jee");
	System.out.println(s2);
	System.out.println(s2.isEmpty());
	System.out.println(s1.isEmpty());
	s1.append("This is the world");
	System.out.println(s1);
	System.out.println(s1.capacity());
	s1.ensureCapacity(50);
	System.out.println(s1.capacity());
	System.out.println(s1.delete(8, 12));
	System.out.println(s1.replace(5, 7, "wonderful"));
	System.out.println(s1.charAt(8));
	System.out.println(s1.deleteCharAt(0));
	System.out.println(s1.reverse());
	
	
	
	
	
	
	}

}
