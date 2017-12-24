package runnableclass;

public class impRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		impRunnable irc = new impRunnable();
		Thread t = new Thread(irc);
		t.start();
		anothercla ac = new anothercla();
		Thread t1 = new Thread(ac);
		t1.start();
		Thread t2 = new Thread(new Runnable(){
			public void run()
			{
				try 
				{
					for(int i=0; i<10; i++)
					{
						Thread.sleep(1000);
						System.out.println("Hello from t2 ");	
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++)
		{
			System.out.println("Hello from another side");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
