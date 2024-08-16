package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class Iterations_in_Map {

	public static void main(String[] args) {
	Map <String,Integer> m1=new HashMap<String,Integer>();
    m1.put("A", 15);
    m1.put("B", 25);
    m1.put("C", 35);
    m1.put("D", 45);
    m1.put("E", 55);
    System.out.println(m1);
    //m1.clear();// clears the map elements
    Map <String,Integer> m2=new HashMap<String,Integer>();
    m2.put("F", 67);
    m2.put("G", 77);
    m2.putAll(m1);
    System.out.println(m2);
    m2.putIfAbsent("H",90);
    System.out.println(m2);
    System.out.println(m2.containsKey("N"));
    System.out.println(m2.containsValue(77));
    System.out.println("equals answer "+m2.equals(m1));
    m2.remove("A");
    System.out.println(m2);
    m2.remove("B", 25);
    System.out.println(m2);
    m2.replace("H", 78);
    m2.replace("E", 55, 108);
    System.out.println(m2);
    for(String k:m1.keySet())
    {
    	System.out.println(k);
    }
    for(Integer val:m1.values())
    {
    	System.out.println(val);
    }
    for (Entry<String,Integer> ent:m1.entrySet() )
    {
    	System.out.println(ent);
    }
    Iterator<Entry<String,Integer>> ent1=m1.entrySet().iterator();
    while(ent1.hasNext())
    {
    	System.out.println(ent1.next());
    }
    
	}

}
