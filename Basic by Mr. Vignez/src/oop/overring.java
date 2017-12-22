package oop;
class Animal
{
	public void move()
	{
		System.out.println("Animal can be moved");
	}
}
class dog extends Animal
{
	public void move()
	{
		System.out.println("Dog can walk and run");
	}
}
public class overring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		Animal d = new dog();
		a.move();
		d.move();
	}

}
