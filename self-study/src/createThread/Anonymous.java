package createThread;

public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello world");
			}
		});
		t.start();
		Thread a = new Thread() {
			public void run() {
				System.out.println("bitch");
			}
		};
		a.start();
	}

}
