package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Stream\\hello.txt");
		FileInputStream fis = null;
		try
		{
			int i = -1;
			fis = new FileInputStream(file);
			System.out.println("Yes");
			try {
				while((i=fis.read())!=-1)
				{
					System.out.println((char)i+" " + i);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e)
		{
			try 
			{
				file.createNewFile();
				System.out.println("The file has been created");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
	}

}
