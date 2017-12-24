package file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStream {

	public static void main(String[] args)
	{
		byte b[] = new byte[200];
		//before create bufferedInputStream we have to create FileInputStream
		try {
			FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
		//	BufferedInputStream bis = new BufferedInputStream(fis);
			DataInputStream dis = new DataInputStream(fis);
			//bis not interact with hard disk , it will ask fis to finish job
			try 
			{
		//		bis.read(b);
				dis.read(b);
				String s = new String(b);
				System.out.println(s.trim());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				System.out.println("this is io exception");
			}
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
