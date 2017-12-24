package file;
//shortcut import ctr + shift + o
import java.io.File;

public class ListingFiles 
{
	public static void main(String[] args)
	{
		File folder = new File("D:\\filetest");
		if(folder.exists()){
			File f[] = folder.listFiles();
			for(int i=0;i<f.length;i++){
				System.out.println(f[i].getName());
			}
		}
		else{
			System.out.println("The folder is not exist");
		}
	}
}
