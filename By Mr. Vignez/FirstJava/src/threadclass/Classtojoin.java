package threadclass;

public class Classtojoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thread t2 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					try {
						Thread.sleep(1000);
						System.out.println("Hello");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		Thread t1 = new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					try { 
						Thread.sleep(1000);
						System.out.println("World");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();
		
//		System.out.println("DUDE");
		//to make current thread to wait for another thread that call join function
		//waiting thread keyword to be finished then it will goes here
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After first thread");
		t2.start();
		try {
			t2 .join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello from main function");
	}

}
