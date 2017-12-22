
package Operator;
import java.util.Scanner;
public class KOKO {
	int puppyage;
	private static Scanner button;
	public KOKO(String name){
		System.out.println("Your name is "+name);
	}
	public void setAge(int age){
		puppyage = age;
	}
	public int getAge(){
	System.out.println("Your age is "+puppyage);
	return puppyage;
	}
	public void newage(int age){
		System.out.println("Your new age is " + age);
	}
	public static void main(String[] args) {
		button = new Scanner(System.in);
		KOKO my = new KOKO("Tommy");
		my.setAge(10);
		my.getAge();
		System.out.println("Input new age "); int k = button.nextInt();
		my.newage(k);
	}

}
