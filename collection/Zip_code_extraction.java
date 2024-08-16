package collection;
import java.util.*;

public class Zip_code_extraction {

	public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add("28 Kutchery road, Allahabad, 211001-UP India");
	a1.add("29 Mahatma Gandhi Marg, Lucknow, 130009-UP India");
	a1.add("7345 Bells Ave, New York, 786624 US");
	a1.add("62 clives road,Banglore, 278889 India");
	a1.toString();

	for(int i=0;i<a1.size();i++)
	{
	String d=a1.get(i).toString();
	int b=d.length();
	int v=b/2;
	String f="";
	String sub=d.substring(v);
	char [] e= sub.toCharArray();
	for(int j=0;j<e.length;j++)
	{if(Character.isDigit(e[j])==true)
			{
		f=f+e[j];
			}
			}
	System.out.println(f);
	}
	
	/*String h=sub.replaceAll("[a-z]","");
	String g=h.replaceAll("[A-Z]","");
	String f=g.replaceAll("-", "");
	String t=f.replaceAll(" ", "");
	String r=t.replaceAll(",","");
	
	System.out.println(r);*/
	
	
	
	}

}
