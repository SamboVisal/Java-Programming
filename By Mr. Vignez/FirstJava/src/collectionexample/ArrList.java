package collectionexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList al = new ArrayList();
		//ArrayList<String> arr = new ArrayList<String>();
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(100);
		al.add(2);
		al.add(22);
		al.add(4);
		al.add(22);
		al.add(43);
		//
		Collections.sort(al);
		System.out.println(al);
		ArrayList <String>arr1 = new ArrayList<String>();
		arr1.add("A");
		arr1.add("GHI");
		arr1.add("DEF");
		arr1.add("ABC");		
		arr1.add("abc");
		Collections.sort(arr1);
		System.out.println(arr1);
		String str ="" ;
		for(String s:arr1)
		{
			str+=(s+="..");
		}
		System.out.println(str);
	}

}
