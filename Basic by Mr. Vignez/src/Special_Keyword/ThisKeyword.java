package Special_Keyword;

public class ThisKeyword {
	int a,b;
	ThisKeyword(int a, int b)
	{
		this.a=a;
		this.b=b;
		
	}
	public void output()
	{
		System.out.println("This is this keyword");
		System.out.println("The value a is " +a);
		System.out.println("The value b is "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword th =new ThisKeyword(23,24);
		th.output();
		
	}

}
