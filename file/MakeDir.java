package file;
import java.io.File;
public class MakeDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		String str = "D:\\filetest\\";
		for(int i=0;i<26;i++)
		{
			str+=ch;
			str+="\\";
			ch++;
		}
		File file = new File(str);
		if(file.exists())
		{
			System.out.println("the file exist");
		}
		else{
			file.mkdirs();
			System.out.println("folder created");
		}
	}

}
