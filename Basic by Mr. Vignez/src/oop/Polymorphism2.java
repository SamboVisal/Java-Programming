package oop;

public class Polymorphism2 extends Polymorphism1 {
	private double salary;
	public Polymorphism2(String name, String address,double salary) {
		super(name, address);
		setSalary(salary);
	}
	public void mailCheck()
	{
		System.out.println("Mailing to check to " + getName() +" Salary "+ salary);
	}
	public void setSalary(double nsalary)
	{
		if(nsalary>=0.0){
			salary  = nsalary;
		}
	}
	
}
