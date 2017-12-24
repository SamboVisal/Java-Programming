package arrayqueuetest;
import java.util.*;
public class QueueTest {
/*
Method	Description
boolean add(object)	It is used to insert the specified element into this queue and return 
	true upon success.
boolean offer(object)	It is used to insert the specified element into this queue.
Object remove()	It is used to retrieves and removes the head of this queue.
Object poll()	It is used to retrieves and removes the head of this queue, or returns 
	null if this queue is empty.
Object element()	It is used to retrieves, but does not remove, the head of this queue.
Object peek()	It is used to retrieves, but does not remove, the head of this queue, 
	or returns null if this queue is empty.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue <String> queue = new PriorityQueue <String> ();
		queue.add("Aisal");
		queue.add("Ratanak");
		queue.add("Lytang");
		queue.add("Pong");
		queue.add("Norin");
		queue.offer("Man Red");
		System.out.println("Head : " + queue.element());
		System.out.println("Head : " + queue.peek());
		System.out.println("Iterator elements ");
		Iterator <String> it = queue.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		queue.remove();
    	queue.removeAll(queue);
		//differs from poll that it will return null if the element if not exist
	    queue.poll();
		System.out.println("After remove");
		Iterator <String> its = queue.iterator();
		while(its.hasNext()){
			System.out.println(its.next());
		}
		
	}

}
