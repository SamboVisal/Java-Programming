package hashSet;
import java.util.*;
public class TreeOfSet {
/*
 Java TreeSet class implements the Set interface that uses a tree for storage. 
 	It inherits AbstractSet class and implements NavigableSet interface. The objects of TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

Contains unique elements only like HashSet.
Access and retrieval times are quiet fast.
Maintains ascending order.
 */
	public static void main(String[] args)
	{
		TreeSet <String> ts = new TreeSet<String>();
		ts.add("D");
		ts.add("C");
		ts.add("C");
		ts.add("B");
		ts.add("A");
		Iterator <String>it = ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
