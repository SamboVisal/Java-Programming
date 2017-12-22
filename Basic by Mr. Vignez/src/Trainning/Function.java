package Trainning;
import java.util.Scanner;
public class Function {
	 
	 int k;
	 static Scanner button;
	public Function(String name){
		System.out.println("My name is " + name);
	}
	public void setAge(int k){
		System.out.println("Your age is "+ k);
	}
	public int getAge(){
		return k;
	}
	public int outPut(){
		System.out.println("Your age is " + k);
		return k;
	}
	
	
	public static void main(String[] args) {
		
		
		Function o = new Function("Visal");
	//	int age = button.nextInt();
		o.setAge(20);
		o.getAge();
		o.outPut();
	}

}
