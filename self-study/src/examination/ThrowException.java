package examination;

import java.io.IOException;

public class ThrowException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int a = 10, b =0 ,c=0;
		c = a/b;
	
		try {
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
