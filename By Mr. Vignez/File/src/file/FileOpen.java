package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOpen 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try 
		{
			
			FileOutputStream fos = new FileOutputStream("D:\\stream\\hello.txt");
			String name = s.next();
			byte []b = name.getBytes();
			try {
				fos.write(b);
				System.out.println("done");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
