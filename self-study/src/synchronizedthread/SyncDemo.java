package synchronizedthread;
class Sender{
	public void send(String msg) {
		System.out.println("sending " + msg);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.getMessage();
		}
		System.out.println(msg + " send");
	}
	
}
class ThreadSend extends Thread{
	private String msg;
	private Thread t;
	Sender sender;
	//receives a message object and a string
	ThreadSend(String m, Sender obj){
		msg = m;
		sender = obj;
	}
	public void run() {
		synchronized(sender){
			sender.send(msg);
		}
	}
}

public class SyncDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender snd = new Sender();
		ThreadSend s1 = new ThreadSend("Hi",snd);
		ThreadSend s2 = new ThreadSend("Bye",snd);
		s1.start();
		s2.start(); 
		
	}

}
