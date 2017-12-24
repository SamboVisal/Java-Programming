package thiskeyword;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ex3 {

	public static void openFile(String path) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(path);
		System.out.println("Success...");
	}
	public static void calopenFile() throws FileNotFoundException
	{
		openFile("D:\\Hello.txt");
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try
		{
			calopenFile();
		}
		catch(Exception e)
		{
			System.out.println("The file is not exist");
		}
	}

}
