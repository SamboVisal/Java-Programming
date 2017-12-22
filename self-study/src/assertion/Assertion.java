package assertion;

import java.util.Scanner;

//create our own error
public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number less than 100 : ");
		a = s.nextInt();
		assert (a<100) : "I crossed the rule";
	}	

}
