package threadclass;

public class ThreadPriority2 
{
	int cnt=0;
	public void incre()
	{
		for(int i =0 ;i<100;i++)
		{
			cnt++;
		}
	}
	public void output()
	{
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				incre();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				incre();
			}
		});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		try {
			t2.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cnt);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority2 ee  = new ThreadPriority2();
		ee.output();
	}

}
