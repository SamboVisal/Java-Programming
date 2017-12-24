package abstractandinterface;

public class Abstract3 extends Abstract2 {
	private String name;
	private int age;
	Abstract3(String name, int age) {
		super(name, age);
		System.out.println("This is abstract 3");
		System.out.println(name);
		// TODO Auto-generated constructor stub
	}
	public String getName(){
		return name;
	}
	

}
