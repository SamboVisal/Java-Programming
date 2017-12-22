package exception;

public class ExceptionPropagated {
	
	void m() {
		int data = 70/ 0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("fff");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionPropagated t = new ExceptionPropagated();
		t.p();
	}

}
