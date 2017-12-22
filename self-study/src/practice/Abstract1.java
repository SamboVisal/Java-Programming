package practice;

public abstract class Abstract1 {
	public abstract void show();
	public abstract void hide();
	public abstract void go();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract1 a = new Abstract2();
		a.show();
		a.go();
		Abstract1 b = new Abstract3();
		b.show();
		b.go();
		
	}

}
