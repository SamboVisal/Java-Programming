package presentation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6Byte {

	private static FileInputStream fis;

	public static void main(String[] args)throws IOException 
	{
		byte[] b = new byte[10];
		fis = new FileInputStream("D:\\stream\\hello.txt");		
		fis.read(b);
		String s = new String(b);
		System.out.println(s);
				
		
	}

}