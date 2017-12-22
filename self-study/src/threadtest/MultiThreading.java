package threadtest;

class MultiThread extends Thread{
	 public void run(){
		System.out.println("Thread "+ Thread.currentThread().getId());
	 }
}

public class MultiThreading extends Thread {
	public void run() {
		System.out.println("Thread in Main " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		for(int i =0; i<8;i++) {
			MultiThread object = new MultiThread();
			MultiThreading o = new MultiThreading();
			//object.start();
			object.start();
			
			try {
				object.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			o.start();
		}
	}

}
