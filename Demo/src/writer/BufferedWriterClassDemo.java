package writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClassDemo {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		FileWriter file = new FileWriter("D:\\stream\\hello.txt");
		BufferedWriter buffer = new BufferedWriter(file);
		char c = 'a';
		buffer.write(c);
		String str = "Pisal";
		buffer.write(str);
		buffer.flush();
		buffer.close();
		System.out.println("Done");
	}

}
