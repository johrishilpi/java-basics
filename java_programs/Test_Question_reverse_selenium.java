package java_programs;

public class Test_Question_reverse_selenium {

	public static void main(String[] args) {
	String a="Selenium";
	String b="";
	System.out.println(a);
	char [] c=a.toCharArray();
	for(int i=c.length-1;i>=0;i--)
	{
		b=b+ c[i];
		
	}
System.out.println(b);
	}

}
