package arrlist;
import java.io.IOException;
import java.util.*;  
public class ListExample{  
public static void main(String args[])throws IOException
{ 
	
	ArrayList<String> al=new ArrayList<String>();  
	al.add("Amit");  
	al.add("Vijay");  
	al.add("Kumar");  
	al.add(1,"Sachin");  
	System.out.println("Element at 2nd position: "+al.get(2));  
	System.out.println(al);
	for(String s:al)
	{  
		System.out.println(s);  
	}  
	System.out.println("Clear all elements");
	al.clear();
	System.out.println(al);
			}			  
}  