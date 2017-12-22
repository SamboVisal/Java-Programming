package waitnotifyall;

public class WaitTestFail {

	public static void main(String[] args) {
	
		Thread1 t = new Thread1();
		t.start();
		System.out.println(t.total);
	}

}
class Thread1 extends Thread{
	int total=10;
	
	public void run() {
		for(int i=0;i<100;i++) {
			total+=i;
		}
		
		System.out.println("what the fuck dude");
	}
	
	
}