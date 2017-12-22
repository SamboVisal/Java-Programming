package waitnotifyall;
class Shared2{
	
	synchronized void waitMethod() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" is releasing and going to wait");
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName()+" has been released");
	}
	synchronized void notifyOneThread() {
		Thread t = Thread.currentThread();
		notify();
		System.out.println(t.getName()+" has notified one thread waiting for this object lock");
	}
	
}
public class NotifyTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Shared2 s = new Shared2();
		Thread t1 = new Thread() {
			public void run() {
				try {
					s.waitMethod();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		Thread t2 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t2.start();
		Thread t3 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t3.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t4 = new Thread() {
			public void run() {
				s.notifyOneThread();
			}
		};
		t4.setName("release lock one");
		t4.start();
	}

}
