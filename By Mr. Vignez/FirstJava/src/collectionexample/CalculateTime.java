package collectionexample;
import java.util.*;
public class CalculateTime {
	//List in parents while ArrayList and LinkedList are child
	//Create object for the parents and control all the childs class
	//public static List <String> arrlist = new ArrayList<String>();
	//public static List <String> linkedlist = new LinkedList<String>();
	//put static then no need to create ob to call
	public static void calulateTiming(List <String> lis, String type)
	{
		
		long start = System.currentTimeMillis();
		for(long i=0 ;i < 100000; i++)
		{
			//ArrayList it takes time consuming for this
			lis.add(0,"Batch3");
			lis.add("B");
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken for " +type+" is " + (end-start));
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List <String> arrlist = new ArrayList<String>();
		 List <String> linkedlist = new LinkedList<String>();
		calulateTiming(arrlist,"ArrayList");
		calulateTiming(linkedlist,"LinkedList");
		
	}

}
