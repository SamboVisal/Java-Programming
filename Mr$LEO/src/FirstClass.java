import java.util.Scanner;
public class FirstClass {
	//static is associated with main into to class
	//void no return type
	//(String[] args)command line argument
	// new keyword allocated memory for an object during run time/execution time.. nameless block before no new keyword
	//how to invoke(call) function: using dot operator along with object 
	static int i;
	static Scanner button;
	public void demo(){
		System.out.println("Visal");
		System.out.println("Neang");
	}
	public FirstClass(String name){
		set = name;
		System.out.println("The constructor name is "+ set);
	}
	
	private String set;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstClass o = new FirstClass("Michael");
		button = new Scanner(System.in);
		System.out.print("Input age ");
		i = button.nextInt();
		System.out.printf("Your age is %d",i);
		System.out.println("The name are: ");
		o.demo();
		
	}

}
