package Special_Keyword;

public class Superkeyword extends ThisKeyword {
	
	Superkeyword()
	{
		super(12,13);
		System.out.println("This is super");
	}
	public void out()
	{
		System.out.println("Welcome to super");
		super.output();
		System.out.println("End of super key");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyword su = new Superkeyword();
		su.out();
	}

}
