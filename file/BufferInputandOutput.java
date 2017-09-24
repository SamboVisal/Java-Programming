package file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputandOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[]b = new byte[100];
		try
		{
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\stream\\hello.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\stream\\hello.txt"));
		
			try {
				bis.read(b);
				bos.write(b);
				System.out.println(b);
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
