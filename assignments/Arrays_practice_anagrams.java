package assignments;

import java.util.Arrays;

public class Arrays_practice_anagrams {

	public static void main(String[] args) {
    String a="secure";
    String b="rescue";
    char [] a1=a.toCharArray();
    char [] b1=b.toCharArray();
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(b1));
    Arrays.sort(a1);
    Arrays.sort(b1);
    System.out.println(Arrays.toString(a1));
    System.out.println(Arrays.toString(b1));
boolean b2=Arrays.equals(a1, b1);
    if(b2==true)
    {
    	System.out.println(a+" and "+b+" are anagrams");
    }
    else
    {
    	System.out.println(a+" and "+b+" are not anagrams");
    }
	}

}
