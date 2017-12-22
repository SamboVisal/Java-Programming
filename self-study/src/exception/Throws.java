package exception;

import java.io.IOException;
//throws
public class Throws {
	
	void m()throws ArithmeticException {
		int c = 10/0;
		
	}
	void n()throws IOException {
		m();
	}
	void k() {
		
			try {
				n();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Throws a = new Throws();
		a.k();
	}

}
