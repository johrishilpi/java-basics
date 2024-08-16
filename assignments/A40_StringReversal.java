package assignments;
import java.util.Arrays;
public class A40_StringReversal {

	public static void main(String[] args)
	{
	String a="Shilpi";
	char [] b= a.toCharArray();
	System.out.println(Arrays.toString(b));
	for(int i=a.length()-1;i>=0;i--)
	{
		System.out.print(b[i]);
	}
	String output="";
System.out.println("");
	for(int i=a.length()-1;i>=0;i--)
	{
		char d=a.charAt(i);
		output=output+d;
	}
System.out.println(output);
	}

}
