package Stringmethod;
import java.util.Scanner;
public class Login {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		String name;
		String pass;
		System.out.println("Enter username");
		name = button.nextLine();
		System.out.println("Enter password");
		pass = button.nextLine();
		boolean na = name.equalsIgnoreCase("Pisal");
		boolean pa = pass.contentEquals("1997");
		if(na==true){
			if(pa==true){
				System.out.println("U are our member");
			}
			else{
				System.out.println("Wrong password");
			}
		}
		else{
			System.out.println("Wrong username");
		}
	}

}
