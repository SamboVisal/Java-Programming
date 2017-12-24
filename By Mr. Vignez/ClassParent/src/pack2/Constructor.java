package pack2;

public class Constructor {
	int a;
	int b;
	Constructor(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Hello World");
	}
	public void output(){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor(19,20);
		obj.output();
		
	}

}
