package answermodel;

import java.util.*;
public class ArrayListLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection l = new LinkedList();
		l.add("s");
		l.add("b");
		System.out.println(l);
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}