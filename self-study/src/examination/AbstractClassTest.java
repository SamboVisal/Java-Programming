package examination;

public class AbstractClassTest {
	private String name;
	private int age;
	AbstractClassTest(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void output() {
		System.out.println("name "+ name + " age "+ age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassTest object = new AbstractClassTest("Longha",1997);
		object.output();
	}

}
