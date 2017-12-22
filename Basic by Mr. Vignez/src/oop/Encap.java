package oop;

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapTest en = new EncapTest(100,"Pisal");
		en.output();
		en.setAge(21);
		en.setName("Michael");
		System.out.println("The another name is " + en.getName() +" and age is " + en.getAge());
//the variable of a class will be hidden from other classes, and can be accessed only through the 
		//method of their current class, and known as data hiding
	}	

}
