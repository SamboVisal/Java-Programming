package Special_Keyword;

public class TryCatch2 {
	public static void callHello(NullPointer c)
	{
		try
		{
			c.sayHello();	
		}
		catch(NullPointerException e)
		{
			e.getMessage();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointer d = new NullPointer();
			callHello(d);	
		
	}

}
