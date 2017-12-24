package thiskeyword;

public class ex2 extends ex1{
	int rno;
	String name;
	public ex2(){
		super(100,"KOKO");
	//	this.rno=super.rno;
	//	this.name=super.name;
		System.out.println("child");
	}
	public void print()
	{
		System.out.println("Child class");
		super.output();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex2 child = new ex2();
		child.print();
	}

}
