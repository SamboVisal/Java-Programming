package hashSet;
import java.util.*;
public class Test1 {

	public static void main(String[] args) 
	{
		HashSet<String> s = new HashSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("a");
		Iterator <String> i = s.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		System.out.println("isEmpty");
		boolean ss = s.isEmpty();
		System.out.println(ss);
		System.out.println("clone object");
		System.out.println(s.clone());
		int  ia  = s.size();
		System.out.println(ia);
	}

}
