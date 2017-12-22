package oop;

public class Polymorphism1 {
	private String name;
	private String address;
	public  Polymorphism1(String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	public void mailCheck()
	{
		System.out.println("Mailing a check to " + this.name + " " + this.address);
	}
	public String getName()
	{
		return name;
	}
}
