package pack2;

public class Constructor1 extends Constructor {
	int a;
	int b;
	public Constructor1()
	{
		super(100,200);
		System.out.println("hello");
	}
	public void out()
	{
		System.out.println("Longha");
		super.output();
	}
	public static void main(String[] args) {
		Constructor1 ob = new Constructor1();
		ob.out();
	}

}
