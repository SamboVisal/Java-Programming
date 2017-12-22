package interfacetest;


public class Obama extends Citizien implements President {
	@Override
	public void win() {
		// TODO Auto-generated method stub
		System.out.println("He will win");
	}

	@Override
	public void lose() {
		// TODO Auto-generated method stub
		System.out.println("He will lose");
	}
	@Override
	public void support() {
		// TODO Auto-generated method stub
		System.out.println("Support by people");
	}
	public static void fu() {
		System.out.println("no object");
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		President object = new Obama();
		Citizien o = new Obama();
		//Obama c = new Citizien();
		Citizien.real();
		object.win();
		object.support();
		fu();
		Obama.real();
		
	}

		

	
}
