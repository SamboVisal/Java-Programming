package thiskeyword;
import java.util.*;
public class RuntimeExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		try
		{
			c=a/b;
			System.out.println("The result is " +c);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		
	}

}
