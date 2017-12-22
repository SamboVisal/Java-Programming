package Lesson1;
import java.util.Scanner;
public class MyClass {
	public static Scanner button;
	public static void main(String[] args) {
		button = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Input Name : "); 
		String name = button.nextLine();
	
		System.out.println("Input Sex");  
		String sex = button.nextLine();
	}

}
