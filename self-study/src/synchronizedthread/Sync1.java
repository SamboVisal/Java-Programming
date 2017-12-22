package synchronizedthread;

public class Sync1 {
		//synchronized is keyword that use to allow one thread to execute
		synchronized void print(int a) {
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Sync1 object = new Sync1();
		Thread t1 = new Thread() {
			public void run() {
				object.print(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				object.print(100);
			}
		};
		t1.start();
		t2.start();
		System.out.println(t1.getState());
		
		
	}

}
