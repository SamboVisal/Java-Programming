 package arrlist;
import java.util.*;
public class arrlistremove {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.add("c");
		System.out.println("Before remove");
		Iterator<String> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("after add");
		arr.add(0,"d");
		arr.add(1,"e");
		System.out.println("the current array is " + arr);
		System.out.println("after remove 1 index");
		arr.remove(1);
		System.out.println(arr);
		System.out.println("using get function");
		System.out.println(arr.get(2));
	}

}
