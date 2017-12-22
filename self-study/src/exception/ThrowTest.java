package exception;
//throws create own exception and throw it by programmer suspective
//denote what type of exception that should be thrown by a particular function
//throws can present when absent 
//throw is a keyword which is used to throw the user defined exception to the caller
//throws is  a keyword applied to function prototype to indicate what type of exception maybe thrown that the caller may to handle with try&catch


public class ThrowTest {
	//The Java throw keyword is used to explicitly throw an exception.
	static void validate(int age) {
		if(age<18)
			//runtime exception only
			throw new ArithmeticException("Not valid");
		else
			System.out.println("Welcome");
			
	}
	public static void main(String[] args) {
		
			validate(12);
		
	}

}
