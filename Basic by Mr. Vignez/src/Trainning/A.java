package Trainning;
import java.util.Scanner;
public class A {

	private static Scanner button;
	
	public static void main(String[] args) {
	button = new Scanner(System.in);
	B fu = new B();
	
	System.out.println("Enter your name : ");
	String name = button.nextLine();
	fu.getName(name);
	fu.Output();
	}


}
