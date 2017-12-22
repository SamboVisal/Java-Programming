package presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7ByteOff {

	public static void main(String[] args)throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\stream\\hello.txt");
		byte b[] = new byte[10];
		fis.read(b,3,5);
		String s = new String(b);
		System.out.println(s);
	}

}
