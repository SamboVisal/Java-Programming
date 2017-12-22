package createThread;
class share{
	
	synchronized void waitMethod() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Release " + t.getId());
	}
	synchronized void notifyMethod() {
		Thread t = Thread.currentThread();
		notifyAll();
		System.out.println(t.getId()+" will be released");
	}
}
public class NOTIFY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final share s = new share();
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
			Thread.sleep(1000);
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
