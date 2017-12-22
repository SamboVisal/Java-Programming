package Trainning;
import java.util.Scanner;
public class Private {
	private static String name;
	private static int age;
	public static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		name = button.nextLine();
		age = button.nextInt();
		System.out.printf("Your name is %s and Age is %d",name,age);
	}

}
