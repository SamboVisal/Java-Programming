package arrayqueuetest;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayQueueClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque <String>  arc = new ArrayDeque<String>();
		arc.add("A");
		arc.add("B");
		arc.add("A");
		for(String n : arc){
			System.out.println(n);
		}
	}

}
