package practice2;

public class ThrowKeyword {
	static void print(int a)throws ArithmeticException,NullPointerException {
		if(a<18) {
			System.out.println("too young");
		}
		else
			throw new NullPointerException("the use");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			print(30);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
