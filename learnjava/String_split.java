package learnjava;

import java.util.Arrays;

public class String_split {

	public static void main(String[] args) {

		String s="Shilpi";
		String j="Johri";
		System.out.println(s.concat(" ").concat(j));
		String a="My name is Shilpi";
		String [] b=a.split(" ");
	    String[] c=a.split(" ",3);
	    System.out.println(Arrays.toString(b));
	    System.out.println(Arrays.toString(c));

		for(int i=0;i<4;i++)
		{ if(i==3)
		{
			System.out.print(", ");	
		}
			
			System.out.print(b[i]+" ");
			
	
		}

		
}

}


	