package writer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("D:\\stream\\hello.txt");
		BufferedReader buffer = new BufferedReader(file);
	//	int k =buffer.read();
	//	System.out.println(k);
	//	String s = buffer.readLine();
	//	System.out.println(s);
		int k;
		while((k=buffer.read())!=-1) {
			
			System.out.print((char)k);
		}
		buffer.close();
		file.close();
		
	}

}
