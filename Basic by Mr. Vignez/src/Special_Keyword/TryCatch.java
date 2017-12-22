package Special_Keyword;
import java.io.FileNotFoundException;


public class TryCatch {
	public static void openFile(String path) throws FileNotFoundException
	{
	//	InputStream f = new InputStream(path);
		System.out.println("done...");
	}
	public static void open() throws FileNotFoundException
	{
		openFile("D:\\Hello.txt");
	}
	public static void main(String[] args) throws FileNotFoundException 
	{
		
		try
		{
			open();
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
			System.out.println("File is not found");
		}
	}

}
