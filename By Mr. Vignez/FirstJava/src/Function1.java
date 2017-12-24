
public class Function1 {
	public void demo()
	{
		System.out.println("I'm a default function");
	}
	public void demo(int a)
	{
		System.out.println("Function with one argument "+ a );
	}
	public void demo(char ch)
	{
		System.out.println("Function with character " + ch);
	}
	void demo(int a, char ch)
	{
		System.out.println("The two arguments " + a + " " +ch);
	}
	//define more than one function
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function1 ob = new Function1();
		ob.demo();
		ob.demo(10);
		ob.demo('f');
		ob.demo(10,'a');
	}

}
