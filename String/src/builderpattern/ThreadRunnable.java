package builderpattern;

public class ThreadRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread 1");
				System.out.println("Thread 1");
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread 2");
				System.out.println("Thread 2");
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
