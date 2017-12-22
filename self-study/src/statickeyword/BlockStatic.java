package statickeyword;
//Static variables are also known as Class Variables.
public class BlockStatic {
	static int num;
	static String name;
	static {
		System.out.println("Execute first");
		num =20;
		name = "Visal";
	}
	int n =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockStatic b = new BlockStatic();
//		System.out.println(b.n);
		System.out.println(num);
		System.out.println(name);
	}

}
