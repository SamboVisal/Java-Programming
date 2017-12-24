package file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Filewriter {
	//FileInputStream and FileOutputStream are working with byte array
	public static void main(String[] args)
	{
		char ch[] = new char[100];
		Scanner s = new Scanner(System.in);
		try 
		{
			FileWriter fw = new FileWriter("D:\\stream\\hello.txt");
			System.out.println("Enter text");
			String t = s.next();
			ch=t.toCharArray();
			fw.write(ch);
			System.out.println(ch);
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
