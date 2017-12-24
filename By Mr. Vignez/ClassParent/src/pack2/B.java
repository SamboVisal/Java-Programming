package pack2;

public class B  {
	private final int A;
	public  B()
	{
		A=100;
	}
	public static final int D;
	static
	{
		D=200;
	}
	public void get()
	{
		System.out.println("This is B class");
	}
	public static void main(String[] args) 
	{
		A cc = new A();
		cc.get();
	}

}
