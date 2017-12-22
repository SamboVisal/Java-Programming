package Trainning;

public class Instance_Variable {
	//This instance variable is visible for any child class
	private String name;
	//Salary variable is visible in Intance_Variable class only
	private double salary;
	//THe name variable is assigned in the constructor
	public void Getname(String ename){
		name = ename;
	}
	//the salary is assigned a value
	public void getSalary(double esala){
		salary = esala;
		
	}
	//This method print the the detail
	public void Output(){
		System.out.println("Your name is " + name);
		System.out.println("Salary is " + salary);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Variable gg = new Instance_Variable();
		gg.Getname("Visal");
		gg.getSalary(10000);
		gg.Output();

	}

}
