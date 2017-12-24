package arrlist;
import java.util.*;
public class Book 
{
	int id;
	String name;
	int year;
	public Book(int id,String name, int year){
		this.id = id;
		this.name= name;
		this.year = year;
	}
	public static void main(String[] args) 
	{
		List <Book> arr = new ArrayList<Book>();
		Book b1 = new Book(100,"Harry Potter",2005);
		Book b2 = new Book(200,"One Thing",2010);
		Book b3 = new Book(300,"Five people u meet in heaven",2007);
		arr.add(b1);
		arr.add(b2);
		arr.add(b3);
		for(Book b:arr){
			System.out.println("Id " + b.id + "\nName of Book " + b.name + "\nYear " + b.year);
		}
	}

}
