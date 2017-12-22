package superkeyword;
//Use of super keyword to invoke constructor of parent class
class parentClass{
	parentClass(){
		System.out.println("Constructor of parents");
	}
}
public class Test2{
	Test2(){
		System.out.println("Constructor of child");
	}
	Test2(int n){
		System.out.println("Number of child "+n);
	}
	void dis() {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t = new Test2();
		t.dis();
		Test2 s = new Test2(20);
		s.dis();
	}

}
