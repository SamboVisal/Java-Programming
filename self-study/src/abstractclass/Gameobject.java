package abstractclass;

public abstract class Gameobject {
	//not provide the implementation
	//this method should provide for all classes that extends Gameobject
	public abstract void draw();
	public abstract void menu();
	public abstract void shape();
	public void rac() {
		System.out.println("This is concrete function");
	}
	public static void main(String[] args) {
		//abstract prevent us to create instance because it hides the implementation
		// TODO Auto-generated method stub
		//this mean player refer to Gameobject
		
//		Gameobject player = new Player();
//		player.draw();
//		player.menu();
//		Menu menu = new Menu();
//		menu.draw();
//		menu.menu();
		Player p = new Player();
		p.draw();
		Gameobject g = new Player();
		g.rac();
		
		Menu m = new Menu();
		m.draw();
		
		
		Player go = new Player();
		go.hack();
		
		//Gameobject[] array = new Gameobject[2];
//		array[0] = menu;
//		array[1] = player;
//		for(Gameobject object: array) {
//			object.draw();
//		//	object.menu();
//		}
	}


}
