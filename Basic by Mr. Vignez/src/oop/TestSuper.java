package oop;
class Animals{
	public void move(){
		System.out.println("Animals can move");
	}

	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bark from animals");
	}
}
class Dogs extends Animals{
	public void move(){
		System.out.println("dog can walk and run");
	}
	public void bark()
	{
		System.out.println("Dog can bark");
	}
}
public class TestSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Dogs();
		Dogs b = new Dogs();
		Animals c = new Animals();
		c.move();
		c.bark();
		a.move();
		b.move();
		a.bark();
		//dog has priority when new Dogs()
	}

}
