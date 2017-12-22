package builderpattern;

public class THreadTest extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new THreadTest();
		Thread t2 = new THreadTest();
		t.start();
		t2.start();
		
	}

}
