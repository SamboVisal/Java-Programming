package exception;


//re-throwing
public class ThrowThorws 
{
	static void fun() 
	{	
		try 
		{	
			int c = 10/0;
			System.out.println(c);
		//	throw new ArithmeticException("hello world");
		}catch(ArithmeticException e) 
		{
			
			System.out.println(e.getMessage());
			throw e; //re-throwing
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try {
			
			fun();
		}catch(ArithmeticException e) 
		{
			System.out.println("catch in main");			
		}
				
	}
}	

