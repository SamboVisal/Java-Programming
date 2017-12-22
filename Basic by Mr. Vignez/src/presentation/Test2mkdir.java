package presentation;

import java.io.File;

public class Test2mkdir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File o = new File("D:\\stream\\hello\\world");
//		File o1 = new File("D:\\stream\\sak");
//		if(o.exists() && o1.exists()) {
//			System.out.println("THe folder is exist");
//
//		}
//		else {
//			o.mkdir();
//			o1.mkdir();
//			System.out.println("THe folder is created");
//		}
		if(o.exists()) {
			System.out.println("The folder is exist");
		}
		else {
			o.mkdirs();
			System.out.println("The folder are created");
		}
	}

}
