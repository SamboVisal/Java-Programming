package practice2;

import java.io.IOException;

public class ExceptionHandling {
	
	
	public static void main(String[] args) throws IOException {
		
		try 
		{
			int c = 10/0;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		int num[] = {1, 2, 3, 4};
	    System.out.println(num[5]);
		
		
	}

}
