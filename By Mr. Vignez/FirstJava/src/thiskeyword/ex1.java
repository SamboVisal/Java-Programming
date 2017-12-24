package thiskeyword;

public class ex1 {
	int rno;
	String name;
	ex1(int rno, String name){
		this.rno=rno;
		this.name=name;
		
	}
	public void output(){
		System.out.println(rno);
		System.out.println(name);
		System.out.println("Hello from parent");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex1 cs = new ex1(1997,"Pisal");
		cs.output();
	}

}
