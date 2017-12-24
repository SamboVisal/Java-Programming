package runnableclass;

public class anothercla1 implements Runnable{
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			System.out.println("This is another class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
