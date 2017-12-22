package oop;

public class AbstractClass {
	private String name;
	private String address;
	private int number;
	public AbstractClass(String name,String address,int age)
	{
		System.out.println("Constructor of an employee");
		this.name = name;
		this.address = address;
		this.number = age;
	}
	public void mailCheck()
	{
		System.out.println("Mailing a check to " +name+" "+ address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//is a process of hiding the implementation details form the user,only functionlity will be provided
		AbstractClass e= new AbstractClass("Pisal","SiemReap",1997);
		e.mailCheck();
	}

}
