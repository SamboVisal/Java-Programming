package WaitNotify;

public class waitkey {
	int goods;
	public synchronized void producer()
	{
		for(int i=0; i<10; i++){
			goods++;
		}
		System.out.println("Hello from producer");
		//First the program come here and Wait for another function execute notify
		//because wait funciton is still until it reaches the notify
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try 
		{
			wait();
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("After wait...Hello from producer");
	}
	public synchronized void consumber(){
		for(int i=0; i<10; i++){
			goods--;
		}
		notify();
		System.out.println("After notify... Hello consumer");
	}
	public static void main(String[] args) {
	
		waitkey wn = new waitkey();
		new Thread(new Runnable()
		{

			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				wn.producer();
			}
		}).start();
		new Thread(new Runnable()
		{

			@Override
			public void run() {
				// TODO Auto-generated method stub
				wn.consumber();
			}
			
		}).start();
		
	}

}
