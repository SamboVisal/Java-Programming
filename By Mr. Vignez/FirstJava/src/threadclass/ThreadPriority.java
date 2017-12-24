package threadclass;

public class ThreadPriority {

	public void output(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello from " + Thread.currentThread().getName());
			}
		});
		t1.setName("Sambo Visal");
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hello from " + Thread.currentThread().getName());
			}
		});	
		t2.setName("Lee Minho");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.stop();
		//t1.checkAccess();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority t = new ThreadPriority();
		t.output();
	}

}
