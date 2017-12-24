package file;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FilesDemo {
	
	public static void main(String[] args) 
	{
		//if we don't provide extension it will create the folder
		// TODO Auto-generated method stub
		File file = new File("D:\\filetest\\hellao.txt");
		if(file.exists())
		{
			System.out.println("the file exists");
		}
		else{
			System.out.println("NA");
			int i = new Scanner(System.in).nextInt();
			try 
			{
				if(i==1){
					file.createNewFile();
					System.out.println("File created");
				}
			} catch (IOException e) {
				System.out.println("falied to create file");
			}
		}
	}

}
