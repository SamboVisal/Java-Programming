package createThread;

public class ThreadRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Implements Runnable");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunnable r = new ThreadRunnable();
		Thread t = new Thread(r);
		t.start();
	}

	

}
