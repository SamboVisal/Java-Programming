package Trainning;
import java.util.Scanner;
public class D {
	 
	public void Getname(int num){
		System.out.println("The Number is " + num);
	}
	
	public static void main(String args[]){
		int n;
		Scanner button = new Scanner(System.in);
		System.out.println("Enter number : ");
		n = button.nextInt();
		D mytest = new D();
		mytest.Getname(n);
	}

}
