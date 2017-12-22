package Trainning;

public class Local_Variable {

	public void myAge(){
		int age =0;
		age =7;
		System.out.println("My age is "+ age);
	}
	public static void main(String args[]){
		Local_Variable Local_VariableObject = new Local_Variable();
		Local_VariableObject.myAge();
	}
}
