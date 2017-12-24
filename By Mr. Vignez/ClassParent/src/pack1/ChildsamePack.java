package pack1;

public class ChildsamePack extends BaseClass{
	public int add(){
		int c;
		c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildsamePack csp = new ChildsamePack();
		csp.a = 100;
		csp.b = 200;
		csp.demo1();
		int k=csp.add();
		csp.get(k);
		csp.out();
		//System.out.println();
		//package in java are used to have collection of classes and interfaces
		//package are created are using package keyword in java
	}

}
