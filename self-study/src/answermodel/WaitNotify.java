package answermodel;
class shared{
	synchronized void waitMethod() {
		Thread t = new Thread();
		System.out.println(t.currentThread().getName()+" Waiting to release");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.currentThread().getName()+" Released");
		
	}
	synchronized void notifyMethod() {
		Thread t = new Thread();
		System.out.println(t.currentThread().getName()+" Before notify");
		notifyAll();
		System.out.println(t.currentThread().getName()+" After notify");
		
	}
}

public class WaitNotify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final shared s = new shared();
		Thread t1 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t2.start();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3 = new Thread() {
			public void run() {
				s.notifyMethod();
			}
		};
		t3.start();
	}

}
