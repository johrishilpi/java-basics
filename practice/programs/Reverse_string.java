package practice.programs;

public class Reverse_string {

	public static void main(String[] args) {
	String str="Shilpi";
	String str1="";
	char [] a=str.toCharArray();
	System.out.println(a);
	for(int i=str.length()-1;i>=0;i--)
	{
	  str1=str1+a[i];
	}
System.out.println(str1);
	}

}
