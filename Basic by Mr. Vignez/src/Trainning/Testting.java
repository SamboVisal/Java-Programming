package Trainning;
import java.util.Scanner;
public class Testting {
	public static String name;
	public static String drink;
	int age,Age;
	public void getName(String kkk){
		name = kkk;
	}
	public void getDrink(String kk){
		drink = kk;
	}
	
	public String Return(){
		
		return name;
	}
	public String Drink(){
		return drink;
	}
	public Testting(int age){
		Age = age;
	}
	public void Output(){
		System.out.println("The name is " + Return());
		System.out.printf(" And his favourite drink is %s",Drink());
		System.out.printf(" And your age is %d ",Age);
	}
	public static Scanner button;
	public static void main(String[] args) {
		
		button = new Scanner(System.in);
		System.out.println("Enter your name: ");
		name = button.nextLine();
		System.out.println("Enter his fav drink ");
		drink = button.nextLine();
		Testting ob = new Testting(20);
		ob.getName(name);
		ob.Output();
	}

}
