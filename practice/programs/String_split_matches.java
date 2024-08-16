package practice.programs;

import java.util.Arrays;

public class String_split_matches {

	public static void main(String[] args) {
	String a="Shilpi Johri is a scholar";
    String [] b=a.split(" ");
    System.out.println(Arrays.toString(b));
    String [] c=a.split(" ",3);
    System.out.println(Arrays.toString(c));
	}

}
