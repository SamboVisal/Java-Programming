package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Book {
	
	String name;
	int id;
	public Book(String name,int id){
		this.name = name;
		this.id = id;
		
	}

	public static void main(String[] args)
	{
		Book b1 = new Book("Harry",101);
		Book b2 = new Book("Potter",102);
		HashSet<Object> s = new HashSet<Object>();
		s.add(b1);
		s.add(b2);
		Iterator<Object> it = s.iterator();
		while(it.hasNext()){
			Book b = (Book)it.next();
			System.out.println("ID " + b.id + " Name" + b.name);
		}
	}

}
