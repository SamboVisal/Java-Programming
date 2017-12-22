package presentation;

import java.io.File;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		File obj_file = new File("D:\\stream\\hello.txt");
		if(obj_file.exists()) {
			System.out.println("The file is exist");
		}
		else {
			System.out.println("THe file is not eixst");
			try {
				obj_file.createNewFile();
				System.out.println("THe file is created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
