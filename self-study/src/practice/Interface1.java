package practice;

public class Interface1 implements Interface2,Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 face = new Interface1();
		face.show1();
			
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("This is show1");
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("This is show2");
	}

	@Override
	public void show3() {
		// TODO Auto-generated method stub
		System.out.println("This is show3");
	}

	@Override
	public void show4() {
		// TODO Auto-generated method stub
		
	}

}
