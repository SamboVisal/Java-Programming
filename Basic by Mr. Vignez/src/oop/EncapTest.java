package oop;

public class EncapTest {
	private int age;
	private String name;
	public EncapTest(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	public void output()
	{
		System.out.println("The name is " + name);
		System.out.println("The age is " + age);
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String nName)
	{
		name = nName;
	}
	public void setAge(int nage)
	{
		age = nage;
	}
}
