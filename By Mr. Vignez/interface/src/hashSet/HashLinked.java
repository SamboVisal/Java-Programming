package hashSet;
import java.util.*;
public class HashLinked {

	public static void main(String[] args) 
	{
		HashSet <String> al = new LinkedHashSet<String>();
		al.add("Name");
		al.add("Age");
		al.add("Id");
		al.add("Age");
		Iterator <String> it = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
	}

}
