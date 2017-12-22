package Stringmethod;
import java.util.Scanner;
public class Testing {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		String name = button.nextLine();
		String string1 = "My name is".concat(" Visal");
		int i = name.length();
		System.out.println("The length is " + i);
		System.out.println("The Concatenation is " + string1);
	}

}
