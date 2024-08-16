package practice.programs;

public class Reverse_string1 {

	public static void main(String[] args) {
		String a="Shilpi";
		String b="";
		char[] c=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+c[i];
		}
System.out.println(b);
	}

}
