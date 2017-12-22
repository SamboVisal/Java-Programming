package oop;

public class PolymorphismClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 p1 = new Polymorphism1("Michael","Us");
		Polymorphism2 p2 = new Polymorphism2("Pisal","SiemReap",80000);
	
	
		p1.mailCheck();
		p2.mailCheck();
/*
 is the ability of an object to take on many form, occurs when a parent class
  reference is used to refer to a child class	
 */
	}

}
