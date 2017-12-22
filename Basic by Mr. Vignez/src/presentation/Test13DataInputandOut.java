package presentation;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test13DataInputandOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\stream\\binary.bin");
		FileInputStream dis = null;
		try {
			dis = new FileInputStream(file);
			try {
				dis.read();
				System.out.println("Read");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			try {
				file.createNewFile();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
		
	
		
	}

}
