package runnableclass;

public class ex1 {
	int total=0;
	public void output()
	{
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for(int i=0;i<10;i++){
				total+=i;	
				}
			}
		});
		Thread t2 = new Thread(new Runnable()
		{	
			@Override
			public void run()
			{
				for(int i=0; i<10; i++)
				{
					total+=i;
				}
			}
		});
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(total);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 ob = new ex1();
		ob.output();
	}

}
