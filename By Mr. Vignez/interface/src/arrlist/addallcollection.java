package arrlist;
import java.util.*;
public class addallcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pisal");
		al.add("Visal");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Pisal");
		al2.add("200");
		//remove will remove the same value and retain the unique value
		al.removeAll(al2);
		al.addAll(al2);
		//al.retainAll(al2);//this will retain the same value
		Iterator<String> ite = al.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		
	}

}
