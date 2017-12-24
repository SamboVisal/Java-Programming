package linklist;
import java.util.*;
public class test1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("pisal");
		ll.add("Koko");
		ll.add("Michael");
		System.out.println(ll);
		Iterator <String>it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	}

}
