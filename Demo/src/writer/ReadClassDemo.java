package writer;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReadClassDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Reader reader = new FileReader("D:\\stream\\hello.txt");
		//int data = reader.read();
		//System.out.println(data);
		int i;
		
		while((i=reader.read())!=-1) {
			System.out.println(i);
		}
		
	}

}
