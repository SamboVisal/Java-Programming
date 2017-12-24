package WaitNotify;
class ThreadB extends Thread
{
	public int total;
	@Override
	public void run()
	{
		System.out.println("Hi notify");
		synchronized(this){
			for(int i=0; i <2; i++){
				total+=i;
				System.out.println("This is thread");
			}
			notify();
			System.out.println("This is notify function");
		}
	}
}
public class wait {
	//public static int total=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadB b = new ThreadB();
		//ThreadB c= new ThreadB();
		b.start();
		//c.start();
		synchronized(b)
		{
			System.out.println("Wait notify to complete ");
		
			try {
				b.wait();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The result is "+ b.total);
		}
		
	}

}
