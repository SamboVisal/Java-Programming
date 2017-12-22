package waitnotifyall;
class Shared{
	synchronized void waitMethod() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" is releasing the lock and going to wait");
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getName()+" has been notified and acquired the lock back");
		
	}
	synchronized void notifyAllThread(){
		Thread t = Thread.currentThread();
		notifyAll();
		System.out.println(t.getName()+" has been notified all threads waiting for this object lock");
		
	}
}
public class Notifyall {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Shared s = new Shared();
		Thread t1 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t1.setName("A");
		t1.start();
		//Thread 2 will be waiting for locking of object 's'
		Thread t2 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t2.setName("b");
		t2.start();
		//thread t3 will be waiting for locking of object 's'
		Thread t3 = new Thread() {
			public void run() {
				s.waitMethod();
			}
		};
		t3.setName("c");
		t3.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		Thread t4 = new Thread() {
			public void run() {
				s.notifyAllThread();
			}
		};
		t4.start();
	}

}
