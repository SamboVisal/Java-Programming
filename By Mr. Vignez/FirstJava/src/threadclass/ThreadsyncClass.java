package threadclass;

public class ThreadsyncClass {
	
	 int cnt=0;
	public synchronized void  increment()
	{
		cnt++;
	}
	public void  countThevalue()
	{	
		
		Thread t1=new Thread(new Runnable(){
			public void run()
			{
				
				for(int i=0;i<1000;i++){
					increment();
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2=new Thread(new Runnable(){
			public void run(){
		
				for(int i=0;i<1000;i++){
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					increment();
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
		
		System.out.println(cnt);
		System.out.println(cnt);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadsyncClass tsc = new ThreadsyncClass();
		long start=System.currentTimeMillis();
		
		tsc.countThevalue();
		
		long end=System.currentTimeMillis();
		System.out.println(end);
		System.out.println(start);
		System.out.println(end-start);
	}

}
