package exception;

//user define exception
@SuppressWarnings("serial")
class MyException extends Exception{
	String st1;
	MyException(String s2){
		st1 = s2;
	}
	public String toString() {
		return ("Excepton occur "+ st1);
	}
	
}

public class ThrowsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			throw new MyException("Hello world");
	
		}catch(MyException e) {
			System.out.println("catch block");
			System.out.println(e);
		}
	}

}
