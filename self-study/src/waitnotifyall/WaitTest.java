package waitnotifyall;

public class WaitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			try {
				System.out.println("waiting for notify");
				b.wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is: "+b.total);
		}
	}

}
class ThreadB extends Thread{
	int total;
	
	@Override
	public void run() {
		System.out.println("Welcome to notify");
		synchronized(this) {	
			for(int i=0; i<100; i++) {
				total+=i;
			}	
			notify();
			System.out.println("end of notify");
		}
	}
}
