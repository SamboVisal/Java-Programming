package createThread;

public class ThreadTest extends Thread{

	public void run() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t = new ThreadTest();
		
			t.start();
		
		
	}

}
