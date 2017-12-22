package threadtest;

public class ControlThread extends Thread {

	public static void main(String[] args) {
		//Getting reference to Main Thread
		Thread t = Thread.currentThread();
		System.out.println("Current Thread name " + t.getName());
		t.setName("Pisal");
		System.out.println("After change name " + t.getName());
		//getting priority
		System.out.println("The main Thread priority " + t.getPriority());
		t.setPriority(MAX_PRIORITY);
		System.out.println("After set priority " + t.getPriority());
		ChildThread ct = new ChildThread();
		System.out.println("Child Thread priority " + ct.getPriority());
		ct.setPriority(MIN_PRIORITY);
		System.out.println("After set priority " + ct.getPriority());
		ct.start();

	}

}
class ChildThread extends Thread {

	@Override
	public void run() {
		for(int i =0 ; i<5; i++) {
			System.out.println("Child Thread");
		}
	}
	
}