package runnableclass;

public class implementRunnable implements Runnable {
	String s[] = {"Welcome","To","Cambodia"};
	Thread t;
	implementRunnable()
	{
	t = new Thread(this,"Welcome to Runnable class");
	System.out.println("This is :" + t);
	t.start();
	}
	public void run(){
		
		for(int i=0; i<s.length; i++)
		{
			try 
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s[i]);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementRunnable ob = new implementRunnable();
		
	}

}
