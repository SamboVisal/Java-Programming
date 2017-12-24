package runnableclass;

public class impRunnable2 implements Runnable {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impRunnable2 ir = new impRunnable2();
		Thread s = new Thread(ir);
		s.start();
		anothercla1 ir2 = new anothercla1();
		Thread s1 = new Thread(ir2);
		s1.start();
		Thread s2 = new Thread(new Runnable(){
			public void run()
			{
				System.out.println("Hello from s2");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		s2.start();
	}
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("This is t class ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}