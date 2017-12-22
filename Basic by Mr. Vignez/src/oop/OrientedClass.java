package oop;

class MyOriented {
	int z;
	public void addition(int x, int y)
	{
		z = x + y;
		System.out.println("The addition is " + z);
	}
	public void substraction(int x,int y)
	{
		z = x - y;
		System.out.println("The substraction is " + z);
	}
}
public class OrientedClass extends MyOriented
	{
	public void Multiply(int x,int y)
	{
		z = x * y;
		System.out.println("The multiplication is " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10,b=20;
		OrientedClass e = new OrientedClass();
		MyOriented s = new MyOriented();
		s.addition(a, b);
		e.addition(a, b);
		e.substraction(a, b);
		e.Multiply(a,b);
	
		/*
		when the object OrientedClass created, a copy of the contents of the superclass is
		made within it. that is why, using the object of the subclass you can access the members
		of a superclass
		 */
	}
}

