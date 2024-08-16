package java_programs;
import java.util.*;
public class String_character_4 {

	public static void main(String[] args) 
	{
	String name="ShilpiJohri";
	String namelower=name.toLowerCase();
	Map <Character,Integer>  m1=new LinkedHashMap <Character,Integer> ();
    for(int i=0;i<namelower.length();i++)
    {
    	if(m1.containsKey(namelower.charAt(i))==true)
    	{
    Integer a1=m1.get(namelower.charAt(i))+1;
    Character c=namelower.charAt(i);
    m1.put(c, a1);
    	}
    	else
    	{
    		Character b=namelower.charAt(i);
    		m1.put(b,1);
    	}
    }
    System.out.println(m1);
	}

}
