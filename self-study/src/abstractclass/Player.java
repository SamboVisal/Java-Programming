package abstractclass;

public class Player extends Gameobject {
	int a = 5;
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("The players have " + a);
	}
	@Override
	public void menu() {
		// TODO Auto-generated method stub
		System.out.println("This is player menu");
	}
	public void hack() {
		System.out.println("Hacking");
	}
	@Override
	public void shape() {
		
	}

}
