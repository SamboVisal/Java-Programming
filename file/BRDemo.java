package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BRDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[] = new char[100];
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("D:\\stream\\hello.txt"));
//			try {
//				br.read(ch);
//				System.out.println(ch);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//we can use for loop
			int c;
			try {
				while((c=br.read())!=-1){
				System.out.println((char)c);	
				}
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
