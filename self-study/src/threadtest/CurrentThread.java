package threadtest;

public class CurrentThread extends Thread {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("pisal");
		System.out.println(t.getName());
		System.out.println(t.getId());	
	}
}
