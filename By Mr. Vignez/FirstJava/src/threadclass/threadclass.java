package threadclass;
//object will become virtual cpu
public class threadclass extends Thread{

		@Override
		public void run()
		{
			for(int i=80; i<100; i++){
				try
				{
					Thread.sleep(1000);
					System.out.println("Hello " +(i+1));
				}	
				catch(InterruptedException  e){
					e.printStackTrace();
				}
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadclass t1= new threadclass();
		Thread t2= new Thread(new AnotherClass());
		threadclass t3= new threadclass();
		t1.start();
		t2.start();
	}

}
