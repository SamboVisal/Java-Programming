package threadclass;

//when u create Thread that means u create a virtual cpu
public class ExtendingThread extends Thread {

	//This statement will execute for the thread
	@Override
	public void run()
	{
		System.out.println("Hello from run");
	}
	public static void main(String[] args) {
		ExtendingThread et = new ExtendingThread();
		ExtendingThread et1 = new ExtendingThread();
		ExtendingThread et2 = new ExtendingThread();
		//we can call by start() or run()
		et.start();
		et1.stop();
		et2.start();
	}

}
