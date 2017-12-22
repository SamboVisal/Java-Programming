package synchronizedthread;
//Synchronized block can be used to perform synchronization on any specific resource of the method.
class Table{  
	  
	 void printTable(int n){  
	   synchronized(Table.class){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }
	   
	 }//end of the method  
	}  
	  
class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t) {  
	this.t=t;  
	
	}  
	
	public void run() {  
	t.printTable(5);  
	
	}  
	  
}  
class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	} 
public class SyncBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		MyThread1 t1 = new MyThread1(t);
		MyThread2 t2 = new MyThread2(t);
		t1.start();
		t2.start();
	}

}
