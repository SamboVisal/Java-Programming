package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class arrlist {

	public static void main(String[] args)
	{
		List <arrlist2> list = new ArrayList <arrlist2>();
		ArrayList<String> lis = new ArrayList<String>();
		lis.add("Pisal");
		lis.add("Love");
		lis.add("Neang");
		System.out.println(lis);
		arrlist2 s1 = new arrlist2("Pisal",19);
		arrlist2 s2 = new arrlist2("Michael",21);
		arrlist2 s3 = new arrlist2("Janet",18);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		try
		{
			System.out.println(list);
		}
		catch(ClassCastException e)
		{
			e.getMessage();
		}
	
	}

}
