package statickeyword;

public class Test1 {

	//this will own my class then we no need to create instance to call it
	static void my() {
		System.out.println("No object calling");
	}
	public static void main(String args[]) {
		
		my();
	}
}
