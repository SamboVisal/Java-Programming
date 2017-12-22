package presentation;

import java.io.File;

public class Test4Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\stream\\");
		File a[] = file.listFiles();
		if(file.exists()) {
			for(int i=0; i<a.length; i++) {
				a[i].delete();
			}
			System.out.println("The file have been deleted");
		}
		else {
			System.out.println("There is not file exist");
		}
	}

}
