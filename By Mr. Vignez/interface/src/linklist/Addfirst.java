package linklist;

import java.util.*;

public class Addfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> af= new LinkedList <String>();
		af.add("A");
		af.add("B");
		af.add("C");
		af.add("D");
		((LinkedList<String>) af).addFirst("Visal");
		((LinkedList<String>) af).addLast("Pisal");
		System.out.println(af);
		Iterator <String>it = af.iterator();
		while(it.hasNext()){
			System.out.println(""+it.next());
		}
	}

}
