package arrlist;
import java.util.*;
public class listiterator {

	public static void main(String[] args) 
	{
		List <String> arr = new LinkedList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		arr.add(0,"-a");
		ListIterator<String> itr=arr.listIterator();  
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious()){  
		System.out.println(itr.previous());  
		} 
	}

}
