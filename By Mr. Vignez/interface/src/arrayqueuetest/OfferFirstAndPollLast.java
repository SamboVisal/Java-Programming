package arrayqueuetest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
/*
 Java Deque Interface is a linear collection that supports element insertion 
 and removal at both ends.
 boolean add(object)	It is used to insert the specified element into this deque and return true upon success.
boolean offer(object)	It is used to insert the specified element into this deque.
 */
public class OfferFirstAndPollLast {
/*
 Unlike Queue, we can add or remove elements from both sides.
Null elements are not allowed in the ArrayDeque.
ArrayDeque is not thread safe, in the absence of external synchronization.
ArrayDeque has no capacity restrictions.
ArrayDeque is faster than LinkedList and Stack.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> of = new ArrayDeque<String>();
		of.add("Jackson");
		of.offer("Michael");
		of.offer("Visal");
		System.out.println("Before add");
		for(String a: of){
			System.out.println(a);
		}
		
		  //deque.pollFirst();//it is same as poll() 
		of.offerFirst("Smith");
		of.offerLast("Nisetrooy");
		System.out.println("After add");
		for(String s : of){
			System.out.println(s);
		}
		of.pollLast();
		System.out.println("After poll");
		for(String p:of){
			System.out.println(p);
		}
		of.element();
		System.out.println("Element()");
		for(String p:of){
			System.out.println(p);
		}
	}

}
