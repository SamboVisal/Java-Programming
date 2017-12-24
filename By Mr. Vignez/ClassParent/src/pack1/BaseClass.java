package pack1;

public class BaseClass {
	public int a,b;
	private int n;
	public void demo1()
	{
		System.out.println("Function from baseclass");
		
	}
	public void get(int num){
		n = num;
	}
	public int ret(){
		return n;
	}
	public void out(){
		System.out.println("The result is " + ret());
	}
}
