package abstractandinterface;

public abstract class Abstract1 extends Abstract2  {
	
	//Abstract1 no constructor if we want to extends class with constructor then just its own constructor in here
	Abstract1(String name, int age) {
		super(name, age);
		System.out.println("Inside Abstract 1");
		System.out.println(name + " " + age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Abstract2 ob = new Abstract1("pisal",123);
		
		//abstract3 cannot create object its self cause it extends from 2
		Abstract2 ob1 = new Abstract3("Visal",1997);
	    //	ob.Output();
		//ob.Output();
		//ob1.Output();
		
	}

}
