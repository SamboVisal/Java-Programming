package threadtest;

public class ThreadDeadLock extends Thread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new ThreadDeadLock();
		try {
			System.out.println("HEllo world");
			Thread.currentThread().join();
			System.out.println("No execute");
		}catch(Exception e) {
			e.getMessage();
		}
		t.start();
	}

}
