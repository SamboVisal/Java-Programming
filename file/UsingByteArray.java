package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UsingByteArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("D:\\stream\\hello.txt");
		FileInputStream fis=null;
		byte b[] = new byte[100];
		byte c[] = new byte[100];
		//File f = new File("D:\\Stream\\hello.txt")
		try {
			fis = new FileInputStream(file);
			try 
			{
				fis.read(b);
				String d = new String(b);
				System.out.println(d.trim());
			//	usingOffset
//				fis.read(c,0,5);
//				String s = new String(c);
//				System.out.println(s);
				
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
	
			try
			{
				System.out.println("NA trying to create a new one");
				file.createNewFile();
			//	fis=new FileInputStream(file);
				System.out.println("Opened for reading");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}

}
