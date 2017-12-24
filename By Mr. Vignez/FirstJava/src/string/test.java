package string;
import java.util.*;
public class test {
	static Scanner button;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		button = new Scanner(System.in);
		String str = new String();
		String str1 = new String();
		System.out.println("Enter username ");
		str = button.next();
		System.out.println("Enter password ");
		str1 = button.next();
		if(str.equalsIgnoreCase("SamboVisal")){
			if(str1.equals("19997")){
				System.out.println("You are our memeber");
			}
			else{
				System.out.println("Wrong password");
			}
		}
		else{
			System.out.println("Wrong username");
		}
		boolean check=str.contentEquals("SamboVisal");
		System.out.println(check);
		StringBuffer str2 = new StringBuffer("SamboVisal");
		str2.append(" Minoz");
		System.out.println(str2);
	}

}
