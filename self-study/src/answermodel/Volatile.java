package answermodel;

public class Volatile extends Thread{
	public volatile int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volatile v = new Volatile();
		Thread t1 = new Thread();
		
		
	}
	public void cun() {
		for(int i=0;i<20;i++) {
			count++;
		}
	}

}
